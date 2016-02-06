package worksheet5.abstractfactory;

/**
 * Created by philhannant on 05/02/2016.
 */
public class NYCFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType.equalsIgnoreCase("NYCError")){
            return new NYCErrorXMLParser();
        } else if (parserType.equalsIgnoreCase("NYCFeedback")){
            return new NYCFeedbackXMLParser();
        } else if (parserType.equalsIgnoreCase("NYCOrder")){
            return new NYCOrderXMLParser();
        } else if (parserType.equalsIgnoreCase("NYCResponse")){
            return new NYCResponseXMLParser();
        } else {
            System.out.println("Parser Type not recognised");
            return null;
        }
    }
}
