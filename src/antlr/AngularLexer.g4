lexer grammar AngularLexer;

// Keywords
WS : [ \t\r\n]+ -> skip;
IF : 'if';
ELSEIF : 'else if';
ELSE : 'else';
FOR : 'for';
WHILE : 'while';
SWITCH : 'switch';
CASE : 'case';
BREAK : 'break';
CONTINUE : 'continue';
DEFAULT : 'default';
DO : 'do';
TRY : 'try';
CATCH : 'catch';
FINALLY : 'finally';
THROW : 'throw';
FUNCTION : 'function';
RETURN : 'return';
NEW : 'new';
CONST : 'const';
LET : 'let';
VAR : 'var';
ASYNC : 'async';
AWAIT : 'await';
IMPORT : 'import';
CLASS : 'class';
EXPORT : 'export';
EXPORT_DEFAULT : 'export default';
FROM : 'from';
AS : 'as';

// Angular-Specific Keywords
ANGULAR_DIRECTIVE : '@Directive' | '@Component' | '@Injectable' | '@Input' | '@Output';
ANGULAR_MODULE : '@NgModule';
ANGULAR_LIFECYCLE : 'ngOnInit' | 'ngOnDestroy' | 'ngAfterViewInit' | 'ngAfterContentInit';

// Operators
ARROW : '=>';
EQUAL : '=';
PLUS_EQUALS : '+=';
MINUS_EQUALS : '-=';
TIMES_EQUALS : '*=';
DIVIDE_EQUALS : '/=';
MODULO_EQUALS : '%=';
PLUS_ONE : '++';
MINUS_ONE : '--';
PLUS : '+';
MINUS : '-';
STAR : '*';
DIVIDE : '/';
MODULO : '%';
AND : '&&';
OR : '||';
NOT : '!';
EQUAL_TO : '==' | '===';
NOT_EQUAL : '!=';
GREATER_THAN : '>';
LESS_THAN : '<';
GREATER_THAN_OR_EQUAL : '>=';
LESS_THAN_OR_EQUAL : '<=';

// Punctuation
SINGLE_LINE_COMMENT : '//' ~[\r\n]* -> skip;
COMMENT_BLOCK : '/*' .*? '*/' -> skip;
LPAREN : '(';
RPAREN : ')';
LSBRACKET : '[';
RSBRACKET : ']';
LCURLY : '{';
RCURLY : '}';
COMMA : ',';
SEMI : ';';
COLON : ':';
DOT : '.';
QUESITIONMARK : '?';

// Literals
Integer : [0-9]+;
Float : [0-9]+ '.' [0-9]+;
String : ('"' (~["])* '"') | ('\'' (~[''])* '\'') | ('`' (~[`])* '`');
Boolean : 'true' | 'false';
Undefined : 'undefined';
Null : 'null';

// Identifiers
IDENTIFIER : [a-zA-Z_$][a-zA-Z0-9_$]*;
