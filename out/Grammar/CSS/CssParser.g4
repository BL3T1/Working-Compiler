parser grammar CssParser;
options { tokenVocab = CssLexer; }

stylesheet : ( rule | atRule )* EOF ;

rule : selector LBRACE declaration* RBRACE ;

selector : simpleSelector ( simpleSelector | combinator simpleSelector )* ( COMMA selector )? ;

simpleSelector : ( typeSelector | universal ) ( HASH | class | attrib | pseudo )* #simpleSelectorWithType
               | HASH ( HASH | class | attrib | pseudo )* #simpleSelectorModifiersOnly
               | class ( HASH | class | attrib | pseudo )* #simpleSelectorModifiersOnly
               | attrib ( HASH | class | attrib | pseudo )* #simpleSelectorModifiersOnly
               | pseudo ( HASH | class | attrib | pseudo )* #simpleSelectorModifiersOnly
               ;

typeSelector : IDENT ;

universal : STAR ;

class : DOT IDENT ;

attrib : SQUARE_OPEN IDENT ( ( EQUALS | TILDE_EQUALS | PIPE_EQUALS | CARET_EQUALS | DOLLAR_EQUALS | STAR_EQUALS ) ( IDENT | STRING ) ) SQUARE_CLOSE #attribWithValue
       | SQUARE_OPEN IDENT SQUARE_CLOSE #attribWithoutValue ;

pseudo : COLON IDENT ( LPAREN pseudoExpr? RPAREN )? #pseudoClass
       | DOUBLE_COLON IDENT ( LPAREN pseudoExpr? RPAREN )? #pseudoElement
       | COLON NOT ( LPAREN pseudoExpr? RPAREN )? #notPseudo ;

pseudoExpr : ( NUMBER | IDENT | STRING | PLUS | MINUS | STAR | SLASH | COLON | NOT | pseudo )+ ;

combinator : GREATER #childCombinator
           | PLUS #adjacentSiblingCombinator
           | TILDE #generalSiblingCombinator ;

declaration : property COLON value ( SEMICOLON | EOF ) ;

property : IDENT #identProperty
         | VAR #varProperty ;

value : valuePart+ ;

valuePart : IDENT #identValue
          | VAR #varValue
          | NUMBER #numberValue
          | STRING #stringValue
          | HASH #hashValue
          | IMPORTANT #importantValue
          | URL ( STRING | IDENT | NUMBER | SLASH | COLON | DOT | QUESTION | EQUALS | AND | MINUS | PLUS )* RPAREN #urlValue
          | LPAREN value RPAREN #parenValue
          | COMMA #commaValue
          | DOT #dotValue
          | COLON #colonValue
          | SLASH #slashValue
          | GREATER #greaterValue
          | PLUS #plusValue
          | MINUS #minusValue
          | STAR #starValue
          | TILDE #tildeValue
          | EQUALS #equalsValue
          | QUESTION #questionValue ;

atRule : AT_RULE ( atRuleValue | URL ( STRING | IDENT | NUMBER )? RPAREN )* atRuleBody ;

atRuleBody : LBRACE ( rule | declaration | atRule )* RBRACE #atRuleWithBlock
           | SEMICOLON #atRuleWithoutBlock ;

atRuleValue : IDENT #atRuleIdent
           | VAR #atRuleVar
           | STRING #atRuleString
           | NUMBER #atRuleNumber
           | HASH #atRuleHash
           | COMMA #atRuleComma
           | LPAREN #atRuleLParen
           | RPAREN #atRuleRParen
           | COLON #atRuleColon
           | URL #atRuleUrl
           | GREATER #atRuleGreater
           | PLUS #atRulePlus
           | TILDE #atRuleTilde
           | SLASH #atRuleSlash
           | DOT #atRuleDot
           | EQUALS #atRuleEquals
           | MINUS #atRuleMinus
           | STAR #atRuleStar
           | AND #atRuleAnd
           | QUESTION #atRuleQuestion ;
