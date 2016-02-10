package worksheet5.composite;

/**
 * Created by philhannant on 09/02/2016.
 */
public class HtmlElement extends HtmlTag {

    private String name;
    private String endTag = "";
    private String startTag = "";
    private String tagBody = "";

    public HtmlElement(String name){
        this.name = name;
    }


    @Override
    public String getTagName() {
        return name;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void generateHtml() {

    }

    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    }
