parser grammar HtmlJinjaParser;
options { tokenVocab = HtmlJinjaLexer; }

html : htmlContent* EOF
     | EOF ;
htmlContent : jinjaExpr | jinjaStmt | jinjaComment | element | htmlText ;

element : voidTag #voidElement
        | tagOpen tagContent tagClose #tagElementWithContent
        | tagOpen tagClose #tagElementEmpty
        | selfClosingTag #selfClosingElement
        | scriptTag #scriptElement
        | styleTag #styleElement ;

tagOpen : TAG_OPEN TAG_NAME (attribute | jinjaExpr | jinjaStmt)* TAG_CLOSE #regularTag
        | LINK_OPEN (attribute | jinjaExpr | jinjaStmt)* TAG_CLOSE #linkTag ;

tagClose : TAG_CLOSE_OPEN TAG_NAME? TAG_CLOSE ;

selfClosingTag : TAG_OPEN TAG_NAME (attribute | jinjaExpr | jinjaStmt)* TAG_SLASH_CLOSE #regularSelfClosing
               | LINK_OPEN (attribute | jinjaExpr | jinjaStmt)* TAG_SLASH_CLOSE #linkSelfClosing ;

voidTag : TAG_OPEN TAG_NAME (attribute | jinjaExpr | jinjaStmt)* TAG_CLOSE #regularVoidTag
        | LINK_OPEN (attribute | jinjaExpr | jinjaStmt)* TAG_CLOSE #linkVoidTag ;

scriptTag : SCRIPT_OPEN scriptAttribute* SCRIPT_TAG_CLOSE scriptContent SCRIPT_CLOSE ;

scriptContent : ( scriptContentText | jinjaExpr | jinjaStmt )* ;

scriptContentText : SCRIPT_CONTENT_TEXT ;

styleTag : STYLE_OPEN styleAttribute* STYLE_TAG_CLOSE styleContent STYLE_CLOSE ;

styleContent : ( styleContentText | jinjaExpr | jinjaStmt )* ;

styleContentText : STYLE_CONTENT_TEXT ;

tagContent : ( element | jinjaExpr | jinjaStmt | jinjaComment | htmlText )* ;

attribute : (ATTR_NAME | TAG_NAME) ATTR_EQ ATTR_VALUE #attrWithValue
          | (ATTR_NAME | TAG_NAME) #attrWithoutValue
          ;

scriptAttribute : SCRIPT_ATTR_NAME ( SCRIPT_ATTR_EQ scriptAttrValue )? #scriptAttrWithValue
                | SCRIPT_ATTR_NAME #scriptAttrWithoutValue ;

scriptAttrValue : SCRIPT_ATTR_VALUE_START scriptAttrValueContent* SCRIPT_ATTR_VALUE_END #scriptAttrValueDouble
               | SCRIPT_ATTR_VALUE_START_SINGLE scriptAttrValueContentSingle* SCRIPT_ATTR_VALUE_END_SINGLE #scriptAttrValueSingle
               | SCRIPT_ATTR_VALUE_UNQUOTED #scriptAttrValueUnquoted ;

scriptAttrValueContent : SCRIPT_ATTR_VALUE_TEXT
                       | SCRIPT_ATTR_VALUE_OPEN_EXPR EXPR_CONTENT CLOSE_EXPR
                       | SCRIPT_ATTR_VALUE_OPEN_STMT STMT_CONTENT CLOSE_STMT ;

scriptAttrValueContentSingle : SCRIPT_ATTR_VALUE_TEXT_SINGLE
                             | SCRIPT_ATTR_VALUE_OPEN_EXPR_SINGLE EXPR_CONTENT CLOSE_EXPR
                             | SCRIPT_ATTR_VALUE_OPEN_STMT_SINGLE STMT_CONTENT CLOSE_STMT ;

styleAttribute : STYLE_ATTR_NAME ( STYLE_ATTR_EQ styleAttrValue )? #styleAttrWithValue
               | STYLE_ATTR_NAME #styleAttrWithoutValue ;

styleAttrValue : STYLE_ATTR_VALUE_START styleAttrValueContent* STYLE_ATTR_VALUE_END #styleAttrValueDouble
              | STYLE_ATTR_VALUE_START_SINGLE styleAttrValueContentSingle* STYLE_ATTR_VALUE_END_SINGLE #styleAttrValueSingle
              | STYLE_ATTR_VALUE_UNQUOTED #styleAttrValueUnquoted ;

styleAttrValueContent : STYLE_ATTR_VALUE_TEXT
                      | STYLE_ATTR_VALUE_OPEN_EXPR EXPR_CONTENT CLOSE_EXPR
                      | STYLE_ATTR_VALUE_OPEN_STMT STMT_CONTENT CLOSE_STMT ;

styleAttrValueContentSingle : STYLE_ATTR_VALUE_TEXT_SINGLE
                            | STYLE_ATTR_VALUE_OPEN_EXPR_SINGLE EXPR_CONTENT CLOSE_EXPR
                            | STYLE_ATTR_VALUE_OPEN_STMT_SINGLE STMT_CONTENT CLOSE_STMT ;

htmlText : HTML_TEXT ;

jinjaExpr : OPEN_EXPR EXPR_CONTENT CLOSE_EXPR
          | TAG_OPEN_EXPR EXPR_CONTENT CLOSE_EXPR
          | SCRIPT_OPEN_EXPR EXPR_CONTENT CLOSE_EXPR
          | STYLE_OPEN_EXPR EXPR_CONTENT CLOSE_EXPR
          | SCRIPT_JINJA_EXPR EXPR_CONTENT CLOSE_EXPR
          | STYLE_JINJA_EXPR EXPR_CONTENT CLOSE_EXPR ;

jinjaStmt : OPEN_STMT STMT_CONTENT CLOSE_STMT
          | TAG_OPEN_STMT STMT_CONTENT CLOSE_STMT
          | SCRIPT_OPEN_STMT STMT_CONTENT CLOSE_STMT
          | STYLE_OPEN_STMT STMT_CONTENT CLOSE_STMT
          | SCRIPT_JINJA_STMT STMT_CONTENT CLOSE_STMT
          | STYLE_JINJA_STMT STMT_CONTENT CLOSE_STMT ;

jinjaComment : OPEN_COMMENT COMMENT_CONTENT CLOSE_COMMENT ;
