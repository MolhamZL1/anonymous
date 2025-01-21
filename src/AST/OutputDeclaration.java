package AST;

public class OutputDeclaration implements ASTNode {
    private Literal literal;
    private ObjectDeclaration objectDeclaration;

    public OutputDeclaration(Literal literal, ObjectDeclaration objectDeclaration) {
        this.literal = literal;
        this.objectDeclaration = objectDeclaration;
    }

    public Literal getLiteral() {
        return literal;
    }

    public ObjectDeclaration getObjectDeclaration() {
        return objectDeclaration;
    }

    @Override
    public String toString() {
        return "\nOutputDeclaration{" +
                  "literal=" +  literal +
                ", objectDeclaration=" + objectDeclaration +
                "\n}";
    }
}
