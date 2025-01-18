package HtmlAST;

import AST.ASTNode;

public class CDATA implements ASTNode {
    private String data;

    public CDATA(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CDATA{" + "data='" + data + "'}";
    }
}
