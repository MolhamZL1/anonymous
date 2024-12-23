parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

program
    : (importStatement | componentDeclaration | classDeclaration | functionDeclaration | statement)* EOF;

// Modifier Rules
modifier : PUBLIC | PRIVATE | PROTECTED | READONLY | STATIC | ABSTRACT | FINAL | ASYNC|EXPORT;

importStatement
    : IMPORT (IDENTIFIER | STAR AS IDENTIFIER | LCURLY IDENTIFIER (COMMA IDENTIFIER)* RCURLY) FROM String SEMI;

componentDeclaration
    : COMPONENT LPAREN objectLiteral RPAREN ;

classDeclaration
    :(modifier)* CLASS IDENTIFIER (EXTENDS IDENTIFIER)? LCURLY (classMember)* RCURLY;

classMember
    : inputDeclaration
    | outputDeclaration
    | methodDeclaration
    | propertyDeclaration
    | constructorDecleration;

constructorDecleration:CONSTRUCTOR LPAREN (parameter (COMMA parameter)*)? RPAREN block;
inputDeclaration
    : INPUT LPAREN String RPAREN IDENTIFIER COLON IDENTIFIER SEMI;

outputDeclaration
    : OUTPUT LPAREN (literal)? RPAREN IDENTIFIER (EQUAL expression)? SEMI;

methodDeclaration
    :(modifier)* IDENTIFIER LPAREN (parameter (COMMA parameter)*)? RPAREN (COLON IDENTIFIER?)? block
    |shortMethod;

propertyDeclaration
    :(modifier)* IDENTIFIER COLON IDENTIFIER (EQUAL expression)? SEMI;

parameter
    : IDENTIFIER COLON IDENTIFIER;

functionDeclaration
    : FUNCTION IDENTIFIER LPAREN (parameter (COMMA parameter)*)? RPAREN block;

block
    : LCURLY statement* RCURLY;

statement
    : variableDeclaration
    | ifStatement
    | forStatement
    | whileStatement
    | expressionStatement
    ;

variableDeclaration
    :(modifier)* (CONST | LET | VAR) IDENTIFIER (COLON IDENTIFIER)? (EQUAL expression)? SEMI;

ifStatement
    : IF LPAREN expression (compersion expression)? RPAREN block (ELSEIF LPAREN expression (compersion expression)? RPAREN block)* (ELSE block)?
    |shortIf;
shortIf:LPAREN? expression (compersion expression)? RPAREN? ARROW expression|(QUESITIONMARK expression (LPAREN? expression (compersion expression)? RPAREN? QUESITIONMARK expression)* COLON expression) ;
shortMethod:LPAREN (parameter (COMMA parameter)*)? RPAREN ARROW statement;
shortFunction:;
forStatement
    : FOR LPAREN (variableDeclaration | expression)? SEMI expression? SEMI expression? RPAREN block;

whileStatement
    : WHILE LPAREN expression RPAREN block;

expressionStatement
    : expression SEMI;

returnStatement
    : RETURN expression? SEMI;


expression
    : literal
    | IDENTIFIER
    | list
    | callingMethod
    | objectDecleration
    | expression DOT expression
    | expression list|shortMethod
    | expression operator expression;

    callingMethod
    :IDENTIFIER LPAREN (expression (COMMA expression)*)? RPAREN;

    list:LSBRACKET ((literal|IDENTIFIER) (COMMA (literal|IDENTIFIER))*)? RSBRACKET;

operator
    : EQUAL | PLUS | MINUS | STAR | DIVIDE |PLUS EQUAL|MINUS EQUAL;
    compersion:GREATER_THAN|LESS_THAN|GREATER_THAN_OR_EQUAL|LESS_THAN_OR_EQUAL|NOT_EQUAL|EQUAL_TO| AND | OR|EQUAL_TO3|NOT_EQUAL2;

literal
    : Integer | Float | String | Boolean | Null | Undefined|THIS;

objectLiteral
    : LCURLY (property (COMMA property)*)? RCURLY;

property
    :IDENTIFIER COLON expression;
    objectDecleration
    :NEW IDENTIFIER (LESS_THAN IDENTIFIER* GREATER_THAN)?  LPAREN (expression (COMMA expression)*)? RPAREN ;

