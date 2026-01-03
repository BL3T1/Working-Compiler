lexer grammar FlaskLexer;


tokens {
    INDENT,
    DEDENT
}

@header{
package antlr;
import org.antlr.v4.runtime.*;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
}




@members {
    private Stack<Integer> indentionLength = new Stack<>();
    private Queue<Token> pendingTokens = new LinkedList<>();

    @Override
    public Token nextToken() {
        if (indentionLength.isEmpty()) {
            indentionLength.push(0);
        }

        if (!pendingTokens.isEmpty()) {
            return pendingTokens.poll();
        }

        Token t = super.nextToken();

        if (t.getType() == Token.EOF) {
            handleEOF(t);
            return pendingTokens.poll();
        }
        else if (t.getType() == NEWLINE) {
            handleNewLine(t);
            if (!pendingTokens.isEmpty()) {
                return pendingTokens.poll();
            }
        }

        return t;
    }



    private void handleNewLine(Token t) {
        String text = t.getText();
        int newLineIndex = text.lastIndexOf('\n');
        String spaces = text.substring(newLineIndex + 1);
        int currentIndent = spaces.length();
        int previousIndent = indentionLength.peek();



        if (currentIndent > previousIndent) {
            indentionLength.push(currentIndent);
            pendingTokens.add(createToken(t, INDENT, "INDENT"));
        } else if (currentIndent < previousIndent) {
            while (currentIndent < indentionLength.peek()) {
                indentionLength.pop();
                pendingTokens.add(createToken(t, DEDENT, "DEDENT"));
            }
        }
    }



    private void handleEOF(Token eofToken) {
        while (indentionLength.size() > 1) {
            indentionLength.pop();
            pendingTokens.add(createToken(eofToken, DEDENT, ""));
        }
        pendingTokens.add(eofToken);
    }




    private CommonToken createToken(Token source, int type, String text) {
        CommonToken token;
        if (source != null) {
            token = new CommonToken(source);
        } else {
            token = new CommonToken(type, text);
        }
        token.setType(type);
        if (text != null) token.setText(text);
        return token;
    }
}



// 1. OOP keywords
CLASS: 'class';
DEF: 'def';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
ELIF: 'elif';
IMPORT: 'import';
FOR: 'for';
WHILE: 'while';
TRUE: 'True';
FALSE: 'False';
FINALLY: 'finally';
BREAK: 'break';
CONTINUE: 'continue';
RANGE: 'range';
PRINT: 'print';
END_KEYWORD: 'end';
NONE: 'none';
INT: 'int';
FLOAT: 'float';
DOUBLE: 'double';
LIST: 'list';
TUPLE: 'tuple';
STRING: 'str';
BOOLEAN: 'bool';
TYPE: 'type';
IS: 'is';
IS_NOT: 'is not';
IN: 'in';
NOT_IN: 'not in';

// Operators
EQUAL: '=';
NOT_EQUAL: '!=';
EQ_EQ: '==';
COLON: ':';
SEMICOLON: ';';
COMMA: ',';
DOT: '.';
OPAREN: '(';
CPAREN: ')';
OBRAC: '{';
CBRAC: '}';
OSBRAC: '[';
CSBRAC: ']';
ADD: '+';
MINUS: '-';
STAR: '*';
DIV: '/';
MOD: '%';
OB: '<';
CB: '>';
OBQ: '<=';
CBQ: '>=';
AND: 'and';
OR: 'or';
NOT: 'not';

// Flask keywords
ROUTE_DECORATOR:'@app.route';
RENDER_TEMPLATE: 'render_template';

STRING_LITERAL:
 '"' (~["\r\n])* '"'
 | '\'' (~['\r\n])* '\''
 ;

INTEGER_LITERAL: '0' | [1-9][0-9]*;

FLOAT_LITERAL:
 ([0-9]+'.'[0-9]*)
| ('.'[0-9]+)
;

ID: [a-zA-Z_] [a-zA-Z_0-9]*;

COMMENT
    : '#' .*? ('\r'? '\n' | EOF) -> skip ;

//NEWLINE
//    : '\r'? '\n' [ \t]*
//    ;

NEWLINE:
'\r'? '\n' ([ \t]* '\r'? '\n')* [ \t]* ;

WS : [ \t]+ -> skip ;