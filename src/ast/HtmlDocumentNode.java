package ast;

import visitor.AstVisitor;
import java.util.List;
import java.util.ArrayList;

public class HtmlDocumentNode extends AstNode {
    private List<AstNode> children;

    public HtmlDocumentNode() {
        this.children = new ArrayList<>();
    }

    public HtmlDocumentNode(List<AstNode> children) {
        this.children = children != null ? children : new ArrayList<>();
    }

    public List<AstNode> getChildren() {
        return children;
    }

    public void addChild(AstNode child) {
        if (child != null) {
            children.add(child);
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitHtmlDocument(this);
    }
}

