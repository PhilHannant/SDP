package worksheet5.abstractfactory;

import scala.reflect.internal.Types;

/**
 * Created by philhannant on 05/02/2016.
 */
public class LondonFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType.equalsIgnoreCase("LondonError")){
            return new LondonErrorXMLParser();
        } else if (parserType.equalsIgnoreCase("LondonFeedback")){
            return new LondonFeedbackXMLParser();
        } else if (parserType.equalsIgnoreCase("LondonOrder")){
            return new LondonOrderXMLParser();
        } else if (parserType.equalsIgnoreCase("LondonResponse")){
            return new LondonResponseXMLParser();
        } else {
            System.out.println("Parser Type not recognised");
            return null;
        }
    }
}
