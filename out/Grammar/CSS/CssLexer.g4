lexer grammar CssLexer;

// Fragments
fragment IDENT_START : [a-zA-Z_] | [\u0080-\uFFFF] ;
fragment IDENT_CHAR : [a-zA-Z0-9\-_] | [\u0080-\uFFFF] ;
fragment NMSTART : IDENT_START | '\\' . ;
fragment NMCHAR : IDENT_CHAR | '\\' . ;

// Tokens
IMPORTANT    : '!' [ \t]* 'important' ;
URL          : 'url' LPAREN ;
AT_RULE      : '@' (IDENT_CHAR | '-')+ ;
AND          : 'and' ;
NOT          : 'not' ;

VAR          : '--' NMSTART NMCHAR* ;

// String literals
STRING       : '"' ( ~["\\] | '\\' . )* '"' 
             | '\'' ( ~['\\] | '\\' . )* '\'' ;

// Punctuation
LBRACE       : '{' ;
RBRACE       : '}' ;
LPAREN       : '(' ;
RPAREN       : ')' ;
COMMA        : ',' ;
SEMICOLON    : ';' ;
COLON        : ':' ;
DOT          : '.' ;
HASH         : '#' (IDENT_CHAR | '-')* ;

// Selectors
GREATER      : '>' ;
PLUS         : '+' ;
TILDE        : '~' ;
DOUBLE_COLON : '::' ;
SLASH        : '/' ;
EQUALS       : '=' ;
MINUS        : '-' ;
SQUARE_OPEN  : '[' ;
SQUARE_CLOSE : ']' ;
STAR         : '*' ;
TILDE_EQUALS : '~=' ;
PIPE_EQUALS  : '|=' ;
CARET_EQUALS : '^=' ;
DOLLAR_EQUALS : '$=' ;
STAR_EQUALS  : '*=' ;
QUESTION     : '?' ;

// Numbers and units
NUMBER       : '-'? [0-9]+ ( '.' [0-9]+ )? ( [a-z%]+ )? 
             | '-'? '.' [0-9]+ ( [a-z%]+ )? ;

// Identifiers
IDENT        : '-'? NMSTART NMCHAR* ;

// Skips
WS           : [ \t\r\n]+ -> skip ;
COMMENT      : '/*' .*? '*/' -> skip ;
