package AST;

public class Property implements ASTNode {
    private String name;
    private ASTNode value;


    public Property(String name, ASTNode value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public ASTNode getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "\nProperty{" +
                "name=" + name +
                ", value=" + value +
                "\n}";
    }
}
