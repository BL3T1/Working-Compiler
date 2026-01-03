package AST;

public class LiteralNode extends ExpressionNode{

    public Object value;
    public String type;

    public LiteralNode(String type, Object val, int line) {
        super("Literal", line);
        this.type = type;
        this.value = val;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + type + ": " + value);
    }
}
