package visitor;

import AST.ASTNode;
import HtmlAST.*;
import antlr.html.HtmlParser;
import antlr.html.HtmlParserBaseVisitor;

public class HtmlBaseVisitor extends HtmlParserBaseVisitor<ASTNode> {

    @Override
    public HtmlDocument visitHtmlDocument(HtmlParser.HtmlDocumentContext ctx) {
        HtmlDocument htmlDocument = new HtmlDocument();

        // Pre-XML scriptletOrSeaWs
        for (HtmlParser.ScriptletOrSeaWsContext scriptletCtx : ctx.scriptletOrSeaWs()) {

            htmlDocument.addPreXmlScriptlets(visitScriptletOrSeaWs(scriptletCtx));
        }

        // XML Declaration
        if (ctx.XML() != null) {
            htmlDocument.setXmlDeclaration(ctx.XML().getText());
        }

        // Pre-DTD scriptletOrSeaWs
        for (HtmlParser.ScriptletOrSeaWsContext scriptletCtx : ctx.scriptletOrSeaWs()) {
            htmlDocument.setPreDtdScriptlets(visitScriptletOrSeaWs(scriptletCtx));
        }

        // DTD Declaration
        if (ctx.DTD() != null) {
            htmlDocument.setDtdDeclaration(ctx.DTD().getText());
        }

        // Post-DTD scriptletOrSeaWs
        for (HtmlParser.ScriptletOrSeaWsContext scriptletCtx : ctx.scriptletOrSeaWs()) {
            htmlDocument.setPostDtdScriptlets(visitScriptletOrSeaWs(scriptletCtx));
        }

        System.out.println(ctx);
        // HtmlElements
        for (HtmlParser.HtmlElementsContext htmlElementsCtx : ctx.htmlElements()) {
            HtmlElements htmlElements=(HtmlElements) visitHtmlElements(htmlElementsCtx);
            System.out.println("nommm");
            htmlDocument.setHtmlElements(htmlElements);
        }

        return htmlDocument;
    }


    @Override
    public ScriptletOrSeaWs visitScriptletOrSeaWs(HtmlParser.ScriptletOrSeaWsContext ctx) {
        // Extract content based on the type of match
        if (ctx.SCRIPTLET() != null) {
            return new ScriptletOrSeaWs(ctx.SCRIPTLET().getText());
        } else if (ctx.SEA_WS() != null) {
            return new ScriptletOrSeaWs(ctx.SEA_WS().getText());
        } else {
            return null; // Handle unexpected case
        }
    }

    @Override
    public HtmlElements visitHtmlElements(HtmlParser.HtmlElementsContext ctx) {
        HtmlElements htmlElements = new HtmlElements();

        boolean hasHtmlElement = ctx.htmlElement() != null;

        // Process preMisc (before htmlElement)
        if (hasHtmlElement) {
            for (int i = 0; i < ctx.htmlMisc().size(); i++) {
                if (ctx.htmlMisc(i) == ctx.htmlElement().getParent()) {
                    break; // Stop adding to preMisc when we reach htmlElement
                }
                ASTNode preMisc = (ASTNode) visit(ctx.htmlMisc(i));
                htmlElements.addPreMisc(preMisc);
            }
        }

        // Process the main htmlElement
        if (hasHtmlElement) {
            HtmlElement htmlElement = (HtmlElement) visit(ctx.htmlElement());
            htmlElements.setHtmlElement(htmlElement);
        }

        // Process postMisc (after htmlElement)
        if (hasHtmlElement) {
            boolean startPostMisc = false;
            for (HtmlParser.HtmlMiscContext miscContext : ctx.htmlMisc()) {
                if (startPostMisc) {
                    HtmlMisc postMisc = (HtmlMisc) visit(miscContext);
                    htmlElements.addPostMisc(postMisc);
                }
                if (miscContext == ctx.htmlElement().getParent()) {
                    startPostMisc = true;
                }
            }
        }

        return htmlElements;
    }
    @Override
    public HtmlElement visitHtmlElement(HtmlParser.HtmlElementContext ctx) {
        HtmlElement htmlElement = new HtmlElement();

        // Handle opening tag name
        if (ctx.TAG_NAME(0) != null) {
            htmlElement.setTagName(ctx.TAG_NAME(0).getText());
        } else {
            System.err.println("Warning: Missing opening TAG_NAME in HtmlElement.");
            htmlElement.setTagName("unknown");
        }

        // Handle attributes
        if (ctx.htmlAttribute() != null) {
            for (HtmlParser.HtmlAttributeContext attrCtx : ctx.htmlAttribute()) {
                htmlElement.getAttributes().add(visitHtmlAttribute(attrCtx));
            }
        }

        // Handle closing tag name
        if (ctx.TAG_NAME(1) != null) {
            htmlElement.setClosingTagName(ctx.TAG_NAME(1).getText());
        } else {
            System.err.println("Warning: Missing closing TAG_NAME in HtmlElement.");
        }

        return htmlElement;
    }


