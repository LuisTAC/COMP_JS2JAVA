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
	: QUOTATION_MARK left_name QUOTATION_MARK
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
	;

pair
   : left_operand TWOPOINTS value
   ;

array
   : OPENBRACKETS value (COMMA value)* CLOSEBRACKETS
   | OPENBRACKETS CLOSEBRACKETS
   ;

value
   : QUOTATION_MARK value_name QUOTATION_MARK
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
   ;
   
value_name 
	: SCRIPT
	| PROGRAM
	;