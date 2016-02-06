package worksheet5.abstractfactory;

/**
 * Created by philhannant on 05/02/2016.
 */
public class LondonErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("London Parsing error XML...");
        return "London Error XML Message";
    }
}
