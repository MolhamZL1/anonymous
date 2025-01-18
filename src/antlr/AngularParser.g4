parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

program
    : htmlDocument EOF
    | (importStatement | componentDeclaration | classDeclaration | functionDeclaration | statement)* EOF;



importStatement
    : IMPORT (IDENTIFIER | STAR AS IDENTIFIER | importSpecifier) FROM String eos
    | IMPORT String eos
    ;

importSpecifier
    : LCURLY (IDENTIFIER (AS IDENTIFIER)? (COMMA IDENTIFIER (AS IDENTIFIER)?)*)? RCURLY;

        componentDeclaration
            :COMPONENT LPAREN LCURLY (selector|standalone|imports|url)
            (COMMA(selector|standalone|imports|url))* RCURLY RPAREN ;

        selector:SELECTOR COLON String;

        standalone:STANDALONE COLON Boolean;

        imports:IMPORTS COLON LSBRACKET (IDENTIFIER (COMMA IDENTIFIER)*)? RSBRACKET;

        url:(TEMPLATEURL|STYLEURL) COLON String;





         functionDeclaration:
         (FUNCTION? IDENTIFIER? parameterList  (COLON IDENTIFIER?)? block)
         |arrowMethod;

         methodDeclaration:
        ((modifier)? IDENTIFIER parameterList (COLON IDENTIFIER?)? block)
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
    :( INPUT LPAREN (literal)? RPAREN property) eos;

outputDeclaration
    :( OUTPUT LPAREN (literal)? RPAREN objectDecleration)eos;

variableDeclaration
    :(modifier? type)? IDENTIFIER (COLON expression)?  (EQUAL expression)? (AS IDENTIFIER)? eos;

type:(CONST | LET | VAR);

propertyDeclaration:(modifier)? property (EQUAL expression)? eos;

property:(IDENTIFIER COLON expression)|imports;

objectDecleration:
(property|objectName) EQUAL objectInit eos;

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
            : expression list                                   #ExpressionList//
            | objectLiteral                                     #ObjectLiteralExpression//
            | objectDecleration                                 #ObjectDeclarationExpression//
            | objectName                                        #ObjectNameExpression//
            | arrowMethod                                       #ArrowMethodExpression//
            | expression EQUAL (dataStructure | literal)        #AssignmentExpression//
            | THIS                                              #ThisExpression//
            | IDENTIFIER                                        #IdentifierExpression//
            | IDENTIFIER PLUS PLUS                              #PostIncrementExpression//
            | IDENTIFIER MINUS MINUS                            #PostDecrementExpression//
            | literal                                           #LiteralExpression//
            | callingMethod                                     #CallingMethodExpression//
            | expression DOT expression                         #DotExpression//
            | expression compersion expression                  #ComparisonExpression//
            | expression operator expression                    #OperatorExpression//
            | LESS_THAN expression GREATER_THAN IDENTIFIER      #GenericTypeExpression
            | LPAREN expression AS IDENTIFIER RPAREN            #TypeCastExpression
            | dataStructure                                     #DataStructureExpression//
            ;



ifStatement
    :( IF LPAREN expression  RPAREN block elseIfStatment* elseStatment?)
    |shortIf
    |arrowIf;

elseIfStatment:ELSEIF LPAREN expression RPAREN block;
elseStatment:ELSE block;

shortIf:LPAREN? expression  RPAREN? QUESITIONMARK LPAREN?  statement RPAREN?  (shortElseIf )* shortelse ;
shortElseIf:COLON LPAREN? expression  RPAREN? QUESITIONMARK LPAREN?  statement RPAREN?;
shortelse:COLON LPAREN?  statement RPAREN?;

arrowIf:LPAREN? expression  RPAREN? ARROW expression;

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

htmlDocument
    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute* (
        TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)?
        | TAG_SLASH_CLOSE
    )
    | SCRIPTLET
    | script
    | style
    ;

htmlContent
    : htmlChardata? ((htmlElement | CDATA | htmlComment) htmlChardata?)*
    ;

htmlAttribute
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?
    ;

htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

script
    : SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;

