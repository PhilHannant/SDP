package worksheet5.abstractfactory;

/**
 * Created by philhannant on 05/02/2016.
 */
public class LondonOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("London Parsing order XML...");
        return "London Order XML Message";
    }
}
