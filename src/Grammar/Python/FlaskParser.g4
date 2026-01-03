parser grammar FlaskParser;

options {tokenVocab=FlaskLexer;}

@header{
package antlr;
}


program
: (class_definition | route_definition | function_definition | statement | NEWLINE)* EOF
;


// THE FLASK ROUTES
route_definition
: ROUTE_DECORATOR OPAREN STRING_LITERAL CPAREN NEWLINE*
function_definition
;

// THE CLASS DEFINITION

class_definition:
CLASS name=ID (OPAREN parent=ID CPAREN)? COLON block NEWLINE*
;


function_definition
: DEF ID OPAREN parameter_list ? CPAREN COLON block NEWLINE*
;

parameter_list:
ID (COMMA ID)*
;




block
:  NEWLINE* INDENT (statement | NEWLINE)* DEDENT
;


statement:
if_statement              #ifSStmt
| for_statement           #forStmt
| while_statement         #whileStmt
| print_statement         #printStmt
| return_statement        #returnStmt
| function_definition     #functionStmt
| assignment_statement    #assignStmt
| expression              #exprStmt
| BREAK                   #breakStmt
| CONTINUE                #continueStmt
;


if_statement
: IF  expression COLON block  (ELSE COLON  block)?
;

for_statement:
FOR var=ID IN iter=expression COLON block
;

range_loop
: RANGE OPAREN start=expression (COMMA stop=expression (COMMA step=expression)?)? CPAREN
;



while_statement:
WHILE condition=expression COLON block
;



print_statement
: PRINT OPAREN expression? CPAREN
;




return_statement
: RETURN expression NEWLINE*
| RETURN RENDER_TEMPLATE OPAREN template_call_arguments? CPAREN NEWLINE*
;

template_call_arguments
: expression ( COMMA template_argument)*
;

template_argument
: expression
| ID EQUAL expression
;


assignment_statement
: target=variable_access EQUAL rhs=expression (NEWLINE*? | EOF)
;




value_list:
expression (COMMA expression)*
;



expression
:primary                                       #primaryExpr
| expression DOT ID                            #memberAccess
| expression OPAREN value_list? CPAREN         #functionCall
| expression OSBRAC expression CSBRAC          #indexAccess
| NOT expression                               #notExpr
| expression (STAR | DIV) expression           #mulDivExpr
| expression (ADD | MINUS) expression          #addMinusExpr
| expression (OB | CB | OBQ | CBQ) expression  #comparsionExpr
| expression (EQ_EQ | NOT_EQUAL) expression    #equalityExpr
| expression (AND | OR) expression             #logicalExpr
;

primary
    : ID                         #idExpr
    | INTEGER_LITERAL            #intExpr
    | FLOAT_LITERAL              #floatExpr
    | STRING_LITERAL             #stringExpr
    | TRUE                       #trueExpr
    | FALSE                      #falseExpr
    | NONE                       #noneExpr
    | range_loop                 #rangeExpr
    | list_literal               #listExpr
    | OPAREN expression CPAREN   #parentExpr
    ;

list_literal
    : OSBRAC (expression (COMMA expression)*)? CSBRAC
    ;



variable_access
: atom=(ID | RENDER_TEMPLATE | RANGE | INT | FLOAT | STRING | CLASS | DEF)
(
DOT member=(ID | RENDER_TEMPLATE | RANGE | INT | FLOAT | STRING | CLASS | DEF)
| OPAREN args=value_list? CPAREN
| OSBRAC index=expression CSBRAC
)*
;





