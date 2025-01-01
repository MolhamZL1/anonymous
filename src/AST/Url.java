package AST;

public class Url implements ASTNode {
    private String url;

    public Url(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Url{" +
                  url +
                '}';
    }
}
