parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

program
    : (importStatement | componentDeclaration | classDeclaration | functionDeclaration | statement)* EOF;


importStatement
    : IMPORT (IDENTIFIER | STAR AS IDENTIFIER | importSpecifier) FROM String eos
    | IMPORT String eos  // Side-effect import
    ;

importSpecifier
    : LCURLY (IDENTIFIER (AS IDENTIFIER)? (COMMA IDENTIFIER (AS IDENTIFIER)?)*)? RCURLY;

        componentDeclaration
            :COMPONENT LPAREN LCURLY (selector|standalone|imports|url|tamplate)
            (COMMA(selector|standalone|imports|url|tamplate))* RCURLY RPAREN ;

        selector:SELECTOR COLON String;

        standalone:STANDALONE COLON Boolean;

        imports:IMPORTS COLON LSBRACKET (IDENTIFIER (COMMA IDENTIFIER)*)? RSBRACKET;

        url:(TEMPLATEURL|STYLEURL) COLON String;

        tamplate: TEMPLATE COLON html;

        html:;

         functionDeclaration:
         (FUNCTION? IDENTIFIER? parameterList  (COLON IDENTIFIER?)? block)
         |arrowMethod;

         methodDeclaration:
        ( (modifier)? IDENTIFIER parameterList (COLON IDENTIFIER?)? block)
         |arrowMethod;

          arrowMethod:
          modifier? IDENTIFIER? parameterList  (COLON IDENTIFIER?)?  ARROW LCURLY? statement* RCURLY?;

          block:
          LCURLY statement* returnStatement? RCURLY;

          parameterList:
          LPAREN (parameter (COMMA parameter)*)? RPAREN;

          parameter:
          (IDENTIFIER COLON IDENTIFIER (EQUAL literal)?)|IDENTIFIER;

modifier : PUBLIC | PRIVATE | PROTECTED | READONLY | STATIC | ABSTRACT | FINAL | ASYNC|EXPORT;

classDeclaration
    :(modifier)? CLASS? IDENTIFIER ((EXTENDS| IMPLEMENTS) IDENTIFIER)? LCURLY (classMember)* RCURLY;

classMember
    : inputDeclaration
    | outputDeclaration
    | methodDeclaration
    | propertyDeclaration
    | variableDeclaration
    | objectDecleration
    | constructorDecleration
    | ngOn;

ngOn
:(NGONINIT|NGONCHANGES) parameterList (COLON IDENTIFIER?)? block;

constructorDecleration
:CONSTRUCTOR parameterList block;

inputDeclaration
    : INPUT LPAREN (literal)? RPAREN property;

outputDeclaration
    : OUTPUT LPAREN (literal)? RPAREN objectDecleration;

variableDeclaration
    :(modifier? type)? IDENTIFIER (COLON expression)?  (EQUAL expression)? (AS IDENTIFIER)? eos?;

type:(CONST | LET | VAR);

propertyDeclaration:(modifier)? property (EQUAL expression)? eos;

property:(IDENTIFIER COLON expression)|imports;

objectDecleration:
(property|objectName) EQUAL objectInit eos?;

objectName:
IDENTIFIER  objectType? ;

objectInit:
NEW IDENTIFIER objectType?  LPAREN (expression (COMMA expression)*)? RPAREN;

objectType:
LESS_THAN IDENTIFIER list? (COMMA IDENTIFIER list?)* GREATER_THAN
;

objectLiteral:LCURLY (property (COMMA property)*)? COMMA? RCURLY;

literal
    : (PLUS | MINUS)? Integer |(PLUS | MINUS)? Float | String | Boolean | Null | Undefined|THIS;

    statement
        : variableDeclaration
        | objectDecleration
        | ifStatement
        | forStatement
        | whileStatement
        | expressionStatement;

        expression
            : expression list
            | objectLiteral
            | objectDecleration
            | objectName
            | arrowMethod
            | expression EQUAL (dataStructure|literal)
            | THIS
            | IDENTIFIER
            | IDENTIFIER PLUS PLUS
            | IDENTIFIER MINUS MINUS
            | literal
            | callingMethod
            | expression DOT expression
            | expression compersion expression
            | expression operator expression
            | LESS_THAN expression GREATER_THAN IDENTIFIER
            | LPAREN expression AS IDENTIFIER RPAREN
            | dataStructure;


ifStatement
    : IF LPAREN expression (compersion expression)? RPAREN block (ELSEIF LPAREN expression (compersion expression)? RPAREN block)* (ELSE block)?
    |shortIf
    |arrowIf;

shortIf:LPAREN? expression (compersion expression)? RPAREN? QUESITIONMARK LPAREN?  statement RPAREN?  (COLON LPAREN? expression (compersion expression)? RPAREN? QUESITIONMARK LPAREN?  statement RPAREN? )* COLON LPAREN?  statement RPAREN? ;

arrowIf:LPAREN? expression (compersion expression)? RPAREN? ARROW expression;

forStatement
    : FOR LPAREN (variableDeclaration | expression)? SEMI expression? SEMI expression? RPAREN block;

whileStatement
    : WHILE LPAREN expression RPAREN block;

expressionStatement
    : expression eos;

returnStatement
    : RETURN LPAREN? expression? RPAREN? eos;

    callingMethod
    :((IDENTIFIER|CATCH) LPAREN (expression (COMMA expression)*)? RPAREN) ((DOT (callingMethod|IDENTIFIER))|dataStructure)*;

    dataStructure:list|map;

    itemsStructures:(literal|IDENTIFIER|list|map|callingMethod);

map:LCURLY ((itemsStructures COLON itemsStructures) (COMMA (itemsStructures COLON itemsStructures))*)? COMMA? RCURLY;

list:LSBRACKET (itemsStructures (COMMA itemsStructures)*)? COMMA? RSBRACKET;

operator
    : EQUAL | PLUS | MINUS | STAR | DIVIDE |PLUS EQUAL|MINUS EQUAL;

    compersion
    :GREATER_THAN|LESS_THAN|GREATER_THAN_OR_EQUAL|LESS_THAN_OR_EQUAL|NOT_EQUAL|EQUAL_TO| AND | OR|EQUAL_TO3|NOT_EQUAL2;
    eos:SEMI?;


