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
LABEL : '"label"' ;
DISCRIMINANT : '"discriminant"' ;
CASES : '"cases"' ;

VARDEC : '"VariableDeclaration"' ;
FUNCDEC : '"FunctionDeclaration"' ;
VARDECTOR : '"VariableDeclarator"' ;
BLOCKSTMT : '"BlockStatement"' ;
FORSTMT : '"ForStatement"' ;
FORINSTMT : '"ForInStatement"' ;
IFSTMT : '"IfStatement"' ;
EXPSTMT : '"ExpressionStatement"' ;
WHILESTMT : '"WhileStatement"' ;
DOWHILESTMT : '"DoWhileStatement"' ;
RETURNSTMT : '"ReturnStatement"' ;
BREAKSTMT : '"BreakStatement"' ;

IDENTIFIER : '"Identifier"' ;
LITERAL : '"Literal"' ;
SWITCHCASE : '"SwitchCase"' ;
BINARYEX : '"BinaryExpression"' ;
LOGICALEX : '"LogicalExpression"' ;
UPDATEEX : '"UpdateExpression"' ;
ASSIGNEX : '"AssignmentExpression"' ;
UNARYEX : '"UnaryExpression"' ;
ARRAYEX : '"ArrayExpression"' ;
CALLEX : '"CallExpression"' ;
MEMBEREX : '"MemberExpression"' ;
EXPRESSION : '"expression"' ;
SWITCHEX : '"SwitchStatement"' ;

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
ARGUMENTS : '"arguments"' ;
DECLARATIONS : '"declarations"' ;
PARAMS : '"params"' ;
DEFAULTS : '"defaults"' ;
PREFIX : '"prefix"' ;
GENERATOR : '"generator"' ;
CALLEE : '"callee"' ;
TEST : '"test"' ;
CONSEQUENT : '"consequent"' ;
ALTERNATE : '"alternate"' ;
COMPUTED : '"computed"' ;
OBJECT : '"object"' ;
PROPERTY : '"property"' ;
SOURCETYPE : '"sourceType"' ;
BODY : '"body"' ;
PROGRAM : '"Program"' ;
SCRIPT : '"script"' ;

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
REMASSIGN : '"%="' ;

//logical operators
AND : '"&&"' ;
OR : '"||"';

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
fragment
INT
   : '0' | [1-9] [0-9]*
   ;
// no leading zeros
fragment
EXP
   : [Ee] [+\-]? INT
   ;
// \- since - means "range" inside [...]
WS
   : [ \t\n\r] + -> skip
   ;
