/** Taken from "The Definitive ANTLR 4 Reference" by Terence Parr */

// Derived from http://json.org
grammar JS2JAVA;

json
   : object
   | array
   ;

object
   : OPENBRACES pair (',' pair)* CLOSEBRACES
   | OPENBRACES CLOSEBRACES
   ;

pair
   : STRING ':' value
   ;

array
   : OPENBRACKETS value (',' value)* CLOSEBRACKETS
   | OPENBRACKETS CLOSEBRACKETS
   ;

value
   : STRING
   | NUMBER
   | object
   | array
   | 'true'
   | 'false'
   | 'null'
   ;

STRING
   : '"' (ESC | ~ ["\\])* '"'
   ;
fragment ESC
   : '\\' (["\\/bfnrt] | UNICODE)
   ;
fragment UNICODE
   : 'u' HEX HEX HEX HEX
   ;
fragment HEX
   : [0-9a-fA-F]
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
   
OPENPAR : '(' ;
CLOSEPAR : ')' ;
OPENBRACES : '{' ;
CLOSEBRACES : '}' ;
OPENBRACKETS : '[' ;
CLOSEBRACKETS : ']' ;