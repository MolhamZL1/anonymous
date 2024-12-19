parser grammar AngularParser;
options { tokenVocab=AngularLexer; }

program : (statement)*;

statement
    : variableDeclaration
    | functionDeclaration
    | classDeclaration
    | angularDecorator
    | angularLifecycle
    | importStatement
    | exportStatement
    | ifStatement
    | forLoop
    | whileLoop
    | tryCatch
    | returnStatement
    ;

variableDeclaration
    : (CONST | LET | VAR|) IDENTIFIER (EQUAL expression)? SEMI
    ;

functionDeclaration
    : FUNCTION IDENTIFIER? LPAREN parameterList? RPAREN LCURLY statement* RCURLY
    ;

classDeclaration
    : CLASS IDENTIFIER (EXTENDS IDENTIFIER)? LCURLY statement* RCURLY
    ;

angularDecorator
    : ANGULAR_DIRECTIVE | ANGULAR_MODULE
    ;

angularLifecycle
    : ANGULAR_LIFECYCLE LPAREN RPAREN LCURLY statement* RCURLY
    ;

ifStatement
    : IF LPAREN expression RPAREN LCURLY statement* RCURLY (ELSE LCURLY statement* RCURLY)?
    ;

forLoop
    : FOR LPAREN (variableDeclaration | expression)? SEMI expression? SEMI expression? RPAREN LCURLY statement* RCURLY
    ;

whileLoop
    : WHILE LPAREN expression RPAREN LCURLY statement* RCURLY
    ;

tryCatch
    : TRY LCURLY statement* RCURLY (CATCH LPAREN IDENTIFIER RPAREN LCURLY statement* RCURLY)? (FINALLY LCURLY statement* RCURLY)?
    ;

returnStatement
    : RETURN expression? SEMI
    ;

importStatement
    : IMPORT LCURLY (IDENTIFIER (COMMA IDENTIFIER)*)? RCURLY FROM String SEMI
    ;

exportStatement
    : EXPORT (CONST | LET | VAR | FUNCTION | classDeclaration | variableDeclaration)
    ;

parameterList
    : IDENTIFIER (COMMA IDENTIFIER)*
    ;

expression
    : literal
    | IDENTIFIER
    | expression operator expression
    | LPAREN expression RPAREN
    ;

literal
    : String
    | Integer
    | Float
    | Boolean
    | Undefined
    | Null
    ;

operator
    : EQUAL | PLUS | MINUS | STAR | DIVIDE | MODULO | AND | OR | NOT
    ;
