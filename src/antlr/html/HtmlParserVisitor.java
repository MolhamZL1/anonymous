// Generated from C:/Users/USER/Desktop/src/angularNoww/src/antlr/html/HtmlParser.g4 by ANTLR 4.13.1
package antlr.html;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HtmlParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(HtmlParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(HtmlParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HtmlParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HtmlParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HtmlParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(HtmlParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(HtmlParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(HtmlParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(HtmlParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(HtmlParser.StyleContext ctx);
}