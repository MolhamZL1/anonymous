package AST;

public class Template implements ASTNode {
    private String template;

    public Template(String template) {
        this.template = template;
    }

    public String getTemplate() {
        return template;
    }

    @Override
    public String toString() {
        return "Template{" +
                 template+"molham"+
                '}';
    }
}
