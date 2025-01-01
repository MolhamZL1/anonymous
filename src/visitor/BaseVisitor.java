package visitor;

import AST.*;
import Symbol.SymbolTable;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BaseVisitor extends AngularParserBaseVisitor {
    SymbolTable symbolTable = new SymbolTable();

    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx) {
        Program program = new Program();
        for (int i = 0; i < ctx.children.size(); i++) {
            program.addChild((ASTNode) visit(ctx.getChild(i)));
        }
        return program;
    }

    @Override
    public ASTNode visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        symbolTable.addRow("]sad","ctx.IDENTIFIER().getText()");
        // Set the source module
        if (ctx.String() != null) {
            importStatement.setSource(ctx.String().getText().replace("\"", ""));
        }

        // Handle the different types of imports
        if (ctx.IDENTIFIER() != null) {
            // Default import
            importStatement.setDefaultImport(ctx.IDENTIFIER().getText());

        } else if (ctx.STAR() != null && ctx.AS() != null && ctx.IDENTIFIER() != null) {
            // Wildcard import
            ImportSpecifier.Specifier wildcardSpecifier = new ImportSpecifier.Specifier("*",ctx.IDENTIFIER().getText());
            importStatement.setWildcardImport(wildcardSpecifier);
        } else if (ctx.importSpecifier() != null) {
            // Named imports
            ImportSpecifier namedSpecifier = (ImportSpecifier) visit(ctx.importSpecifier());
            importStatement.getNamedImports().add(namedSpecifier);
        }

        return importStatement;
    }


    @Override
    public ASTNode visitImportSpecifier(AngularParser.ImportSpecifierContext ctx) {
        ImportSpecifier importSpecifier = new ImportSpecifier();

        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            String id = ctx.IDENTIFIER(i).getText();
            String alias = null;

            // Check if the current identifier has an alias by inspecting the next token
            if (i + 1 < ctx.IDENTIFIER().size() && ctx.getChild(i * 2 + 1).getText().equals("as")) {
                alias = ctx.IDENTIFIER(i + 1).getText();
                i++; // Skip the alias identifier
            }
            // Add each specifier with its alias (if any)
            importSpecifier.addSpecifier(id, alias);
        }

        return importSpecifier;
    }

    @Override
    public ASTNode visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        ComponentDeclaration component = new ComponentDeclaration();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof AngularParser.SelectorContext) {
                component.setSelector((Selector) visit(child));
            } else if (child instanceof AngularParser.StandaloneContext) {
                component.setStandalone((Standalone) visit(child));
            } else if (child instanceof AngularParser.ImportsContext) {
                component.setImports((Imports) visit(child));
            } else if (child instanceof AngularParser.UrlContext) {
                if (child.getText().startsWith("templateUrl")) {
                    component.setTemplateUrl((Url) visit(child));
                } else if (child.getText().startsWith("styleUrl")) {
                    component.setStyleUrl((Url) visit(child));
                }
            } else if (child instanceof AngularParser.TamplateContext) {
                component.setTemplate((Template) visit(child));
            }
        }

        return component;
    }



    @Override
    public ASTNode visitSelector(AngularParser.SelectorContext ctx) {
        return new Selector(ctx.String().getText().replace("\"", ""));
    }

    @Override
    public ASTNode visitStandalone(AngularParser.StandaloneContext ctx) {
        return new Standalone(Boolean.parseBoolean(ctx.Boolean().getText()));
    }

    @Override
    public ASTNode visitImports(AngularParser.ImportsContext ctx) {
       Imports imports= new Imports();

        for (TerminalNode identifier : ctx.IDENTIFIER()) {
            imports.addChild(identifier.getText());
        }
        return imports;
    }

    @Override
    public ASTNode visitUrl(AngularParser.UrlContext ctx) {
        return new Url(ctx.String().getText().replace("\"", ""));
    }

    @Override
    public ASTNode visitTamplate(AngularParser.TamplateContext ctx) {
        return new Template(ctx.html().getText());
    }

    @Override
    public Object visitHtml(AngularParser.HtmlContext ctx) {
        return super.visitHtml(ctx);
    }

    @Override
    public Object visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        return super.visitFunctionDeclaration(ctx);
    }

    @Override
    public Object visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx) {
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public Object visitArrowMethod(AngularParser.ArrowMethodContext ctx) {
        return super.visitArrowMethod(ctx);
    }

    @Override
    public Object visitBlock(AngularParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Object visitParameterList(AngularParser.ParameterListContext ctx) {
        return super.visitParameterList(ctx);
    }

    @Override
    public Object visitParameter(AngularParser.ParameterContext ctx) {
        return super.visitParameter(ctx);
    }

    @Override
    public Object visitModifier(AngularParser.ModifierContext ctx) {
        return super.visitModifier(ctx);
    }

    @Override
    public Object visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public Object visitClassMember(AngularParser.ClassMemberContext ctx) {
        return super.visitClassMember(ctx);
    }

    @Override
    public Object visitNgOn(AngularParser.NgOnContext ctx) {
        return super.visitNgOn(ctx);
    }

    @Override
    public Object visitConstructorDecleration(AngularParser.ConstructorDeclerationContext ctx) {
        return super.visitConstructorDecleration(ctx);
    }

    @Override
    public Object visitInputDeclaration(AngularParser.InputDeclarationContext ctx) {
        return super.visitInputDeclaration(ctx);
    }

    @Override
    public Object visitOutputDeclaration(AngularParser.OutputDeclarationContext ctx) {
        return super.visitOutputDeclaration(ctx);
    }

    @Override
    public Object visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        return super.visitVariableDeclaration(ctx);
    }

    @Override
    public Object visitType(AngularParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Object visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx) {
        return super.visitPropertyDeclaration(ctx);
    }

    @Override
    public Object visitProperty(AngularParser.PropertyContext ctx) {
        return super.visitProperty(ctx);
    }

    @Override
    public Object visitObjectDecleration(AngularParser.ObjectDeclerationContext ctx) {
        return super.visitObjectDecleration(ctx);
    }

    @Override
    public Object visitObjectName(AngularParser.ObjectNameContext ctx) {
        return super.visitObjectName(ctx);
    }

    @Override
    public Object visitObjectInit(AngularParser.ObjectInitContext ctx) {
        return super.visitObjectInit(ctx);
    }

    @Override
    public Object visitObjectType(AngularParser.ObjectTypeContext ctx) {
        return super.visitObjectType(ctx);
    }

    @Override
    public Object visitObjectLiteral(AngularParser.ObjectLiteralContext ctx) {
        return super.visitObjectLiteral(ctx);
    }

    @Override
    public Object visitLiteral(AngularParser.LiteralContext ctx) {
        return super.visitLiteral(ctx);
    }

    @Override
    public Object visitStatement(AngularParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitExpression(AngularParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Object visitIfStatement(AngularParser.IfStatementContext ctx) {
        return super.visitIfStatement(ctx);
    }

    @Override
    public Object visitShortIf(AngularParser.ShortIfContext ctx) {
        return super.visitShortIf(ctx);
    }

    @Override
    public Object visitArrowIf(AngularParser.ArrowIfContext ctx) {
        return super.visitArrowIf(ctx);
    }

    @Override
    public Object visitForStatement(AngularParser.ForStatementContext ctx) {
        return super.visitForStatement(ctx);
    }

    @Override
    public Object visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        return super.visitWhileStatement(ctx);
    }

    @Override
    public Object visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) {
        return super.visitExpressionStatement(ctx);
    }

    @Override
    public Object visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        return super.visitReturnStatement(ctx);
    }


    @Override
    public Object visitCallingMethod(AngularParser.CallingMethodContext ctx) {
        return super.visitCallingMethod(ctx);
    }

    @Override
    public Object visitDataStructure(AngularParser.DataStructureContext ctx) {
        return super.visitDataStructure(ctx);
    }

    @Override
    public Object visitItemsStructures(AngularParser.ItemsStructuresContext ctx) {
        return super.visitItemsStructures(ctx);
    }

    @Override
    public Object visitMap(AngularParser.MapContext ctx) {
        return super.visitMap(ctx);
    }

    @Override
    public Object visitList(AngularParser.ListContext ctx) {
        return super.visitList(ctx);
    }

    @Override
    public Object visitOperator(AngularParser.OperatorContext ctx) {
        return super.visitOperator(ctx);
    }

    @Override
    public Object visitCompersion(AngularParser.CompersionContext ctx) {
        return super.visitCompersion(ctx);
    }
}