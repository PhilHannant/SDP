package worksheet5.abstractfactory;

import com.sun.deploy.xml.XMLParser;

/**
 * Created by philhannant on 05/02/2016.
 */
public interface AbstractParserFactory {

    public XMLParser getParserInstance(String parserType);
}
