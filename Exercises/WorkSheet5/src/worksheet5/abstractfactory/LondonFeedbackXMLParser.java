package worksheet5.abstractfactory;

/**
 * Created by philhannant on 05/02/2016.
 */
public class LondonFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("London Parsing feedback XML...");
        return "London Feedback XML Message";
    }
}
