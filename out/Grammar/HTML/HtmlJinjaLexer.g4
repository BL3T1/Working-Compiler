lexer grammar HtmlJinjaLexer;

DOCTYPE : '<!' [Dd] [Oo] [Cc] [Tt] [Yy] [Pp] [Ee] .*? '>' -> skip ;

PI_START : '<?' -> pushMode(PI_MODE) ;

CDATA_START : '<![CDATA[' -> pushMode(CDATA_MODE) ;

HTML_COMMENT   : '<!--' .*? '-->' -> skip ;

CONDITIONAL_COMMENT : '<!--[if' .*? ']>' .*? '<![endif]-->' -> skip ;

OPEN_EXPR      : '{{' -> pushMode(JINJA_EXPR_MODE) ;
OPEN_STMT      : '{%' -> pushMode(JINJA_STMT_MODE) ;
OPEN_COMMENT   : '{#' -> pushMode(JINJA_COMMENT_MODE) ;

SCRIPT_OPEN    : '<script' -> pushMode(SCRIPT_MODE) ;
STYLE_OPEN     : '<style' -> pushMode(STYLE_MODE) ;
LINK_OPEN      : '<link' -> pushMode(TAG_MODE) ;
TAG_CLOSE_OPEN : '</' -> pushMode(TAG_MODE) ;
TAG_OPEN       : '<' -> pushMode(TAG_MODE) ;

