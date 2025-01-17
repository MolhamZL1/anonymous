package AST.Expressions;



public class IdentifierExpression extends Expression {
    private String name;

    public IdentifierExpression(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
