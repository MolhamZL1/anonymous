package HtmlAST;

import AST.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class HtmlDocument implements ASTNode {
    private List<ScriptletOrSeaWs> preXmlScriptlets = new ArrayList<>();
    private String xmlDeclaration;
    private List<ScriptletOrSeaWs> preDtdScriptlets = new ArrayList<>();
    private String dtdDeclaration;
    private List<ScriptletOrSeaWs> postDtdScriptlets = new ArrayList<>();
    private List<HtmlElements> htmlElements = new ArrayList<>();

    public void addPreXmlScriptlets(ScriptletOrSeaWs preXmlScriptlet) {
         preXmlScriptlets.add(preXmlScriptlet);
    }



    public String getXmlDeclaration() {
        return xmlDeclaration;
    }

    public void setXmlDeclaration(String xmlDeclaration) {
        this.xmlDeclaration = xmlDeclaration;
    }



    public void setPreDtdScriptlets(ScriptletOrSeaWs preDtdScriptlet) {
        this.preDtdScriptlets.add(  preDtdScriptlet);
    }

    public String getDtdDeclaration() {
        return dtdDeclaration;
    }

    public void setDtdDeclaration(String dtdDeclaration) {
        this.dtdDeclaration = dtdDeclaration;
    }


    public void setPostDtdScriptlets(ScriptletOrSeaWs postDtdScriptlet) {
        this.postDtdScriptlets.add( postDtdScriptlet);
    }

    public void setHtmlElements(HtmlElements htmlElement) {
        this.htmlElements.add(htmlElement) ;
    }

    @Override
    public String toString() {
        return "HtmlDocument{" +
                "preXmlScriptlets=" + preXmlScriptlets +
                ", xmlDeclaration='" + xmlDeclaration + '\'' +
                ", preDtdScriptlets=" + preDtdScriptlets +
                ", dtdDeclaration='" + dtdDeclaration + '\'' +
                ", postDtdScriptlets=" + postDtdScriptlets +
                ", htmlElements=" + htmlElements +
                '}';
    }
}
