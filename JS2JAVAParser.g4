parser grammar JS2JAVAParser;

options {
	tokenVocab = JS2JAVALexer;
}

json :
   OPENBRACES TYPE TWOPOINTS PROGRAM COMMA
   BODY TWOPOINTS OPENBRACKETS (obj (COMMA obj)*)? CLOSEBRACKETS COMMA
   SOURCETYPE TWOPOINTS SCRIPT
   ;

obj :
	vardecobj
	| funcdecobj
	| forstmt
	| forinstmt
	| whilestmt
	| dowhilestmt
	| blockstmt
	| ifstmt
	| returnstmt
	| expstmt
	| breakstmt
	| switchstmt
	| NULL
	;

vardecobj :
	OPENBRACES
	TYPE TWOPOINTS VARDEC COMMA
	declarations COMMA
	KIND TWOPOINTS VAR
	CLOSEBRACES
	;
	
funcdecobj :
	OPENBRACES
	TYPE TWOPOINTS FUNCDEC COMMA
	id COMMA
	params COMMA
	defaults COMMA
	BODY TWOPOINTS blockstmt COMMA
	GENERATOR TWOPOINTS (TRUE|FALSE) COMMA
	EXPRESSION TWOPOINTS (TRUE|FALSE)
	CLOSEBRACES
	;

//var decs	
declarations :
	DECLARATIONS TWOPOINTS 
	OPENBRACKETS
	(variableDeclarator (COMMA variableDeclarator)*)?
	CLOSEBRACKETS
	;
	
variableDeclarator :
	OPENBRACES
	TYPE TWOPOINTS VARDECTOR COMMA
	id COMMA
	init
	CLOSEBRACES 
	;

//func decs
params :
	PARAMS TWOPOINTS
	OPENBRACKETS
	(id2 (COMMA id2)*)? 
	CLOSEBRACKETS
	;

defaults :
	DEFAULTS TWOPOINTS 
	OPENBRACKETS
	(expression (COMMA expression)*)?
	CLOSEBRACKETS
	;

init_for :
	NULL
	|vardecobj
	;
		
forstmt : 
	OPENBRACES
	TYPE TWOPOINTS FORSTMT COMMA
	INIT TWOPOINTS init_for COMMA
	TEST TWOPOINTS expression COMMA
	UPDATE TWOPOINTS expression COMMA
	BODY TWOPOINTS obj
	CLOSEBRACES
	;

forinstmt :
	OPENBRACES
	TYPE TWOPOINTS FORINSTMT COMMA
	LEFT TWOPOINTS id2 COMMA
	RIGHT TWOPOINTS id2 COMMA
	BODY TWOPOINTS obj COMMA
	EACH TWOPOINTS FALSE
	CLOSEBRACES
	;

whilestmt :
	OPENBRACES
	TYPE TWOPOINTS WHILESTMT COMMA
	TEST TWOPOINTS expression COMMA
	BODY TWOPOINTS obj
	CLOSEBRACES
	;

dowhilestmt :
	OPENBRACES
	TYPE TWOPOINTS DOWHILESTMT COMMA
	BODY TWOPOINTS obj COMMA
	TEST TWOPOINTS expression
	CLOSEBRACES
	;

blockstmt :
	OPENBRACES
	TYPE TWOPOINTS BLOCKSTMT COMMA
	BODY TWOPOINTS OPENBRACKETS
	(obj (COMMA obj)*)?
	CLOSEBRACKETS 
	CLOSEBRACES
	;

ifstmt :
	OPENBRACES
	TYPE TWOPOINTS IFSTMT COMMA
	TEST TWOPOINTS expression COMMA
	CONSEQUENT TWOPOINTS obj COMMA
	ALTERNATE TWOPOINTS obj
	CLOSEBRACES
	;

returnstmt :
	OPENBRACES
	TYPE TWOPOINTS RETURNSTMT COMMA
	ARGUMENT TWOPOINTS expression
	CLOSEBRACES
	;

expstmt : 
	OPENBRACES
	TYPE TWOPOINTS EXPSTMT COMMA
	EXPRESSION TWOPOINTS expression
	CLOSEBRACES	
	;

breakstmt :
	OPENBRACES
	TYPE TWOPOINTS BREAKSTMT COMMA
	LABEL TWOPOINTS NULL
	CLOSEBRACES
	;

