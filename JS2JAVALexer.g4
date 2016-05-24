lexer grammar JS2JAVALexer;

OPENPAR : '(' ;
CLOSEPAR : ')' ;
OPENBRACES : '{' ;
CLOSEBRACES : '}' ;
OPENBRACKETS : '[' ;
CLOSEBRACKETS : ']' ;
TWOPOINTS : ':' ;
COMMA : ',' ;
TRUE : 'true' ;
FALSE : 'false' ;
NULL : 'null' ;
TYPE : '"type"' ;

VARDEC : '"VariableDeclaration"' ;
FUNCDEC : '"FunctionDeclaration"' ;
DECLARATIONS : '"declarations"' ;
PARAMS : '"params"' ;
DEFAULTS : '"defaults"' ;
VARDECTOR : '"VariableDeclarator"' ;
BLOCKSTMT : '"BlockStatement"' ;
FORSTMT : '"ForStatement"' ;
FORINSTMT : '"ForInStatement"' ;
IFSTMT : '"IfStatement"' ;
EXPSTMT : '"ExpressionStatement"' ;
WHILESTMT : '"WhileStatement"' ;
DOWHILESTMT : '"DoWhileStatement"' ;
TEST : '"test"' ;

CONSEQUENT : '"consequent"' ;
ALTERNATE : '"alternate"' ;

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
EACH : '"each"' ;
ELEMENTS : '"elements"' ;
VAR : '"var"' ;
UPDATE : '"update"' ;
ARGUMENT : '"argument"' ;
PREFIX : '"prefix"' ;
GENERATOR : '"generator"' ;

IDENTIFIER : '"Identifier"' ;
LITERAL : '"Literal"' ;
BINARYEX : '"BinaryExpression"' ;
UPDATEEX : '"UpdateExpression"' ;
ASSIGNEX : '"AssignmentExpression"' ;
UNARYEX : '"UnaryExpression"' ;
ARRAYEX : '"ArrayExpression"' ;
EXPRESSION : '"expression"' ;

//binary operators
ADD : '"+"' ;
SUB : '"-"' ;
MUL : '"*"' ;
DIV : '"/"' ;
REM : '"%"' ;

EQUAL : '"=="' ;
NEQUAL : '"!="' ;
SMALLER : '"<"' ;
SMALLEREQ : '"<="' ;
BIGGER : '">"' ;
BIGGEREQ : '">="' ;

//update operators
INC : '"++"' ;
DEC : '"--"' ;

//unary operators
NOT : '"!"' ;

//assignment operators
ASSIGN : '"="' ; 
ADDASSIGN : '"+="' ;
SUBASSIGN : '"-="' ;
MULASSIGN : '"*="' ;
DIVASSIGN : '"/="' ;

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
