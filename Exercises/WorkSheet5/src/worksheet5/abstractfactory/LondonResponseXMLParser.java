package worksheet5.abstractfactory;

/**
 * Created by philhannant on 05/02/2016.
 */
public class LondonResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("London Parsing response XML...");
        return "London Response XML Message";
    }
}
