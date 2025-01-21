package visitor;

import AST.*;

import AST.Expressions.*;

import HtmlAST.*;
import Symbol.SymbolTable;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends AngularParserBaseVisitor {
    SymbolTable symbolTable = new SymbolTable();

    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx) {

        Program program = new Program();
        if(ctx.getChild(0) instanceof AngularParser.HtmlDocumentContext ){
            program.addChild((HtmlDocument) visit(ctx.getChild(0)));
            return program;
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            program.addChild((ASTNode) visit(ctx.getChild(i)));
        }
        symbolTable.print();
        return program;
    }

    @Override
    public ASTNode visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();


        if (ctx.String() != null) {
            importStatement.setSource(ctx.String().getText().replace("\"", ""));
        }


        if (ctx.IDENTIFIER() != null) {

            importStatement.setDefaultImport(ctx.IDENTIFIER().getText());

        } else if (ctx.STAR() != null && ctx.AS() != null && ctx.IDENTIFIER() != null) {

            ImportSpecifier.Specifier wildcardSpecifier = new ImportSpecifier.Specifier("*",ctx.IDENTIFIER().getText());
            importStatement.setWildcardImport(wildcardSpecifier);
        } else if (ctx.importSpecifier() != null) {

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


            if (i + 1 < ctx.IDENTIFIER().size() && ctx.getChild(i * 2 + 1).getText().equals("as")) {
                alias = ctx.IDENTIFIER(i + 1).getText();
                i++;
            }

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
    public ASTNode visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        String name = null;

        String returnType = null;
        Block block = null;



        if (ctx.IDENTIFIER(0) != null) {
            name = ctx.IDENTIFIER(0).getText();
        }



        ParameterList parameters = (ParameterList) visit(ctx.parameterList());


        if (ctx.COLON() != null && ctx.IDENTIFIER(1) != null) {
            returnType = ctx.IDENTIFIER(1).getText();
        }


        if (ctx.block() != null) {
            block = (Block) visit(ctx.block());
        }
        FunctionDeclaration functionDeclaration =  new FunctionDeclaration(name, parameters, returnType, block);

        symbolTable.addSymbol("function",name,returnType!=null?"returns" +returnType:"returns void","global");

        return functionDeclaration;
    }
    @Override
    public ASTNode visitBlock(AngularParser.BlockContext ctx) {
        Block block = new Block();


        for (ParseTree child : ctx.children) {

            ASTNode statement = (ASTNode) visit(child);
            if (statement != null && statement instanceof Statement) {
                block.addStatment((Statement) statement);
            } else if (statement != null && statement instanceof ReturnStatement) {
                block.setReturnStatement((ReturnStatement) statement);
            }
        }

        return block;
    }

    @Override
    public ASTNode visitParameterList(AngularParser.ParameterListContext ctx) {

        ParameterList parameterList = new ParameterList();


        if (ctx.parameter() != null) {
            for (AngularParser.ParameterContext paramCtx : ctx.parameter()) {
                Parameter parameter = (Parameter) visit(paramCtx);
                parameterList.addParameter(parameter);
            }
        }

        return parameterList;
    }


    @Override
    public ASTNode visitParameter(AngularParser.ParameterContext ctx) {

        String paramName = ctx.IDENTIFIER(0).getText();


        return new Parameter(paramName);
    }



    @Override
    public ASTNode visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx) {


        if (ctx.arrowMethod() != null) {

            return (ASTNode) visit(ctx.arrowMethod());
        }


        String name = ctx.IDENTIFIER().get(0).getText();
        ParameterList parameterList = (ParameterList) visit(ctx.parameterList());
        String returnType = ctx.COLON() != null && ctx.IDENTIFIER(1) != null
                ? ctx.IDENTIFIER(1).getText()
                : null;
        Block block = (Block) visit(ctx.block());
        Modifier modifier=(Modifier) visit(ctx.modifier());
        symbolTable.addSymbol("method",name,returnType!=null?"returns" +returnType:"returns void","local");


        return new MethodDeclaration(name, modifier, parameterList, returnType, block);
    }


    @Override
    public ASTNode visitArrowMethod(AngularParser.ArrowMethodContext ctx) {

        Modifier modifier = ctx.modifier() != null ?(Modifier) visit( ctx.modifier()) : null;


        String name = ctx.IDENTIFIER(0) != null ? ctx.IDENTIFIER(0).getText() : null;


        ParameterList parameters = (ParameterList) visit(ctx.parameterList());


        String returnType = ctx.IDENTIFIER(1) != null ?ctx.IDENTIFIER().get(1).getText(): null;


        ArrowMethod arrowMethod = new ArrowMethod(modifier, name, parameters, returnType);


        if (ctx.statement() != null) {
            for (AngularParser.StatementContext statementCtx : ctx.statement()) {
                Statement statement = (Statement) visit(statementCtx);
                arrowMethod.addStatement(statement);
            }
        }
        if(name!=null)symbolTable.addSymbol("method",name,returnType!=null?"returns" +returnType:"returns void","local");;


        return arrowMethod;
    }


    @Override
    public ASTNode visitModifier(AngularParser.ModifierContext ctx) {
        if (ctx.PUBLIC() != null) {
            return new Modifier("PUBLIC");
        } else if (ctx.PRIVATE() != null) {
            return new Modifier("PRIVATE");
        } else if (ctx.PROTECTED() != null) {
            return new Modifier("PROTECTED");
        } else if (ctx.READONLY() != null) {
            return new Modifier("READONLY");
        } else if (ctx.STATIC() != null) {
            return new Modifier("STATIC");
        } else if (ctx.ABSTRACT() != null) {
            return new Modifier("ABSTRACT");
        } else if (ctx.FINAL() != null) {
            return new Modifier("FINAL");
        } else if (ctx.ASYNC() != null) {
            return new Modifier("async");
        } else if (ctx.EXPORT() != null) {
            return new Modifier("EXPORT");
        }
        return null;
    }

    @Override
    public ASTNode visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ASTNode modifier = ctx.modifier() != null ? (ASTNode) visit( ctx.modifier()) : null;
        String name = ctx.IDENTIFIER(0).getText();
        String parentOrInterface = null;

        if (ctx.EXTENDS() != null || ctx.IMPLEMENTS() != null) {
            parentOrInterface = ctx.IDENTIFIER(1).getText();
        }

        ClassDeclaration classDeclaration = new ClassDeclaration(modifier, name, parentOrInterface);

        if (ctx.classMember() != null) {
            for (AngularParser.ClassMemberContext memberCtx : ctx.classMember()) {
                classDeclaration.addMember((ClassMember) visit(memberCtx));
            }
        }
        symbolTable.addSymbol("class",name,"","global");

        return classDeclaration;
    }


    @Override
    public ASTNode visitClassMember(AngularParser.ClassMemberContext ctx) {
        if (ctx.inputDeclaration() != null) {
            return new ClassMember((ASTNode)visit(ctx.inputDeclaration()));
        } else if (ctx.outputDeclaration() != null) {
            return new ClassMember((ASTNode)visit(ctx.outputDeclaration()));
        } else if (ctx.methodDeclaration() != null) {
            return new ClassMember((ASTNode)visit(ctx.methodDeclaration()));
        } else if (ctx.propertyDeclaration() != null) {
            return new ClassMember((ASTNode)visit(ctx.propertyDeclaration()));
        } else if (ctx.variableDeclaration() != null) {
            return new ClassMember((ASTNode)visit(ctx.variableDeclaration()));
        } else if (ctx.objectDecleration() != null) {
            return new ClassMember((ASTNode)visit(ctx.objectDecleration()));
        } else if (ctx.constructorDecleration() != null) {
            return new ClassMember((ASTNode)visit(ctx.constructorDecleration()));
        } else if (ctx.ngOn() != null) {
            return new ClassMember((ASTNode)visit(ctx.ngOn()));
        }
        return null;
    }


    @Override
    public ASTNode visitNgOn(AngularParser.NgOnContext ctx) {

        String type = ctx.NGONINIT() != null ? ctx.NGONINIT().getText() : ctx.NGONCHANGES().getText();


        ParameterList parameters = (ParameterList) visit(ctx.parameterList());


        String returnType = ctx.COLON() != null && ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : null;


        Block block = ctx.block() != null ? (Block) visit(ctx.block()) : null;


        NgOn ngOn = new NgOn(type,parameters, returnType, block);
        symbolTable.addSymbol(type,"ngOn",returnType!=null?"returns" +returnType:"returns void","local");



        return ngOn;
    }


    @Override
    public Object visitConstructorDecleration(AngularParser.ConstructorDeclerationContext ctx) {

        ParameterList parameters = (ParameterList) visit(ctx.parameterList());

            Block block = ctx.block() != null ? (Block) visit(ctx.block()) : null;


            ConstructorDeclaration constructorDeclaration = new ConstructorDeclaration(parameters,block);


            return constructorDeclaration;


    }

    @Override
    public ASTNode visitInputDeclaration(AngularParser.InputDeclarationContext ctx) {

        Literal literal = null;
        if (ctx.literal() != null) {
            literal = (Literal) visit(ctx.literal());
        }
        Property property = null;
        if (ctx.property() != null) {
            property = (Property) visit(ctx.property());
        }


        InputDeclaration inputDeclaration = new InputDeclaration(literal, property);

        return inputDeclaration;
    }


    public ASTNode visitOutputDeclaration(AngularParser.OutputDeclarationContext ctx) {

        Literal literal = ctx.literal() != null ? (Literal) visit(ctx.literal()) : null;


        ObjectDeclaration objectDeclaration = (ObjectDeclaration) visit(ctx.objectDecleration());

        return new OutputDeclaration(literal, objectDeclaration);
    }



    @Override
    public ASTNode visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        String modifier = null;
        String type = null;
        String name = ctx.IDENTIFIER(0).getText();
        ASTNode expression = null;
        ASTNode initialValue = null;
        String alias = null;


        if (ctx.modifier() != null) {
            modifier = ctx.modifier().getText();
        }


        if (ctx.type() != null) {
            type = ctx.type().getText();
        }


        if (ctx.expression(0) != null) {
            expression = (ASTNode) visit(ctx.expression(0));
        }


        if (ctx.expression(1) != null) {
            initialValue = (Expression) visit(ctx.expression(1));
        }


        if (ctx.AS() != null) {
            alias = ctx.IDENTIFIER(1).getText();
        }

        if (type!=null){
            if(expression instanceof Literal literal){
                symbolTable.addSymbol(type,name,literal.getType(),"local");
            }
            else{
            symbolTable.addSymbol(type,name,"expression","local");
            }
        }

        return new VariableDeclaration(modifier, type, name, expression, initialValue, alias);
    }


    @Override
    public ASTNode visitType(AngularParser.TypeContext ctx) {

        String typeText = ctx.getText();
        return new Type(typeText);
    }

    @Override
    public ASTNode visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx) {

        Modifier modifier = ctx.modifier() != null ? (Modifier) visit(ctx.modifier()) : null;


        Property property = (Property) visit(ctx.property());


        ASTNode value = ctx.expression() != null ?(ASTNode) visit(ctx.expression()) : null;


        return new PropertyDeclaration(modifier, property, value);
    }


    @Override
    public ASTNode visitProperty(AngularParser.PropertyContext ctx) {
        if (ctx.imports() != null) {
            Imports imports = (Imports) visit(ctx.imports());
            return new Property("imports", imports);
        }

        String name = ctx.IDENTIFIER().getText();
        ASTNode value =(ASTNode) visit(ctx.expression());
        if (value!=null){
            if(value instanceof Literal literal){
                symbolTable.addSymbol("property",name,literal.getType(),"local");
            }
            else{
                symbolTable.addSymbol("property",name,"expression","local");
            }
        }

        return new Property(name, value);
    }




    @Override
    public ASTNode visitObjectDecleration(AngularParser.ObjectDeclerationContext ctx) {

        ASTNode propertyOrObjectName =(ASTNode) visit(ctx.property() != null ? ctx.property() : ctx.objectName());


        ObjectInit objectInit = (ObjectInit) visit(ctx.objectInit());



        return new ObjectDeclaration(propertyOrObjectName, objectInit);
    }

    @Override
    public ASTNode visitObjectName(AngularParser.ObjectNameContext ctx) {
        String name = ctx.IDENTIFIER().getText(); // Get the IDENTIFIER
        ObjectType type = null;


        if (ctx.objectType() != null) {
            type = (ObjectType) visit(ctx.objectType());
        }


        return new ObjectName(name, type);
    }

    @Override
    public ASTNode visitObjectInit(AngularParser.ObjectInitContext ctx) {
        String className = ctx.IDENTIFIER().getText(); // Get the class name (IDENTIFIER)
        ObjectType objectType = null;


        if (ctx.objectType() != null) {
            objectType = (ObjectType) visit(ctx.objectType());
        }


        ObjectInit objectInit = new ObjectInit(className, objectType);


        if (ctx.expression() != null) {
            for (AngularParser.ExpressionContext exprCtx : ctx.expression()) {
                objectInit.addArgument((ASTNode) visit(exprCtx));
            }
        }

        return objectInit;
    }

    @Override
    public ASTNode visitObjectType(AngularParser.ObjectTypeContext ctx) {
        ObjectType objectType = new ObjectType();


        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            String identifier = ctx.IDENTIFIER(i).getText();


            ASTNode list = null;
            if (ctx.list(i) != null) {
                list = (ASTNode) visit(ctx.list(i));
            }

            objectType.addType(identifier, list);
        }

        return objectType;
    }


    @Override
    public ASTNode visitObjectLiteral(AngularParser.ObjectLiteralContext ctx) {
        ObjectLiteral objectLiteral = new ObjectLiteral();


        for (AngularParser.PropertyContext propertyCtx : ctx.property()) {
            Property property = (Property) visit(propertyCtx);
            objectLiteral.addProperty(property);
        }

        return objectLiteral;
    }


    @Override
    public ASTNode visitLiteral(AngularParser.LiteralContext ctx) {

        if (ctx.Integer() != null) {
            String sign = ctx.PLUS() != null ? "+" : ctx.MINUS() != null ? "-" : "";
            return new Literal(sign + ctx.Integer().getText(), "Integer");
        }


        if (ctx.Float() != null) {
            String sign = ctx.PLUS() != null ? "+" : ctx.MINUS() != null ? "-" : "";
            return new Literal(sign + ctx.Float().getText(), "Float");
        }


        if (ctx.String() != null) {
            return new Literal(ctx.String().getText(), "String");
        }

        // Handle booleans
        if (ctx.Boolean() != null) {
            return new Literal(Boolean.valueOf(ctx.Boolean().getText()), "Boolean");
        }


        if (ctx.Null() != null) {
            return new Literal(null, "Null");
        }


        if (ctx.Undefined() != null) {
            return new Literal("undefined", "Undefined");
        }


        if (ctx.THIS() != null) {
            return new Literal("this", "This");
        }

        return null; // Default case (should not be reached)
    }

    @Override
    public ASTNode visitStatement(AngularParser.StatementContext ctx) {
        if (ctx.variableDeclaration() != null) {
            return new Statement((ASTNode) visit(ctx.variableDeclaration()));
        } else if (ctx.objectDecleration() != null) {
            return new Statement((ASTNode)visit(ctx.objectDecleration()));
        } else if (ctx.ifStatement() != null) {
            return new Statement((ASTNode)visit(ctx.ifStatement()));
        } else if (ctx.forStatement() != null) {
            return new Statement((ASTNode)visit(ctx.forStatement()));
        } else if (ctx.whileStatement() != null) {
            return new Statement((ASTNode)visit(ctx.whileStatement()));
        } else if (ctx.expressionStatement() != null) {
            return new Statement((ASTNode)visit(ctx.expressionStatement()));
        }
        return null;
    }

    @Override
    public Object visitExpressionList(AngularParser.ExpressionListContext ctx) {
        ASTNode expression = (ASTNode) visit(ctx.expression());
        ListStructure list = (ListStructure) visit(ctx.list());
        return new ExpressionList(expression, list);
    }

    @Override
    public ASTNode visitObjectLiteralExpression(AngularParser.ObjectLiteralExpressionContext ctx) {
        return new ExistingExpression((ASTNode) visit(ctx.objectLiteral())).expression;
    }

    @Override
    public ASTNode visitObjectDeclarationExpression(AngularParser.ObjectDeclarationExpressionContext ctx) {
        return new ExistingExpression((ASTNode) visit(ctx.objectDecleration())).expression;
    }

    @Override
    public ASTNode visitObjectNameExpression(AngularParser.ObjectNameExpressionContext ctx) {
        return new ExistingExpression((ASTNode) visit(ctx.objectName())).expression;
    }

    @Override
    public ASTNode visitArrowMethodExpression(AngularParser.ArrowMethodExpressionContext ctx) {
        return new ExistingExpression((ASTNode) visit(ctx.arrowMethod())).expression;
    }

    @Override
    public Object visitAssignmentExpression(AngularParser.AssignmentExpressionContext ctx) {
        ASTNode left = (ASTNode) visit(ctx.expression());
        ASTNode right = ctx.literal() != null ? (ASTNode) visit(ctx.literal()) : (ASTNode) visit(ctx.dataStructure());
        return new AssignmentExpression(left, right);
    }

    @Override
    public Object visitThisExpression(AngularParser.ThisExpressionContext ctx) {
        return new ThisExpression();
    }

    @Override
    public Object visitIdentifierExpression(AngularParser.IdentifierExpressionContext ctx) {
        return new IdentifierExpression(ctx.IDENTIFIER().getText());
    }

    @Override
    public Object visitPostIncrementExpression(AngularParser.PostIncrementExpressionContext ctx) {
        return new PostIncrementExpression(ctx.IDENTIFIER().getText());
    }

    @Override
    public Object visitPostDecrementExpression(AngularParser.PostDecrementExpressionContext ctx) {
        return new PostDecrementExpression(ctx.IDENTIFIER().getText());
    }

    @Override
    public ASTNode visitLiteralExpression(AngularParser.LiteralExpressionContext ctx) {

        return new ExistingExpression((ASTNode) visit(ctx.literal())).expression;
    }

    @Override
    public ASTNode visitCallingMethodExpression(AngularParser.CallingMethodExpressionContext ctx) {

        return new ExistingExpression((ASTNode) visit(ctx.callingMethod())).expression;
    }

    @Override
    public Object visitDotExpression(AngularParser.DotExpressionContext ctx) {
        ASTNode left = (ASTNode) visit(ctx.expression(0));
        ASTNode right = (ASTNode) visit(ctx.expression(1));
        return new DotExpression(left, right);
    }

    @Override
    public Object visitComparisonExpression(AngularParser.ComparisonExpressionContext ctx) {
        ASTNode left = (ASTNode) visit(ctx.expression(0));
        String operator = ctx.compersion().getText();
        ASTNode right = (ASTNode) visit(ctx.expression(1));
        return new ComparisonExpression(left, operator, right);
    }

    @Override
    public Object visitOperatorExpression(AngularParser.OperatorExpressionContext ctx) {
        ASTNode left = (ASTNode) visit(ctx.expression(0));
        String operator = ctx.operator().getText();
        ASTNode right = (ASTNode) visit(ctx.expression(1));
        return new OperatorExpression(left, operator, right);
    }

    @Override
    public Object visitGenericTypeExpression(AngularParser.GenericTypeExpressionContext ctx) {
        ASTNode innerExpression = (ASTNode) visit(ctx.expression());
        String identifier = ctx.IDENTIFIER().getText();
        return new GenericTypeExpression(innerExpression, identifier);
    }

    @Override
    public Object visitTypeCastExpression(AngularParser.TypeCastExpressionContext ctx) {
        ASTNode innerExpression = (ASTNode) visit(ctx.expression());
        String typeIdentifier = ctx.IDENTIFIER().getText();
        return new TypeCastExpression(innerExpression, typeIdentifier);
    }

    @Override
    public ASTNode visitDataStructureExpression(AngularParser.DataStructureExpressionContext ctx) {
        return new ExistingExpression((ASTNode) visit(ctx.dataStructure())).expression;
    }


    @Override
    public ASTNode visitIfStatement(AngularParser.IfStatementContext ctx) {
        if (ctx.shortIf() != null) {

            return (ASTNode) visit(ctx.shortIf());
        }
        if (ctx.arrowIf() != null) {

            return (ASTNode) visit(ctx.arrowIf());
        }

        ASTNode condition = (ASTNode) visit(ctx.expression());
        Block block = (Block) visit(ctx.block());


        IfStatement ifStatement = new IfStatement(condition, block);


        for (AngularParser.ElseIfStatmentContext elseIfCtx : ctx.elseIfStatment()) {
            ElseIfStatement elseIfStatement = (ElseIfStatement) visit(elseIfCtx);
            ifStatement.addElseIfStatement(elseIfStatement);
        }


        if (ctx.elseStatment() != null) {
            ElseStatement elseStatement = (ElseStatement) visit(ctx.elseStatment());
            ifStatement.setElseStatement(elseStatement);
        }

        return ifStatement;
    }


    @Override
    public ASTNode visitElseIfStatment(AngularParser.ElseIfStatmentContext ctx) {

        ASTNode condition = (ASTNode) visit(ctx.expression());
        Block block = (Block) visit(ctx.block());


        return new ElseIfStatement(condition, block);
    }


    @Override
    public ASTNode visitElseStatment(AngularParser.ElseStatmentContext ctx) {
        Block block = (Block) visit(ctx.block());


        return new ElseStatement(block);
    }

    @Override
    public ASTNode visitShortIf(AngularParser.ShortIfContext ctx) {

        ASTNode expression = (ASTNode) visit(ctx.expression());
        Statement statement = (Statement) visit(ctx.statement());


        ShortIf shortIf = new ShortIf(expression, statement);


        for (AngularParser.ShortElseIfContext shortElseIfCtx : ctx.shortElseIf()) {
            ShortElseIf shortElseIf = (ShortElseIf) visit(shortElseIfCtx);
            shortIf.addShortElseIf(shortElseIf);
        }


        ShortElse shortElse = (ShortElse) visit(ctx.shortelse());
        shortIf.setShortElse(shortElse);

        return shortIf;
    }


    @Override
    public ASTNode visitShortElseIf(AngularParser.ShortElseIfContext ctx) {

        Expression expression = (Expression) visit(ctx.expression());
        Statement statement = (Statement) visit(ctx.statement());
        return new ShortElseIf(expression, statement);
    }

    @Override
    public ASTNode visitShortelse(AngularParser.ShortelseContext ctx) {


            Statement statement = (Statement) visit(ctx.statement());
            return new ShortElse(statement);


    }

    @Override
    public ASTNode visitArrowIf(AngularParser.ArrowIfContext ctx) {

        Expression condition = (Expression) visit(ctx.expression(0));


        Expression result = (Expression) visit(ctx.expression(1));


        return new ArrowIf(condition, result);
    }


    @Override
    public ASTNode visitForStatement(AngularParser.ForStatementContext ctx) {

        ASTNode initializer = ctx.variableDeclaration() != null
                ? (ASTNode) visit(ctx.variableDeclaration())
                : ctx.expression(0) != null
                ? (ASTNode) visit(ctx.expression(0))
                : null;

        ASTNode condition = ctx.expression(1) != null ? (ASTNode) visit(ctx.expression(1)) : null;
        ASTNode increment = ctx.expression(2) != null ? (ASTNode) visit(ctx.expression(2)) : null;
        Block block = (Block) visit(ctx.block());


        return new ForStatement(initializer, condition, increment, block);
    }


    @Override
    public ASTNode visitWhileStatement(AngularParser.WhileStatementContext ctx) {

        ASTNode condition = (ASTNode) visit(ctx.expression());
        Block block = (Block) visit(ctx.block());


        return new WhileStatement(condition, block);
    }


    @Override
    public ASTNode visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) {

        ASTNode expression = (ASTNode) visit(ctx.expression());
        return new ExpressionStatement(expression);
    }


    @Override
    public ASTNode visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        ASTNode expression = null;


        if (ctx.expression() != null) {
            expression =(ASTNode) visit(ctx.expression());
        }

        return new ReturnStatement(expression);
    }

    @Override
    public ASTNode visitCallingMethod(AngularParser.CallingMethodContext ctx) {

        String methodName = ctx.IDENTIFIER(0) != null ? ctx.IDENTIFIER(0).getText() : ctx.CATCH().getText();


        CallingMethod callingMethod = new CallingMethod(methodName);


        if (ctx.expression() != null) {
            for (var exprCtx : ctx.expression()) {
                callingMethod.addArgument((ASTNode) visit(exprCtx));
            }
        }


        if (ctx.DOT() != null) {
            for (int i = 0; i < ctx.DOT().size(); i++) {

                if (ctx.callingMethod(i) != null) {
                    callingMethod.addChainedCall((ASTNode) visit(ctx.callingMethod(i)));
                } else if (ctx.IDENTIFIER(i) != null) {
                    callingMethod.addChainedCall(ctx.IDENTIFIER(i).getText());
                } else if (ctx.dataStructure(i) != null) {
                    callingMethod.addChainedCall((ASTNode) visit(ctx.dataStructure(i)));
                }
            }
        }

        return callingMethod;
    }



    @Override
    public ASTNode visitDataStructure(AngularParser.DataStructureContext ctx) {
        if (ctx.list() != null) {
            return new DataStructure((ASTNode) visit(ctx.list()));
        }
        if (ctx.map() != null) {
            return new DataStructure((ASTNode) visit(ctx.map()));
        }
        return null;
    }

    @Override
    public ASTNode visitItemsStructures(AngularParser.ItemsStructuresContext ctx) {
        if (ctx.literal() != null) {
            return new ItemsStructures((ASTNode) visit(ctx.literal()));
        }
        if (ctx.IDENTIFIER() != null) {
            return new ItemsStructures(ctx.IDENTIFIER().getText());
        }
        if (ctx.list() != null) {
            return new ItemsStructures((ASTNode) visit(ctx.list()));
        }
        if (ctx.map() != null) {
            return new ItemsStructures((ASTNode) visit(ctx.map()));
        }
        if (ctx.callingMethod() != null) {
            return new ItemsStructures((ASTNode) visit(ctx.callingMethod()));
        }
        return null;
    }


    @Override
    public ASTNode visitMap(AngularParser.MapContext ctx) {
        MapStructure map = new MapStructure();

        if (ctx.itemsStructures().size() % 2 == 0) {
            for (int i = 0; i < ctx.itemsStructures().size(); i += 2) {
                ItemsStructures key = (ItemsStructures) visit(ctx.itemsStructures(i));
                ItemsStructures value = (ItemsStructures) visit(ctx.itemsStructures(i + 1));
                map.addEntry(key, value);
            }
        }

        return map;
    }

    @Override
    public ASTNode visitList(AngularParser.ListContext ctx) {
        ListStructure list = new ListStructure();

        if (ctx.itemsStructures() != null) {
            for (AngularParser.ItemsStructuresContext itemCtx : ctx.itemsStructures()) {
                list.addItem((ItemsStructures) visit(itemCtx));
            }
        }

        return list;
    }

    @Override
    public ASTNode visitOperator(AngularParser.OperatorContext ctx) {
        if (ctx.EQUAL() != null) return new Operator("=");
        if (ctx.getChild(0) != ctx.PLUS()&&ctx.getChild(1) == ctx.EQUAL()) return new Operator("+=");
        if (ctx.getChild(0) != ctx.MINUS()&&ctx.getChild(1) == ctx.EQUAL()) return new Operator("-=");
        if (ctx.MINUS() != null) return new Operator("-");
        if (ctx.STAR() != null) return new Operator("*");
        if (ctx.DIVIDE() != null) return new Operator("/");
        if (ctx.PLUS() != null) return new Operator("+");
        if (ctx.MINUS() != null) return new Operator("-");
        return null;
    }

    @Override
    public ASTNode visitCompersion(AngularParser.CompersionContext ctx) {
        if (ctx.GREATER_THAN() != null) return new Comparison(">");
        if (ctx.LESS_THAN() != null) return new Comparison("<");
        if (ctx.GREATER_THAN_OR_EQUAL() != null) return new Comparison(">=");
        if (ctx.LESS_THAN_OR_EQUAL() != null) return new Comparison("<=");
        if (ctx.NOT_EQUAL() != null) return new Comparison("!=");
        if (ctx.EQUAL_TO() != null) return new Comparison("==");
        if (ctx.AND() != null) return new Comparison("&&");
        if (ctx.OR() != null) return new Comparison("||");
        if (ctx.EQUAL_TO3() != null) return new Comparison("===");
        if (ctx.NOT_EQUAL2() != null) return new Comparison("!==");
        return null;
    }



    @Override
    public HtmlDocument visitHtmlDocument(AngularParser.HtmlDocumentContext ctx) {
        HtmlDocument htmlDocument = new HtmlDocument();


        for (AngularParser.ScriptletOrSeaWsContext scriptletCtx : ctx.scriptletOrSeaWs()) {

            htmlDocument.addPreXmlScriptlets(visitScriptletOrSeaWs(scriptletCtx));
        }


        if (ctx.XML() != null) {
            htmlDocument.setXmlDeclaration(ctx.XML().getText());
        }


        for (AngularParser.ScriptletOrSeaWsContext scriptletCtx : ctx.scriptletOrSeaWs()) {
            htmlDocument.setPreDtdScriptlets(visitScriptletOrSeaWs(scriptletCtx));
        }


        if (ctx.DTD() != null) {
            htmlDocument.setDtdDeclaration(ctx.DTD().getText());
        }


        for (AngularParser.ScriptletOrSeaWsContext scriptletCtx : ctx.scriptletOrSeaWs()) {
            htmlDocument.setPostDtdScriptlets(visitScriptletOrSeaWs(scriptletCtx));
        }

        System.out.println(ctx);

        for (AngularParser.HtmlElementsContext htmlElementsCtx : ctx.htmlElements()) {
            HtmlElements htmlElements=(HtmlElements) visitHtmlElements(htmlElementsCtx);

            htmlDocument.setHtmlElements(htmlElements);
        }

        return htmlDocument;
    }


    @Override
    public ScriptletOrSeaWs visitScriptletOrSeaWs(AngularParser.ScriptletOrSeaWsContext ctx) {

        if (ctx.SCRIPTLET() != null) {
            return new ScriptletOrSeaWs(ctx.SCRIPTLET().getText());
        } else if (ctx.SEA_WS() != null) {
            return new ScriptletOrSeaWs(ctx.SEA_WS().getText());
        } else {
            return null;
        }
    }

    @Override
    public HtmlElements visitHtmlElements(AngularParser.HtmlElementsContext ctx) {
        HtmlElements htmlElements = new HtmlElements();

        boolean hasHtmlElement = ctx.htmlElement() != null;


        if (hasHtmlElement) {
            for (int i = 0; i < ctx.htmlMisc().size(); i++) {
                if (ctx.htmlMisc(i) == ctx.htmlElement().getParent()) {
                    break;
                }
                ASTNode preMisc = (ASTNode) visit(ctx.htmlMisc(i));
                htmlElements.addPreMisc(preMisc);
            }
        }


        if (hasHtmlElement) {
            HtmlElement htmlElement = (HtmlElement) visit(ctx.htmlElement());
            htmlElements.setHtmlElement(htmlElement);
        }


        if (hasHtmlElement) {
            boolean startPostMisc = false;
            for (AngularParser.HtmlMiscContext miscContext : ctx.htmlMisc()) {
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
    public HtmlElement visitHtmlElement(AngularParser.HtmlElementContext ctx) {
        HtmlElement htmlElement = new HtmlElement();


        if (ctx.TAG_NAME(0) != null) {
            htmlElement.setTagName(ctx.TAG_NAME(0).getText());
        } else {

            htmlElement.setTagName("unknown");
        }


        if (ctx.htmlAttribute() != null) {
            for (AngularParser.HtmlAttributeContext attrCtx : ctx.htmlAttribute()) {
                htmlElement.getAttributes().add(visitHtmlAttribute(attrCtx));
            }
        }


        if (ctx.TAG_NAME(1) != null) {
            htmlElement.setClosingTagName(ctx.TAG_NAME(1).getText());
        }

        return htmlElement;
    }


    @Override
    public ASTNode visitHtmlContent(AngularParser.HtmlContentContext ctx) {
        HtmlContent content = new HtmlContent();


        if (ctx.htmlChardata() != null) {
            for (AngularParser.HtmlChardataContext chardataCtx : ctx.htmlChardata()) {
                HtmlChardata chardata = (HtmlChardata) visit(chardataCtx);
                content.addChardata(chardata);
            }
        }


        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.getChild(i) instanceof AngularParser.HtmlElementContext) {
                HtmlElement htmlElement = (HtmlElement) visit(ctx.getChild(i));
                content.addHtmlElement(htmlElement);
            } else if (ctx.getChild(i) instanceof AngularParser.HtmlCommentContext) {
                HtmlComment comment = (HtmlComment) visit(ctx.getChild(i));
                content.addHtmlComment(comment);
            } else {

                String nodeText = ctx.getChild(i).getText();
                if (nodeText.startsWith("<![CDATA[") && nodeText.endsWith("]]>")) {
                    String cdataText = nodeText.substring(9, nodeText.length() - 3);
                    CDATA cdata = new CDATA(cdataText);
                    content.addCdata(cdata);
                }
            }
        }

        return content;
    }

    @Override
    public ASTNode visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx) {

        String name = ctx.TAG_NAME().getText();


        if (ctx.ATTVALUE_VALUE() != null) {
            String value = ctx.ATTVALUE_VALUE().getText();
            return new HtmlAttribute(name, value);
        }


        return new HtmlAttribute(name);
    }
    @Override
    public ASTNode visitHtmlChardata(AngularParser.HtmlChardataContext ctx) {

        if (ctx.SEA_WS() != null) {
            String whitespaceContent = ctx.SEA_WS().getText();
            return new HtmlChardata(whitespaceContent, true);
        }


        String htmlTextContent = ctx.HTML_TEXT().getText();
        return new HtmlChardata(htmlTextContent);
    }
    @Override
    public ASTNode visitHtmlMisc(AngularParser.HtmlMiscContext ctx) {

        if (ctx.htmlComment() != null) {

            return visitHtmlComment(ctx.htmlComment());
        }


        String whitespaceContent = ctx.SEA_WS().getText();
        return new HtmlMisc(whitespaceContent, true);
    }
    @Override
    public ASTNode visitHtmlComment(AngularParser.HtmlCommentContext ctx) {

        boolean isConditional = ctx.HTML_CONDITIONAL_COMMENT() != null;


        String commentContent = isConditional
                ? ctx.HTML_CONDITIONAL_COMMENT().getText()
                : ctx.HTML_COMMENT().getText();


        return new HtmlComment(commentContent, isConditional);
    }

    @Override
    public ASTNode visitScript(AngularParser.ScriptContext ctx) {

        boolean isShortBody = ctx.getText().contains("</>");
        String scriptContent = ctx.SCRIPT_BODY() != null ? ctx.SCRIPT_BODY().getText() : ctx.SCRIPT_SHORT_BODY().getText();


        return new Script(scriptContent, isShortBody);
    }

    @Override
    public ASTNode visitStyle(AngularParser.StyleContext ctx) {

        boolean isShortBody = ctx.getText().contains("</>");
        String styleContent = ctx.STYLE_BODY() != null ? ctx.STYLE_BODY().getText() : ctx.STYLE_SHORT_BODY().getText();


        return new Style(styleContent, isShortBody);
    }
}