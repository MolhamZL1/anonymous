package AST;

public class ObjectName implements ASTNode {
    private String name;
    private ObjectType type;

    public ObjectName(String name, ObjectType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public ObjectType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\nObjectName{" +
                "name='" + name + '\'' +
                ", type=" + (type != null ? type.toString() : "null") +
                "\n}";
    }
}
