lexer grammar JS2JAVALexer;

OPENPAR : '(' ;
CLOSEPAR : ')' ;
OPENBRACES : '{' ;
CLOSEBRACES : '}' ;
OPENBRACKETS : '[' ;
CLOSEBRACKETS : ']' ;
TWOPOINTS : ':' ;
COMMA : ',' ;
TRUE : 'true';
FALSE : 'false';
NULL : 'null' ;
TYPE : '"type"';

VARDEC : '"VariableDeclaration"' ;
FUNCDEC : '"FunctionDeclaration"' ;
DECLARATIONS : '"declarations"' ;
PARAMS : '"params"' ;
DEFAULTS : '"defaults"' ;
VARDECTOR : '"VariableDeclarator"' ;
BLOCKSTMT : '"BlockStatement"' ;

SOURCETYPE : '"sourceType"' ;
BODY : '"body"' ;
PROGRAM : '"Program"' ;
SCRIPT : '"script"' ;

ID : '"id"' ;
INIT : '"init"' ;
OPERATOR : '"operator"' ;
LEFT : '"left"' ;
RIGHT : '"right"' ;
VALUE : '"value"' ;
NAME : '"name"' ;
RAW : '"raw"' ;
KIND : '"kind"' ;
IDENTIFIER : '"Identifier"' ;

LITERAL : '"Literal"' ;
BINARYEX : '"BinaryExpression"' ;

VAR : '"var"' ;
EXPRESSION : '"expression"' ;
UPDATE : '"update"' ;
ARGUMENT : '"argument"' ;
PREFIX : '"prefix"' ;
GENERATOR : '"generator"' ;

ADD : '"+"';
SUB : '"-"';
MUL : '"*"';
DIV : '"/"';
REM : '"%"';


STRING
    :  '"' ( EscapeSequence | ~[\\"]  )* '"'
    ;

fragment
HexDigit 
    : [0-9a-fA-F] 
    ;

fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   UnicodeEscape
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' [0-3] [0-7] [0-7]
    |   '\\' [0-7] [0-7]
    |   '\\' [0-7]
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;


NUMBER
   : '-'? INT '.' [0-9] + EXP? | '-'? INT EXP | '-'? INT
   ;
fragment INT
   : '0' | [1-9] [0-9]*
   ;
// no leading zeros
fragment EXP
   : [Ee] [+\-]? INT
   ;
// \- since - means "range" inside [...]
WS
   : [ \t\n\r] + -> skip
   ;
