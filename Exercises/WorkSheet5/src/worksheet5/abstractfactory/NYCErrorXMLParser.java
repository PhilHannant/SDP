package worksheet5.abstractfactory;

/**
 * Created by philhannant on 05/02/2016.
 */
public class NYCErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
            System.out.println("NYC Parsing error XML...");
            return "NYC Error XML Message";
            }
}
