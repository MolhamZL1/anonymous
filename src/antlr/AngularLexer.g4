lexer grammar AngularLexer;

// Keywords and Operators
WS : [ \t\r\n]+ -> skip;
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
VAR: 'var';
CLASS:'class';
IMPORT: 'import';
EXPORT: 'export';
AS: 'as';
FROM: 'from';
INPUT: '@Input';
OUTPUT: '@Output';
VIEWCHILD: '@ViewChild';
COMPONENT: '@Component';
NGONINIT: 'ngOnInit';
NGONCHANGES: 'ngOnChanges';

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
NOT_EQUAL: '!=';
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

// Identifiers
IDENTIFIER: [a-zA-Z_$][a-zA-Z0-9_$]*;

// Comments
SINGLE_LINE_COMMENT: '//' ~[\r\n]*;
COMMENT_BLOCK: '/*' .*? '*/' -> skip;
