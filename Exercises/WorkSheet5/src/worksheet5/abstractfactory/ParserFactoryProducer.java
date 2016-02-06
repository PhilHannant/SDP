package worksheet5.abstractfactory;


/**
 * Created by philhannant on 05/02/2016.
 */
public class ParserFactoryProducer {

    public static AbstractParserFactory getFactory(String factoryType) {
        if(factoryType.equalsIgnoreCase("NYCFactory")){
            return new NYCFactory();
        } else if (factoryType.equalsIgnoreCase("LondonFactory")){
            return new LondonFactory();
        } else {
            System.out.println("Factory type not recognised!!");
        }
    }
}
