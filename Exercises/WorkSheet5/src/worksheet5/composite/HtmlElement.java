package worksheet5.composite;

/**
 * Created by philhannant on 09/02/2016.
 */
public class HtmlElement extends HtmlTag {

    private String name;
    private String endTag;
    private String startTag;

    public HtmlElement(String name){
        this.name = name;
    }


    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public void setStartTag(String tag) {

    }

    @Override
    public void setEndTag(String tag) {

    }

    @Override
    public void generateHtml() {

    }
}
