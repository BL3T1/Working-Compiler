package ast;

import visitor.AstVisitor;

public class CssValuePartNode extends AstNode {
    private String value;
    private String type; // "string", "number", "ident", "url", "var", etc.

    public CssValuePartNode(String value) {
        this.value = value;
        this.type = "ident";
    }

    public CssValuePartNode(String value, String type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    @SuppressWarnings("deprecation")
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssValuePart(this);
    }
}

