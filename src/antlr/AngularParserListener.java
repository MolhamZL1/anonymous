// Generated from C:/Users/USER/Desktop/src/angularNoww/src/antlr/AngularParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentBody(AngularParser.ComponentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentBody(AngularParser.ComponentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#standaloneDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneDeclaration(AngularParser.StandaloneDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#standaloneDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneDeclaration(AngularParser.StandaloneDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDeclaration(AngularParser.TemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDeclaration(AngularParser.TemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#otherDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOtherDeclaration(AngularParser.OtherDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#otherDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOtherDeclaration(AngularParser.OtherDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(AngularParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(AngularParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(AngularParser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(AngularParser.ModuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(AngularParser.ExportStatementContext ctx);
}