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
	 * Enter a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecifier(AngularParser.ImportSpecifierContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(AngularParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(AngularParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 */
	void enterStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 */
	void exitStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(AngularParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(AngularParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(AngularParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(AngularParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#tamplate}.
	 * @param ctx the parse tree
	 */
	void enterTamplate(AngularParser.TamplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#tamplate}.
	 * @param ctx the parse tree
	 */
	void exitTamplate(AngularParser.TamplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(AngularParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(AngularParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrowMethod}.
	 * @param ctx the parse tree
	 */
	void enterArrowMethod(AngularParser.ArrowMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrowMethod}.
	 * @param ctx the parse tree
	 */
	void exitArrowMethod(AngularParser.ArrowMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(AngularParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(AngularParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(AngularParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(AngularParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngOn}.
	 * @param ctx the parse tree
	 */
	void enterNgOn(AngularParser.NgOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngOn}.
	 * @param ctx the parse tree
	 */
	void exitNgOn(AngularParser.NgOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorDecleration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDecleration(AngularParser.ConstructorDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorDecleration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDecleration(AngularParser.ConstructorDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInputDeclaration(AngularParser.InputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInputDeclaration(AngularParser.InputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#outputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOutputDeclaration(AngularParser.OutputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#outputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOutputDeclaration(AngularParser.OutputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AngularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AngularParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(AngularParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectDecleration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDecleration(AngularParser.ObjectDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectDecleration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDecleration(AngularParser.ObjectDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectName}.
	 * @param ctx the parse tree
	 */
	void enterObjectName(AngularParser.ObjectNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectName}.
	 * @param ctx the parse tree
	 */
	void exitObjectName(AngularParser.ObjectNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectInit}.
	 * @param ctx the parse tree
	 */
	void enterObjectInit(AngularParser.ObjectInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectInit}.
	 * @param ctx the parse tree
	 */
	void exitObjectInit(AngularParser.ObjectInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(AngularParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(AngularParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AngularParser.LiteralContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#shortIf}.
	 * @param ctx the parse tree
	 */
	void enterShortIf(AngularParser.ShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#shortIf}.
	 * @param ctx the parse tree
	 */
	void exitShortIf(AngularParser.ShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrowIf}.
	 * @param ctx the parse tree
	 */
	void enterArrowIf(AngularParser.ArrowIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrowIf}.
	 * @param ctx the parse tree
	 */
	void exitArrowIf(AngularParser.ArrowIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#callingMethod}.
	 * @param ctx the parse tree
	 */
	void enterCallingMethod(AngularParser.CallingMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#callingMethod}.
	 * @param ctx the parse tree
	 */
	void exitCallingMethod(AngularParser.CallingMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#dataStructure}.
	 * @param ctx the parse tree
	 */
	void enterDataStructure(AngularParser.DataStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#dataStructure}.
	 * @param ctx the parse tree
	 */
	void exitDataStructure(AngularParser.DataStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#itemsStructures}.
	 * @param ctx the parse tree
	 */
	void enterItemsStructures(AngularParser.ItemsStructuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#itemsStructures}.
	 * @param ctx the parse tree
	 */
	void exitItemsStructures(AngularParser.ItemsStructuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(AngularParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(AngularParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(AngularParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(AngularParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(AngularParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(AngularParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#compersion}.
	 * @param ctx the parse tree
	 */
	void enterCompersion(AngularParser.CompersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#compersion}.
	 * @param ctx the parse tree
	 */
	void exitCompersion(AngularParser.CompersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(AngularParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(AngularParser.EosContext ctx);
}