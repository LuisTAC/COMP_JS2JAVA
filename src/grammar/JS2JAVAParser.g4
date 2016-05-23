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

pair
   : left_operand TWOPOINTS value
   ;
   
left_operand 
	: QUOTATION_MARK TYPE QUOTATION_MARK
	;

array
   : OPENBRACKETS value (COMMA value)* CLOSEBRACKETS
   | OPENBRACKETS CLOSEBRACKETS
   ;

value
   : STRING
   | NUMBER
   | object
   | array
   | TRUE
   | FALSE
   | NULL
   ;