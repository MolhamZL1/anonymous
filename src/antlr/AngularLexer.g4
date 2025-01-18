lexer grammar AngularLexer;



IF: 'if';
ELSEIF: 'else' WS 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
SWITCH: 'switch';
CASE: 'case';
BREAK: 'break';
CONTINUE: 'continue';
DEFAULT: 'default';
DO: 'do';
TRY: 'try';
CATCH: 'catch';
FINALLY: 'finally';
THROW: 'throw';
FUNCTION: 'function';
RETURN: 'return';
CONST: 'const';
LET: 'let';
CONSTRUCTOR:'constructor';
VAR: 'var';
CLASS:'class';
IMPORT: 'import';
IMPORTS: 'imports';

EXPORT: 'export';
AS: 'as';
FROM: 'from';
NEW:'new';
THIS:'this';
IMPLEMENTS:'implements';
//angular
INPUT: '@Input';
OUTPUT: '@Output';
VIEWCHILD: '@ViewChild';
COMPONENT: '@Component';
NGONINIT: 'ngOnInit';
NGONCHANGES: 'ngOnChanges';
SELECTOR:'selector';
STANDALONE:'standalone';
STYLEURL:'styleUrl';
TEMPLATEURL:'templateUrl';
TEMPLATE:'template';


//MODIFIRES
PUBLIC : 'public';
PRIVATE : 'private';
PROTECTED : 'protected';
READONLY : 'readonly';
STATIC : 'static';
ABSTRACT : 'abstract';
FINAL : 'final';
ASYNC : 'async';

// Operators
EQUAL: '=';
ARROW: '=>';
PLUS: '+';
MINUS: '-';
STAR: '*';
DIVIDE: '/';
MODULO: '%';
AND: '&&';
OR: '||';
NOT: '!';
EQUAL_TO: '==';
EQUAL_TO3: '===';
NOT_EQUAL: '!=';
NOT_EQUAL2: '!==';
GREATER_THAN: '>';
LESS_THAN: '<';
GREATER_THAN_OR_EQUAL: '>=';
LESS_THAN_OR_EQUAL: '<=';

// Punctuation
LPAREN: '(';
RPAREN: ')';
LSBRACKET: '[';
RSBRACKET: ']';
LCURLY: '{';
RCURLY: '}';
COMMA: ',';
SEMI: ';';
COLON: ':';
DOT: '.';
QUESITIONMARK: '?';

// Literals
Integer: [0]|([1-9][0-9]*);
Float: [0-9]+ '.' [0-9]+;
String: ('"' (~["\\])* '"') | ('\'' (~['\\])* '\'');
Boolean: 'true' | 'false';
Undefined: 'undefined';
Null: 'null';




// Comments
SINGLE_LINE_COMMENT: '//' ~[\r\n]* ->skip;
COMMENT_BLOCK: '/*' .*? '*/' -> skip;
WS : [ \t\r\n]+ -> skip;
IDENTIFIER: [a-zA-Z_$][a-zA-Z0-9_$]*;




HTML_COMMENT: '<!--' .*? '-->' -> pushMode(HTMLDOCUMENT);
HTML_CONDITIONAL_COMMENT: '<![' .*? ']>' -> pushMode(HTMLDOCUMENT);
mode HTMLDOCUMENT;
XML: '<?xml' .*? '>';
SCRIPTLET: '<?' .*? '?>' | '<%' .*? '%>';

SEA_WS: (' ' | '\t' | '\r'? '\n')+;

SCRIPT_OPEN: '<script' .*? '>' -> pushMode(SCRIPT);

STYLE_OPEN: '<style' .*? '>' -> pushMode(STYLE);

TAG_OPEN: '<' -> pushMode(TAG);

HTML_TEXT: ~'<'+;

// tag declarations

mode TAG;

TAG_CLOSE: '>' -> popMode;

TAG_SLASH_CLOSE: '/>' -> popMode;

TAG_SLASH: '/';

// lexing mode for attribute values

TAG_EQUALS: '=' -> pushMode(ATTVALUE);

TAG_NAME: TAG_NameStartChar TAG_NameChar*;

TAG_WHITESPACE: [ \t\r\n] -> channel(HIDDEN);

fragment HEXDIGIT: [a-fA-F0-9];

fragment DIGIT: [0-9];

fragment TAG_NameChar:
    TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300' ..'\u036F'
    | '\u203F' ..'\u2040'
;

fragment TAG_NameStartChar:
    [:a-zA-Z]
    | '\u2070' ..'\u218F'
    | '\u2C00' ..'\u2FEF'
    | '\u3001' ..'\uD7FF'
    | '\uF900' ..'\uFDCF'
    | '\uFDF0' ..'\uFFFD'
;

// <scripts>

mode SCRIPT;

SCRIPT_BODY: .*? '</script>' -> popMode;

SCRIPT_SHORT_BODY: .*? '</>' -> popMode;

// <styles>

mode STYLE;

STYLE_BODY: .*? '</style>' -> popMode;

STYLE_SHORT_BODY: .*? '</>' -> popMode;

// attribute values

mode ATTVALUE;

// an attribute value may have spaces b/t the '=' and the value
ATTVALUE_VALUE: ' '* ATTRIBUTE -> popMode;

ATTRIBUTE: DOUBLE_QUOTE_STRING | SINGLE_QUOTE_STRING | ATTCHARS | HEXCHARS | DECCHARS;

fragment ATTCHARS: ATTCHAR+ ' '?;

fragment ATTCHAR: '-' | '_' | '.' | '/' | '+' | ',' | '?' | '=' | ':' | ';' | '#' | [0-9a-zA-Z];

fragment HEXCHARS: '#' [0-9a-fA-F]+;

fragment DECCHARS: [0-9]+ '%'?;

fragment DOUBLE_QUOTE_STRING: '"' ~[<"]* '"';

fragment SINGLE_QUOTE_STRING: '\'' ~[<']* '\''->popMode;
