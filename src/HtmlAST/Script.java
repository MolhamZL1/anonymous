package HtmlAST;

import AST.ASTNode;

public class Script implements ASTNode {
    private String scriptContent;  // Contains the content of the script block
    private boolean isShortBody;  // Flag to distinguish between full and short script bodies

    // Constructor for full script body
    public Script(String scriptContent) {
        this.scriptContent = scriptContent;
        this.isShortBody = false;
    }

    // Constructor for short script body
    public Script(String scriptContent, boolean isShortBody) {
        this.scriptContent = scriptContent;
        this.isShortBody = isShortBody;
    }

    // Getter and setter methods
    public String getScriptContent() {
        return scriptContent;
    }

    public void setScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
    }

    public boolean isShortBody() {
        return isShortBody;
    }

    public void setShortBody(boolean shortBody) {
        isShortBody = shortBody;
    }

    @Override
    public String toString() {
        return "Script{" +
                "scriptContent='" + scriptContent + '\'' +
                ", isShortBody=" + isShortBody +
                '}';
    }
}
