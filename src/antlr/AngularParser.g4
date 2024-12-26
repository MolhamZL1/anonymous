parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

program
    : (importStatement | componentDeclaration | classDeclaration | functionDeclaration | statement)* EOF;

// Modifier Rules
modifier : PUBLIC | PRIVATE | PROTECTED | READONLY | STATIC | ABSTRACT | FINAL | ASYNC|EXPORT;

importStatement
    : IMPORT (IDENTIFIER | STAR AS IDENTIFIER | LCURLY IDENTIFIER (COMMA IDENTIFIER)* RCURLY) FROM String SEMI;

componentDeclaration
    : COMPONENT LPAREN LCURLY componentparameters* RCURLY RPAREN ;
    componentparameters: ((selector|standalone|imports|url|tamplate) COMMA)|(selector|standalone|imports|url|tamplate) ;
selector:SELECTOR COLON String;
standalone:STANDALONE COLON Boolean;
imports:IMPORTS COLON LSBRACKET (IDENTIFIER (COMMA IDENTIFIER)*)? RSBRACKET;
url:(TEMPLATEURL|STYLEURL) COLON String;
tamplate: TEMPLATE COLON html;
html:;

classDeclaration
    :(modifier)? CLASS IDENTIFIER ((EXTENDS| IMPLEMENTS) IDENTIFIER)? LCURLY (classMember)* RCURLY;

classMember
    : inputDeclaration
    | outputDeclaration
    | methodDeclaration
    | propertyDeclaration|objectDecleration
    | constructorDecleration
    | ngOn

    ;

ngOn
:(NGONINIT|NGONCHANGES) parameterList (COLON IDENTIFIER?)? block;

constructorDecleration
:CONSTRUCTOR parameterList block;



inputDeclaration
    : INPUT LPAREN (literal)? RPAREN expression? SEMI;

outputDeclaration
    : OUTPUT LPAREN (literal)? RPAREN expression? SEMI;

methodDeclaration
    :(modifier)? IDENTIFIER parameterList (COLON IDENTIFIER?)? block
    |shortMethod;

    shortMethod:IDENTIFIER parameterList ARROW LCURLY? statement* RCURLY?;

    functionDeclaration
        : FUNCTION IDENTIFIER parameterList block
        |shortFunction;

        shortFunction:parameterList ARROW (LCURLY statement* RCURLY)?;

        block
            : LCURLY statement* RCURLY;

            parameter
                : IDENTIFIER COLON IDENTIFIER;

            parameterList
            :LPAREN (parameter (COMMA parameter)*)? RPAREN;




ifStatement
    : IF LPAREN expression (compersion expression)? RPAREN block (ELSEIF LPAREN expression (compersion expression)? RPAREN block)* (ELSE block)?
    |shortIf|arrowIf;
shortIf:LPAREN? expression (compersion expression)? RPAREN? QUESITIONMARK LPAREN?  statement RPAREN?  (COLON LPAREN? expression (compersion expression)? RPAREN? QUESITIONMARK LPAREN?  statement RPAREN? )* COLON LPAREN?  statement RPAREN? ;
arrowIf:LPAREN? expression (compersion expression)? RPAREN? ARROW expression;
forStatement
    : FOR LPAREN (variableDeclaration | expression)? SEMI expression? SEMI expression? RPAREN block;

whileStatement
    : WHILE LPAREN expression RPAREN block;

expressionStatement
    : expression SEMI?;

returnStatement
    : RETURN expression? SEMI;

statement
    : variableDeclaration
    |objectDecleration
    | ifStatement

    | forStatement
    | whileStatement
    |returnStatement
    | expressionStatement
    ;
expression
    :

      expression DOT expression
    | expression list|objectDecleration
    | shortMethod
    | expression compersion expression
    | expression operator expression
    |literal
             | IDENTIFIER
             | list
             |callingMethod
    ;

    callingMethod
    :IDENTIFIER LPAREN (expression (COMMA expression)*)? RPAREN;

    list:LSBRACKET ((literal|IDENTIFIER) (COMMA (literal|IDENTIFIER))*)? RSBRACKET;

operator
    : EQUAL | PLUS | MINUS | STAR | DIVIDE |PLUS EQUAL|MINUS EQUAL;

    compersion
    :GREATER_THAN|LESS_THAN|GREATER_THAN_OR_EQUAL|LESS_THAN_OR_EQUAL|NOT_EQUAL|EQUAL_TO| AND | OR|EQUAL_TO3|NOT_EQUAL2;

literal
    : (PLUS | MINUS)? Integer |(PLUS | MINUS)? Float | String | Boolean | Null | Undefined|THIS;

objectLiteral : LCURLY (property (COMMA property)*)? RCURLY;


                 objectDecleration
                 :property|objectName EQUAL objectInit SEMI;
objectName:IDENTIFIER (LESS_THAN IDENTIFIER (COMMA IDENTIFIER)* GREATER_THAN)?;
objectInit:NEW IDENTIFIER (LESS_THAN IDENTIFIER* GREATER_THAN)?  LPAREN (expression (COMMA expression)*)? RPAREN;
propertyDeclaration
    :(modifier)? property (EQUAL expression)? SEMI;
     property
                     :IDENTIFIER COLON expression;
variableDeclaration
    :(modifier)? type IDENTIFIER (COLON expression)? (EQUAL expression)? SEMI?;

    type:
    (CONST | LET | VAR);