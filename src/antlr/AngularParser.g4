parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

program
    : (importStatement | componentDeclaration | classDeclaration | functionDeclaration | statement)* EOF;

importStatement
    : IMPORT (IDENTIFIER | STAR AS IDENTIFIER | LCURLY IDENTIFIER (COMMA IDENTIFIER)* RCURLY) FROM String SEMI;

componentDeclaration
    : COMPONENT LPAREN objectLiteral RPAREN ;

classDeclaration
    :(EXPORT)* CLASS IDENTIFIER (EXTENDS IDENTIFIER)? LCURLY (classMember)* RCURLY;

classMember
    : inputDeclaration
    | outputDeclaration
    | methodDeclaration
    | propertyDeclaration;

inputDeclaration
    : INPUT LPAREN String RPAREN IDENTIFIER COLON IDENTIFIER SEMI;

outputDeclaration
    : OUTPUT LPAREN String RPAREN IDENTIFIER COLON IDENTIFIER SEMI;

methodDeclaration
    : IDENTIFIER LPAREN (parameter (COMMA parameter)*)? RPAREN COLON IDENTIFIER? block;

propertyDeclaration
    : IDENTIFIER COLON IDENTIFIER (EQUAL expression)? SEMI;

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
    | returnStatement;

variableDeclaration
    : (CONST | LET | VAR) IDENTIFIER (COLON IDENTIFIER)? (EQUAL expression)? SEMI;

ifStatement
    : IF LPAREN expression RPAREN block (ELSE block)?;

forStatement
    : FOR LPAREN (variableDeclaration | expression)? SEMI expression? SEMI expression? RPAREN block;

whileStatement
    : WHILE LPAREN expression RPAREN block;

expressionStatement
    : expression SEMI;

returnStatement
    : RETURN expression? SEMI;

calledFunction
    :IDENTIFIER LPAREN (expression (COMMA expression)*)? RPAREN;


expression
    : literal
    | IDENTIFIER
    | calledFunction
    | expression operator expression;

operator
    : EQUAL | PLUS | MINUS | STAR | DIVIDE | AND | OR;

literal
    : Integer | Float | String | Boolean | Null | Undefined;

objectLiteral
    : LCURLY (property (COMMA property)*)? RCURLY;

property
    : IDENTIFIER COLON expression;
