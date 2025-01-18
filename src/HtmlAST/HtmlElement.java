package HtmlAST;

import java.util.ArrayList;
import java.util.List;
import AST.ASTNode;

public class HtmlElement implements ASTNode {
    private String tagName;
    private List<ASTNode> attributes = new ArrayList<>();
    private ASTNode content;
    private boolean selfClosing = false;
    private String closingTagName;

    // For Script and Style
    private Script scriptContent;
    private Style styleContent;

    // Getters and Setters
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<ASTNode> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ASTNode> attributes) {
        this.attributes = attributes;
    }

    public ASTNode getContent() {
        return content;
    }

    public void setContent(ASTNode content) {
        this.content = content;
    }

    public boolean isSelfClosing() {
        return selfClosing;
    }

    public void setSelfClosing(boolean selfClosing) {
        this.selfClosing = selfClosing;
    }

    public String getClosingTagName() {
        return closingTagName;
    }

    public void setClosingTagName(String closingTagName) {
        this.closingTagName = closingTagName;
    }

    public Script getScriptContent() {
        return scriptContent;
    }

    public void setScriptContent(Script scriptContent) {
        this.scriptContent = scriptContent;
    }

    public Style getStyleContent() {
        return styleContent;
    }

    public void setStyleContent(Style styleContent) {
        this.styleContent = styleContent;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("HtmlElement{")
                .append("tagName='").append(tagName).append('\'')
                .append(", attributes=").append(attributes)
                .append(", content=").append(content)
                .append(", selfClosing=").append(selfClosing)
                .append(", closingTagName='").append(closingTagName).append('\'')
                .append(", scriptContent='").append(scriptContent).append('\'')
                .append(", styleContent='").append(styleContent).append('\'')
                .append('}');
        return builder.toString();
    }
}
