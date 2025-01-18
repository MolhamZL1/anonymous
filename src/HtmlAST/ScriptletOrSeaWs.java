package HtmlAST;

import AST.ASTNode;

public class ScriptletOrSeaWs implements ASTNode {
    private String content;

    public ScriptletOrSeaWs(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ScriptletOrSeaWs{" +
                "content='" + content + '\'' +
                '}';
    }
}
