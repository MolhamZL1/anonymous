// Generated from C:/Users/USER/Desktop/src/angularNoww/src/antlr/html/HtmlParser.g4 by ANTLR 4.13.1
package antlr.html;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlParser}.
 */
public interface HtmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HtmlParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HtmlParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(HtmlParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(HtmlParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(HtmlParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(HtmlParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HtmlParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HtmlParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HtmlParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HtmlParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HtmlParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HtmlParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(HtmlParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(HtmlParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(HtmlParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(HtmlParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(HtmlParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(HtmlParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(HtmlParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(HtmlParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(HtmlParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(HtmlParser.StyleContext ctx);
}