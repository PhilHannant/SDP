package worksheet5.abstractfactory;

/**
 * Created by philhannant on 05/02/2016.
 */
public class NYCOrderXMLParser implements XMLParser {

    @Override
    public String parse() {
        System.out.println("NYC Parsing order XML...");
        return "NYC Order XML Message";
    }
}
