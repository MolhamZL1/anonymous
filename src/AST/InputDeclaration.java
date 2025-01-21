package AST;

public class InputDeclaration implements ASTNode {
    private Literal literal;
    private Property property;

    public InputDeclaration(Literal literal, Property property) {
        this.literal = literal;
        this.property = property;
    }

    public Literal getLiteral() {
        return literal;
    }

    public Property getProperty() {
        return property;
    }

    @Override
    public String toString() {
        return "\nInputDeclaration{" +
                literal +
                property + '\'' +
                "\n}";
    }
}
