package worksheet5.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by philhannant on 09/02/2016.
 */



public class HtmlParentElement extends HtmlTag {

    private String name;
    private String endTag = "";
    private String startTag = "";
    private List<HtmlTag>childTags = new ArrayList<>();

    public HtmlParentElement(String name){
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


    @Override
    public void addChildTag(HtmlTag htmlTag) {
        childTags.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        childTags.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return childTags;
    }
}
