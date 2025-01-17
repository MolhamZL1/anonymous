package AST;

public class PropertyDeclaration implements ASTNode {
    private Modifier modifier; // Optional modifier
    private Property property; // The property
    private ASTNode value;     // Optional assigned value (expression)

    public PropertyDeclaration(Modifier modifier, Property property, ASTNode value) {
        this.modifier = modifier;
        this.property = property;
        this.value = value;
    }

    public Modifier getModifier() {
        return modifier;
    }

    public Property getProperty() {
        return property;
    }

    public ASTNode getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "\nPropertyDeclaration{" +
                modifier != null ?   "\nmodifier=" + modifier : "" +
                ", \nproperty=" + property +
                value != null ? ",\n value=" +  value : "" +
                "\n}";
    }
}
