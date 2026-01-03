package AST;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends ASTNode {

    public List<ASTNode> elements = new ArrayList<>();

    public ProgramNode(int LineNumber) {
        super("Program", LineNumber);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + NodeName  + " (Line: " + LineNumber + ")");
        for (ASTNode node : elements) {
            node.print(indent + "  ");
        }
    }
}
