package HtmlAST;

import java.util.ArrayList;
import java.util.List;
import AST.ASTNode;

public class HtmlElements implements ASTNode {
    private List<ASTNode> preMisc = new ArrayList<>();
    private HtmlElement htmlElement;
    private List<ASTNode> postMisc = new ArrayList<>();

    public List<ASTNode> getPreMisc() {
        return preMisc;
    }

    public void setPreMisc(List<ASTNode> preMisc) {
        this.preMisc = preMisc;
    }

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    public List<ASTNode> getPostMisc() {
        return postMisc;
    }

    public void setPostMisc(List<ASTNode> postMisc) {
        this.postMisc = postMisc;
    }

    public void addPreMisc(ASTNode misc) {
        this.preMisc.add(misc);
    }

    public void addPostMisc(ASTNode misc) {
        this.postMisc.add(misc);
    }

    @Override
    public String toString() {
        return "HtmlElements{" +
                "preMisc=" + preMisc +
                ", htmlElement=" + htmlElement +
                ", postMisc=" + postMisc +
                '}';
    }
}
