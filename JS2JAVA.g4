/**
 * Define a grammar called Hello
 */
grammar JS2JAVA;

s  : OPENBRACES
	header COMMA
	body COMMA
	'"sourceType"' COLON '"script"'
	CLOSEBRACES ;

WS : [' '\t\r\n]+ -> skip ; // skip spaces, tabs, newlines

header : '"type"' COLON '"Program"' ;

body : '"body"' ':' OPENBRACKETS OPENBRACES (vardec|functiondec) CLOSEBRACES CLOSEBRACKETS;

functiondec : ;
vardec : '"type"' COLON '"VariableDeclaration"' COMMA 
	'"declarations"' COLON OPENBRACKETS
	OPENBRACES
	'"type"' COLON '"VariableDeclarator"' COMMA
	id
	COMMA
	init
	CLOSEBRACES
	CLOSEBRACKETS COMMA
	'"kind"' COLON  '"var"' ;

id : '"id"' COLON OPENBRACES
	'"type"' COLON '"Identifier"' COMMA
	'"name"' COLON '"' VARID '"'
	CLOSEBRACES;

init : '"init"' COLON OPENBRACES
	'"type"' COLON '"Literal"' COMMA
	(
	'"value"' COLON INT COMMA
	'"raw"' COLON '"' INT '"'
	|
	'"value"' COLON REAL COMMA
	'"raw"' COLON '"' REAL '"'
	|
	'"value"' COLON '"' 'lol' '"' COMMA
	'"raw"' COLON '"\\"' STRING '\\""'
	)
	CLOSEBRACES; 

VARID : [a-z][a-zA-Z0-9]* ;
INT : [0-9]+ ;
REAL : [0-9]+'.'[0-9]+ ;

OPENPAR : '(' ;
CLOSEPAR : ')' ;

OPENBRACES : '{' ;
CLOSEBRACES : '}' ;

OPENBRACKETS : '[' ;
CLOSEBRACKETS : ']' ;

COMMA : ',' ;
COLON : ':' ;
SEMICOLON : ';' ;

STRING : 'lol' ;
ASCIICHAR : [\x00-\x7F] ;
UNICHAR : [\u0000-\u007F] ;