HTML_TEXT      : ~[<{]+ ;

mode TAG_MODE;
  TAG_OPEN_EXPR : '{{' -> pushMode(JINJA_EXPR_MODE) ;
  TAG_OPEN_STMT : '{%' -> pushMode(JINJA_STMT_MODE) ;

  TAG_NAME      : [a-zA-Z][a-zA-Z0-9:-]* ;
  ATTR_NAME     : [a-zA-Z_:][a-zA-Z0-9_.:-]* ;
  ATTR_EQ       : '=' ;
  ATTR_VALUE    : '"' ( ~["\\<] | '\\' . | TAG_OPEN_EXPR | TAG_OPEN_STMT )* '"'
                | '\'' ( ~['\\<] | '\\' . | TAG_OPEN_EXPR | TAG_OPEN_STMT )* '\''
                | ~[> \t\r\n/="']+ ;
  TAG_WS        : [ \t\r\n]+ -> skip ;
  TAG_SLASH     : '/' ;
  TAG_CLOSE     : '>' -> popMode ;
  TAG_SLASH_CLOSE : '/>' -> popMode ;

mode SCRIPT_MODE;
  SCRIPT_OPEN_EXPR : '{{' -> pushMode(JINJA_EXPR_MODE) ;
  SCRIPT_OPEN_STMT : '{%' -> pushMode(JINJA_STMT_MODE) ;
  SCRIPT_ATTR_NAME : [a-zA-Z_:][a-zA-Z0-9_.:-]* ;
  SCRIPT_TAG_NAME : [a-zA-Z][a-zA-Z0-9:-]* ;
  SCRIPT_ATTR_EQ : '=' ;
  SCRIPT_ATTR_VALUE_START : '"' -> pushMode(SCRIPT_ATTR_VALUE_DOUBLE_MODE) ;
  SCRIPT_ATTR_VALUE_START_SINGLE : '\'' -> pushMode(SCRIPT_ATTR_VALUE_SINGLE_MODE) ;
  SCRIPT_ATTR_VALUE_UNQUOTED : ~[> \t\r\n/="']+ ;
  SCRIPT_TAG_WS : [ \t\r\n]+ -> skip ;
  SCRIPT_TAG_CLOSE : '>' -> popMode, pushMode(SCRIPT_CONTENT_MODE) ;
  SCRIPT_TAG_SLASH_CLOSE : '/>' -> popMode ;

mode SCRIPT_ATTR_VALUE_DOUBLE_MODE;
  SCRIPT_ATTR_VALUE_END : '"' -> popMode ;
  SCRIPT_ATTR_VALUE_OPEN_EXPR : '{{' -> pushMode(JINJA_EXPR_MODE) ;
  SCRIPT_ATTR_VALUE_OPEN_STMT : '{%' -> pushMode(JINJA_STMT_MODE) ;
  SCRIPT_ATTR_VALUE_TEXT : (~["\\<{]+ | '\\' .)+ ;

mode SCRIPT_ATTR_VALUE_SINGLE_MODE;
  SCRIPT_ATTR_VALUE_END_SINGLE : '\'' -> popMode ;
  SCRIPT_ATTR_VALUE_OPEN_EXPR_SINGLE : '{{' -> pushMode(JINJA_EXPR_MODE) ;
  SCRIPT_ATTR_VALUE_OPEN_STMT_SINGLE : '{%' -> pushMode(JINJA_STMT_MODE) ;
  SCRIPT_ATTR_VALUE_TEXT_SINGLE : (~['\\<{]+ | '\\' .)+ ;

mode SCRIPT_CONTENT_MODE;
  SCRIPT_JINJA_EXPR : '{{' -> pushMode(JINJA_EXPR_MODE) ;
  SCRIPT_JINJA_STMT : '{%' -> pushMode(JINJA_STMT_MODE) ;

  CDATA_START_IN_SCRIPT : '<![CDATA[' -> pushMode(CDATA_MODE) ;
  SCRIPT_CLOSE : '</script>' -> popMode ;
  SCRIPT_CONTENT_TEXT : (~[<{])+ ;

mode STYLE_MODE;
  STYLE_OPEN_EXPR : '{{' -> pushMode(JINJA_EXPR_MODE) ;
  STYLE_OPEN_STMT : '{%' -> pushMode(JINJA_STMT_MODE) ;
  STYLE_ATTR_NAME : [a-zA-Z_:][a-zA-Z0-9_.:-]* ;
  STYLE_TAG_NAME : [a-zA-Z][a-zA-Z0-9:-]* ;
  STYLE_ATTR_EQ : '=' ;
  STYLE_ATTR_VALUE_START : '"' -> pushMode(STYLE_ATTR_VALUE_DOUBLE_MODE) ;
  STYLE_ATTR_VALUE_START_SINGLE : '\'' -> pushMode(STYLE_ATTR_VALUE_SINGLE_MODE) ;
  STYLE_ATTR_VALUE_UNQUOTED : ~[> \t\r\n/="']+ ;
  STYLE_TAG_WS : [ \t\r\n]+ -> skip ;
  STYLE_TAG_CLOSE : '>' -> popMode, pushMode(STYLE_CONTENT_MODE) ;
  STYLE_TAG_SLASH_CLOSE : '/>' -> popMode ;

mode STYLE_ATTR_VALUE_DOUBLE_MODE;
  STYLE_ATTR_VALUE_END : '"' -> popMode ;
  STYLE_ATTR_VALUE_OPEN_EXPR : '{{' -> pushMode(JINJA_EXPR_MODE) ;
  STYLE_ATTR_VALUE_OPEN_STMT : '{%' -> pushMode(JINJA_STMT_MODE) ;
  STYLE_ATTR_VALUE_TEXT : (~["\\<{]+ | '\\' .)+ ;

mode STYLE_ATTR_VALUE_SINGLE_MODE;
  STYLE_ATTR_VALUE_END_SINGLE : '\'' -> popMode ;
  STYLE_ATTR_VALUE_OPEN_EXPR_SINGLE : '{{' -> pushMode(JINJA_EXPR_MODE) ;
  STYLE_ATTR_VALUE_OPEN_STMT_SINGLE : '{%' -> pushMode(JINJA_STMT_MODE) ;
  STYLE_ATTR_VALUE_TEXT_SINGLE : (~['\\<{]+ | '\\' .)+ ;

mode STYLE_CONTENT_MODE;
  STYLE_JINJA_EXPR : '{{' -> pushMode(JINJA_EXPR_MODE) ;
  STYLE_JINJA_STMT : '{%' -> pushMode(JINJA_STMT_MODE) ;
  CDATA_START_IN_STYLE : '<![CDATA[' -> pushMode(CDATA_MODE) ;
  STYLE_CLOSE : '</style>' -> popMode ;
  STYLE_CONTENT_TEXT : (~[<{])+ ;

mode JINJA_EXPR_MODE;
  EXPR_WS       : [ \t\r\n]+ -> skip ;
  EXPR_CONTENT  : ( ~'}' | '}' ~'}')+ ;
  CLOSE_EXPR    : '}}' -> popMode ;

mode JINJA_STMT_MODE;
  STMT_WS       : [ \t\r\n]+ -> skip ;
  CLOSE_STMT    : '%}' -> popMode ;
  STMT_CONTENT  : (~'%' | '%' ~'}')+ ;

mode JINJA_COMMENT_MODE;
  COMMENT_WS    : [ \t\r\n]+ -> skip ;
  COMMENT_CONTENT : (~'#')+ | '#' ~'}' ;
  CLOSE_COMMENT   : '#}' -> popMode ;

mode CDATA_MODE;
  CDATA_CONTENT : .*? ']]>' -> popMode ;

mode PI_MODE;
  PI_CONTENT : .*? '?>' -> popMode ;
