package ASTK;

public class AssignmentNode extends StatementNode{


    public String target;
    public ExpressionNode value;

    public AssignmentNode(String target, ExpressionNode value, int line) {
        super("Assignment", line);
        this.target = target;
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + NodeName +"(Line: " + this.LineNumber + ")");
        System.out.println(indent + "  Target: " + target);
        if (value != null) {
            value.print(indent + "  Value: ");
        }
    }

}
