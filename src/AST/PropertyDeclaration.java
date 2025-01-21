package AST;

public class PropertyDeclaration implements ASTNode {
    private Modifier modifier;
    private Property property;
    private ASTNode value;

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
                 "\nmodifier=" + modifier+
                ", \nproperty=" + property +
             ",\n value=" +  value +
                "\n}";
    }
}