init :
	INIT TWOPOINTS 
	expression
	;
	
literal : 
	OPENBRACES
	TYPE TWOPOINTS LITERAL COMMA
	VALUE TWOPOINTS (NUMBER|NULL|STRING|TRUE|FALSE) COMMA
	RAW TWOPOINTS STRING
	CLOSEBRACES
	;
	
binaryex :
	OPENBRACES
	TYPE TWOPOINTS BINARYEX COMMA
	OPERATOR TWOPOINTS (ADD|SUB|MUL|DIV|REM|EQUAL|NEQUAL|SMALLER|SMALLEREQ|BIGGER|BIGGEREQ) COMMA
	LEFT TWOPOINTS expression COMMA
	RIGHT TWOPOINTS expression
	CLOSEBRACES
	;
	
logicalex :
	OPENBRACES
	TYPE TWOPOINTS LOGICALEX COMMA
	OPERATOR TWOPOINTS (AND|OR) COMMA
	LEFT TWOPOINTS expression COMMA
	RIGHT TWOPOINTS expression
	CLOSEBRACES
	;

updateex :
	OPENBRACES
	TYPE TWOPOINTS UPDATEEX COMMA
	OPERATOR TWOPOINTS (INC|DEC) COMMA
	ARGUMENT TWOPOINTS id2 COMMA
	PREFIX TWOPOINTS (TRUE|FALSE)
	CLOSEBRACES
	;

assignex :
	OPENBRACES
	TYPE TWOPOINTS ASSIGNEX COMMA
	OPERATOR TWOPOINTS (ASSIGN|ADDASSIGN|SUBASSIGN|MULASSIGN|DIVASSIGN|REMASSIGN) COMMA
	LEFT TWOPOINTS (id2|memberex) COMMA
	RIGHT TWOPOINTS expression
	CLOSEBRACES
	;

unaryex :
	OPENBRACES
	TYPE TWOPOINTS UNARYEX COMMA
	OPERATOR TWOPOINTS (ADD|SUB|NOT) COMMA
	ARGUMENT TWOPOINTS expression COMMA
	PREFIX TWOPOINTS (TRUE|FALSE)
	CLOSEBRACES
	;

arrayex :
	OPENBRACES
	TYPE TWOPOINTS ARRAYEX COMMA
	ELEMENTS TWOPOINTS
	OPENBRACKETS
	(expression (COMMA expression)*)?
	CLOSEBRACKETS
	CLOSEBRACES
	;

callex :
	OPENBRACES
	TYPE TWOPOINTS CALLEX COMMA
	CALLEE TWOPOINTS id2 COMMA
	ARGUMENTS TWOPOINTS
	OPENBRACKETS
	(expression (COMMA expression)*)?
	CLOSEBRACKETS
	CLOSEBRACES
	;

memberex :
	OPENBRACES
	TYPE TWOPOINTS MEMBEREX COMMA
	COMPUTED TWOPOINTS (TRUE|FALSE) COMMA
	OBJECT TWOPOINTS id2 COMMA
	PROPERTY TWOPOINTS expression
	CLOSEBRACES
	;

switchcase :
	OPENBRACES
	TYPE TWOPOINTS SWITCHCASE COMMA
	TEST TWOPOINTS expression COMMA
	CONSEQUENT TWOPOINTS OPENBRACKETS
		(obj (COMMA obj)*)?
	CLOSEBRACKETS
	CLOSEBRACES
;

switchstmt :
	OPENBRACES
	TYPE TWOPOINTS SWITCHEX COMMA
	DISCRIMINANT TWOPOINTS expression COMMA
	//CASES
	CASES TWOPOINTS OPENBRACKETS
		(switchcase (COMMA switchcase)*)?
	CLOSEBRACKETS
	CLOSEBRACES;

expression :
	literal
	| binaryex
	| logicalex
	| updateex
	| assignex
	| unaryex
	| arrayex
	| callex
	| memberex
	| id2
	| NULL
	;

id : 
	ID TWOPOINTS id2
	;

id2 :
	OPENBRACES
	TYPE TWOPOINTS IDENTIFIER COMMA
	NAME TWOPOINTS STRING
	CLOSEBRACES
	;
	
