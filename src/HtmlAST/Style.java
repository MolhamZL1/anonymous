package HtmlAST;

import AST.ASTNode;

public class Style implements ASTNode {
    private String styleContent;  // Contains the content of the style block
    private boolean isShortBody;  // Flag to distinguish between full and short style bodies

    // Constructor for full style body
    public Style(String styleContent) {
        this.styleContent = styleContent;
        this.isShortBody = false;
    }

    // Constructor for short style body
    public Style(String styleContent, boolean isShortBody) {
        this.styleContent = styleContent;
        this.isShortBody = isShortBody;
    }

    // Getter and setter methods
    public String getStyleContent() {
        return styleContent;
    }

    public void setStyleContent(String styleContent) {
        this.styleContent = styleContent;
    }

    public boolean isShortBody() {
        return isShortBody;
    }

    public void setShortBody(boolean shortBody) {
        isShortBody = shortBody;
    }

    @Override
    public String toString() {
        return "Style{" +
                "styleContent='" + styleContent + '\'' +
                ", isShortBody=" + isShortBody +
                '}';
    }
}
