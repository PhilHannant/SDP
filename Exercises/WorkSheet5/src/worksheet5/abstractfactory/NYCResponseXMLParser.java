package worksheet5.abstractfactory;

/**
 * Created by philhannant on 05/02/2016.
 */
public class NYCResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NYC Parsing response XML...");
        return "NYC Response XML Message";
    }
}
