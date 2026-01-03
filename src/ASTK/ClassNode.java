package AST;

public class ClassNode extends DefinitionNode{

    public String name;
    public String parent;
    public BlockNode body;

    public ClassNode(String name, String parent, BlockNode body, int line) {
        super("ClassDefinition", line);
        this.name = name;
        this.parent = parent;
        this.body = body;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + NodeName + " [Name: " + name + (parent != null ? ", Inherits: " + parent : "") + "]");
        body.print(indent + "  ");
    }
}
