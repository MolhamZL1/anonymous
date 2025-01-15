package visitor;

import AST.*;
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
    public ASTNode visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        String name = null;

        String returnType = null;
        Block block = null;


        // Extract function name if present
        if (ctx.IDENTIFIER(0) != null) {
            name = ctx.IDENTIFIER(0).getText();
        }

        // Extract and collect parameters directly into a List

        ParameterList parameters = (ParameterList) visit(ctx.parameterList());

        // Extract return type if present
        if (ctx.COLON() != null && ctx.IDENTIFIER(1) != null) {
            returnType = ctx.IDENTIFIER(1).getText();
        }

        // Visit block
        if (ctx.block() != null) {
            block = (Block) visit(ctx.block());
        }
        FunctionDeclaration functionDeclaration =  new FunctionDeclaration(name, parameters, returnType, block);
        // Add the parameters directly to the FunctionDeclaration

        return functionDeclaration;
    }
    @Override
    public ASTNode visitBlock(AngularParser.BlockContext ctx) {
        Block block = new Block();

        // Iterate through each child in the block context
        for (ParseTree child : ctx.children) {
            // Visit each child and cast to ASTNode
            ASTNode statement = (ASTNode) visit(child);
            if (statement != null && statement instanceof Statment) {
                block.addStatment((Statment) statement);
            } else if (statement != null && statement instanceof ReturnStatement) {
                block.setReturnStatement((ReturnStatement) statement);
            }
        }

        return block;
    }

    @Override
    public ASTNode visitParameterList(AngularParser.ParameterListContext ctx) {
        // Create a new ParameterList instance
        ParameterList parameterList = new ParameterList();

        // Visit each parameter and add to the parameter list
        if (ctx.parameter() != null) {
            for (AngularParser.ParameterContext paramCtx : ctx.parameter()) {
                Parameter parameter = (Parameter) visit(paramCtx); // Visit each parameter
                parameterList.addParameter(parameter); // Add to the list
            }
        }

        return parameterList;
    }


    @Override
    public ASTNode visitParameter(AngularParser.ParameterContext ctx) {
        // Create a Parameter with the name from the context
        String paramName = ctx.IDENTIFIER(0).getText();
        return new Parameter(paramName);
    }



    @Override
    public Object visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx) {
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public ASTNode visitArrowMethod(AngularParser.ArrowMethodContext ctx) {
        // Extract the optional modifier (e.g., PUBLIC, PRIVATE)
        String modifier = ctx.modifier() != null ? ctx.modifier().getText() : null;

        // Extract the optional method name (IDENTIFIER)
        String name = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().get(0).getText() : null;

        // Extract the parameter list
        ParameterList parameters = (ParameterList) visit(ctx.parameterList());

        // Extract the optional return type (IDENTIFIER)
        String returnType = ctx.IDENTIFIER() != null ?ctx.IDENTIFIER().get(0).getText(): null;

        // Create a new ArrowMethod instance
        ArrowMethod arrowMethod = new ArrowMethod(modifier, name, parameters, returnType);

        // Extract the statements inside the method block
        if (ctx.statement() != null) {
            for (AngularParser.StatementContext statementCtx : ctx.statement()) {
                Statement statement = (Statement) visit(statementCtx);
                arrowMethod.addStatement(statement);
            }
        }

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
            return new Modifier("ASYNC");
        } else if (ctx.EXPORT() != null) {
            return new Modifier("EXPORT");
        }
        return null; // In case no match is found
    }

    @Override
    public ASTNode visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        String modifier = ctx.modifier() != null ? ctx.modifier().getText() : null;
        String name = ctx.IDENTIFIER(0).getText();
        String parentOrInterface = null;

        if (ctx.EXTENDS() != null || ctx.IMPLEMENTS() != null) {
            parentOrInterface = ctx.IDENTIFIER(1).getText();
        }

        ClassDeclaration classDeclaration = new ClassDeclaration(modifier, name, parentOrInterface);

        if (ctx.classMember() != null) {
            for (AngularParser.ClassMemberContext memberCtx : ctx.classMember()) {
                classDeclaration.addMember((ASTNode) visit(memberCtx));
            }
        }

        return classDeclaration;
    }


    @Override
    public Object visitClassMember(AngularParser.ClassMemberContext ctx) {
        return super.visitClassMember(ctx);
    }

    @Override
    public ASTNode visitNgOn(AngularParser.NgOnContext ctx) {
        // Determine the type (NGONINIT or NGONCHANGES)
        String type = ctx.NGONINIT() != null ? ctx.NGONINIT().getText() : ctx.NGONCHANGES().getText();

        // Extract and process parameters
        ParameterList parameters = (ParameterList) visit(ctx.parameterList());

        // Determine the return type if specified
        String returnType = ctx.COLON() != null && ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : null;

        // Visit the block
        Block block = ctx.block() != null ? (Block) visit(ctx.block()) : null;

        // Create and populate the NgOn node
        NgOn ngOn = new NgOn(type,parameters, returnType, block);


        return ngOn;
    }


    @Override
    public Object visitConstructorDecleration(AngularParser.ConstructorDeclerationContext ctx) {

        ParameterList parameters = (ParameterList) visit(ctx.parameterList());
            // Visit the block
            Block block = ctx.block() != null ? (Block) visit(ctx.block()) : null;

            // Create and populate the ConstructorDeclaration node
            ConstructorDeclaration constructorDeclaration = new ConstructorDeclaration(parameters,block);


            return constructorDeclaration;


    }

    @Override
    public ASTNode visitInputDeclaration(AngularParser.InputDeclarationContext ctx) {
        // Extract the literal if present
        Literal literal = null;
        if (ctx.literal() != null) {
            literal = (Literal) visit(ctx.literal());
        }
        Property property = null;
        if (ctx.property() != null) {
            property = (Property) visit(ctx.property());
        }

        // Create the InputDeclaration node
        InputDeclaration inputDeclaration = new InputDeclaration(literal, property);

        return inputDeclaration;
    }


    public ASTNode visitOutputDeclaration(AngularParser.OutputDeclarationContext ctx) {
        // Extract the optional literal (expression)
        Literal literal = ctx.literal() != null ? (Literal) visit(ctx.literal()) : null;

        // Extract the object declaration
        ObjectDeclaration objectDeclaration = (ObjectDeclaration) visit(ctx.objectDecleration());

        return new OutputDeclaration(literal, objectDeclaration);
    }



    @Override
    public Object visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        return super.visitVariableDeclaration(ctx);
    }

    @Override
    public ASTNode visitType(AngularParser.TypeContext ctx) {

        String typeText = ctx.getText();
        return new Type(typeText);
    }

    @Override
    public ASTNode visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx) {
        // Parse the modifier if present
        Modifier modifier = ctx.modifier() != null ? (Modifier) visit(ctx.modifier()) : null;

        // Visit the property
        Property property = (Property) visit(ctx.property());

        // Visit the assigned value if present
        ASTNode value = ctx.expression() != null ?(ASTNode) visit(ctx.expression()) : null;

        // Create and return the PropertyDeclaration AST node
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

        return new Property(name, value);
    }




    @Override
    public ASTNode visitObjectDecleration(AngularParser.ObjectDeclerationContext ctx) {
        // Visit property or object name (could be a Property or ObjectName)
        ASTNode propertyOrObjectName =(ASTNode) visit(ctx.property() != null ? ctx.property() : ctx.objectName());

        // Visit object initialization
        ObjectInit objectInit = (ObjectInit) visit(ctx.objectInit());



        return new ObjectDeclaration(propertyOrObjectName, objectInit);
    }

    @Override
    public ASTNode visitObjectName(AngularParser.ObjectNameContext ctx) {
        String name = ctx.IDENTIFIER().getText(); // Get the IDENTIFIER
        ObjectType type = null;

        // If objectType exists, visit it
        if (ctx.objectType() != null) {
            type = (ObjectType) visit(ctx.objectType());
        }

        return new ObjectName(name, type);
    }

    @Override
    public ASTNode visitObjectInit(AngularParser.ObjectInitContext ctx) {
        String className = ctx.IDENTIFIER().getText(); // Get the class name (IDENTIFIER)
        ObjectType objectType = null;

        // If objectType exists, visit and parse it
        if (ctx.objectType() != null) {
            objectType = (ObjectType) visit(ctx.objectType());
        }

        // Create ObjectInit instance
        ObjectInit objectInit = new ObjectInit(className, objectType);

        // Visit and add arguments (expressions) if present
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

        // Iterate through each IDENTIFIER and optional list
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            String identifier = ctx.IDENTIFIER(i).getText();

            // Check if a list is present for this identifier
            List<ASTNode> list = null;
            if (ctx.list(i) != null) {
                list = (List<ASTNode>) visit(ctx.list(i));
            }

            objectType.addType(identifier, list);
        }

        return objectType;
    }


    @Override
    public ASTNode visitObjectLiteral(AngularParser.ObjectLiteralContext ctx) {
        ObjectLiteral objectLiteral = new ObjectLiteral();

        // Visit each property in the object literal
        for (AngularParser.PropertyContext propertyCtx : ctx.property()) {
            Property property = (Property) visit(propertyCtx);
            objectLiteral.addProperty(property);
        }

        return objectLiteral;
    }


    @Override
    public ASTNode visitLiteral(AngularParser.LiteralContext ctx) {
        // Handle signed integers
        if (ctx.Integer() != null) {
            String sign = ctx.PLUS() != null ? "+" : ctx.MINUS() != null ? "-" : "";
            return new Literal(sign + ctx.Integer().getText(), "Integer");
        }

        // Handle signed floats
        if (ctx.Float() != null) {
            String sign = ctx.PLUS() != null ? "+" : ctx.MINUS() != null ? "-" : "";
            return new Literal(sign + ctx.Float().getText(), "Float");
        }

        // Handle strings
        if (ctx.String() != null) {
            return new Literal(ctx.String().getText(), "String");
        }

        // Handle booleans
        if (ctx.Boolean() != null) {
            return new Literal(Boolean.valueOf(ctx.Boolean().getText()), "Boolean");
        }

        // Handle null
        if (ctx.Null() != null) {
            return new Literal(null, "Null");
        }

        // Handle undefined
        if (ctx.Undefined() != null) {
            return new Literal("undefined", "Undefined");
        }

        // Handle 'this'
        if (ctx.THIS() != null) {
            return new Literal("this", "This");
        }

        return null; // Default case (should not be reached)
    }

    @Override
    public ASTNode visitStatement(AngularParser.StatementContext ctx) {
        if (ctx.variableDeclaration() != null) {
            return new Statment((ASTNode) visit(ctx.variableDeclaration()));
        } else if (ctx.objectDecleration() != null) {
            return new Statment((ASTNode)visit(ctx.objectDecleration()));
        } else if (ctx.ifStatement() != null) {
            return new Statment((ASTNode)visit(ctx.ifStatement()));
        } else if (ctx.forStatement() != null) {
            return new Statment((ASTNode)visit(ctx.forStatement()));
        } else if (ctx.whileStatement() != null) {
            return new Statment((ASTNode)visit(ctx.whileStatement()));
        } else if (ctx.expressionStatement() != null) {
            return new Statment((ASTNode)visit(ctx.expressionStatement()));
        }
        return null; // In case no match is found
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
    public ASTNode visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        ASTNode expression = null;

        // Visit the expression if it exists
        if (ctx.expression() != null) {
            expression =(ASTNode) visit(ctx.expression());
        }

        return new ReturnStatement(expression);
    }

    @Override
    public Object visitCallingMethod(AngularParser.CallingMethodContext ctx) {
        return super.visitCallingMethod(ctx);
    }

    @Override
    public ASTNode visitDataStructure(AngularParser.DataStructureContext ctx) {
        if (ctx.list() != null) {
            return new DataStructure((ASTNode) visit(ctx.list()));
        }
        if (ctx.map() != null) {
            return new DataStructure((ASTNode) visit(ctx.map()));
        }
        return null; // Shouldn't occur if the grammar is correctly enforced
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
}