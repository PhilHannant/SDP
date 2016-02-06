package worksheet5.abstractfactory;

/**
 * Created by philhannant on 05/02/2016.
 */
public class NYCFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NYC Parsing feedback XML...");
        return "NYC Feedback XML Message";
    }
}