    @Override
    public ASTNode visitHtmlContent(HtmlParser.HtmlContentContext ctx) {
        HtmlContent content = new HtmlContent();

        // Process htmlChardata (text and whitespace)
        if (ctx.htmlChardata() != null) {
            for (HtmlParser.HtmlChardataContext chardataCtx : ctx.htmlChardata()) {
                HtmlChardata chardata = (HtmlChardata) visit(chardataCtx);
                content.addChardata(chardata);
            }
        }

        // Process htmlElements and comments
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.getChild(i) instanceof HtmlParser.HtmlElementContext) {
                HtmlElement htmlElement = (HtmlElement) visit(ctx.getChild(i));
                content.addHtmlElement(htmlElement);
            } else if (ctx.getChild(i) instanceof HtmlParser.HtmlCommentContext) {
                HtmlComment comment = (HtmlComment) visit(ctx.getChild(i));
                content.addHtmlComment(comment);
            } else {
                // Check for CDATA-like content manually in the text
                String nodeText = ctx.getChild(i).getText();
                if (nodeText.startsWith("<![CDATA[") && nodeText.endsWith("]]>")) {
                    String cdataText = nodeText.substring(9, nodeText.length() - 3); // Remove <![CDATA[ and ]]>
                    CDATA cdata = new CDATA(cdataText);
                    content.addCdata(cdata);
                }
            }
        }

        return content;
    }

    @Override
    public ASTNode visitHtmlAttribute(HtmlParser.HtmlAttributeContext ctx) {
        // Extract the attribute name
        String name = ctx.TAG_NAME().getText();

        // Check if the attribute has a value (TAG_EQUALS followed by ATTVALUE_VALUE)
        if (ctx.ATTVALUE_VALUE() != null) {
            String value = ctx.ATTVALUE_VALUE().getText();
            return new HtmlAttribute(name, value);
        }

        // If no value is present, return an attribute with only the name (e.g., "checked")
        return new HtmlAttribute(name);
    }
    @Override
    public ASTNode visitHtmlChardata(HtmlParser.HtmlChardataContext ctx) {
        // Check if it's whitespace (SEA_WS)
        if (ctx.SEA_WS() != null) {
            String whitespaceContent = ctx.SEA_WS().getText();
            return new HtmlChardata(whitespaceContent, true);
        }

        // Otherwise, it must be HTML text (HTML_TEXT)
        String htmlTextContent = ctx.HTML_TEXT().getText();
        return new HtmlChardata(htmlTextContent);
    }
    @Override
    public ASTNode visitHtmlMisc(HtmlParser.HtmlMiscContext ctx) {
        // Check if it's a comment
        if (ctx.htmlComment() != null) {
            // Visit the htmlComment and return it
            return visitHtmlComment(ctx.htmlComment());
        }

        // Otherwise, it must be whitespace (SEA_WS)
        String whitespaceContent = ctx.SEA_WS().getText();
        return new HtmlMisc(whitespaceContent, true);
    }
    @Override
    public ASTNode visitHtmlComment(HtmlParser.HtmlCommentContext ctx) {
        // Check if it's a conditional comment (e.g., <!--[if IE]> comment <![endif]-->)
        boolean isConditional = ctx.HTML_CONDITIONAL_COMMENT() != null;

        // Get the comment content
        String commentContent = isConditional
                ? ctx.HTML_CONDITIONAL_COMMENT().getText()
                : ctx.HTML_COMMENT().getText();

        // Return a new HtmlComment AST node
        return new HtmlComment(commentContent, isConditional);
    }

    @Override
    public ASTNode visitScript(HtmlParser.ScriptContext ctx) {
        // Check if the body is short or full
        boolean isShortBody = ctx.getText().contains("</>"); // Just an example, adjust accordingly
        String scriptContent = ctx.SCRIPT_BODY() != null ? ctx.SCRIPT_BODY().getText() : ctx.SCRIPT_SHORT_BODY().getText();

        // Return a new Script AST node
        return new Script(scriptContent, isShortBody);
    }

    @Override
    public ASTNode visitStyle(HtmlParser.StyleContext ctx) {
        // Check if the body is short or full
        boolean isShortBody = ctx.getText().contains("</>"); // Just an example, adjust accordingly
        String styleContent = ctx.STYLE_BODY() != null ? ctx.STYLE_BODY().getText() : ctx.STYLE_SHORT_BODY().getText();

        // Return a new Style AST node
        return new Style(styleContent, isShortBody);
    }
}
