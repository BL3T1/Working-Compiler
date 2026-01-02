package ast;

import visitor.AstVisitor;

public class HtmlTextNode extends AstNode {
    private String text;

    public HtmlTextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitHtmlText(this);
    }
}
