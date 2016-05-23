parser grammar JS2JAVAParser;

options {
	tokenVocab = JS2JAVALexer;
}

json
   : object
   | array
   ;

object
   : OPENBRACES pair (COMMA pair)* CLOSEBRACES
   | OPENBRACES CLOSEBRACES
   ;

left_operand 
	: left_name
	;

left_name 
	: TYPE 
	| BODY 
	| SOURCETYPE
	| DECLARATIONS
	| ID
	| INIT
	| OPERATOR
	| LEFT
	| RIGHT
	| VALUE
	| RAW
	| KIND
	| NAME
	;

pair
   : left_operand TWOPOINTS value
   ;

array
   : OPENBRACKETS value (COMMA value)* CLOSEBRACKETS
   | OPENBRACKETS CLOSEBRACKETS
   ;

value
   : value_name
   | object
   | array
   | TRUE
   | FALSE
   | NULL
   | STRING
   | IDENTIFIER
   | LITERAL
   | VAR
   | STRING
   | NUMBER
   ;
   
value_name 
	: SCRIPT
	| PROGRAM
	;