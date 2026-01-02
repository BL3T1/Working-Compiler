package ast;

import visitor.AstVisitor;

public class JinjaCommentNode extends AstNode {
    private String comment;

    public JinjaCommentNode(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitJinjaComment(this);
    }
}
