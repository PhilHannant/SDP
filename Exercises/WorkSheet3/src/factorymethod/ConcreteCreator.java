package factorymethod;

/**
 * Created by philhannant on 22/01/2016.
 */
public class ConcreteCreator extends Creator{

    protected Product factoryMethod(){
        return new ConcreteProduct();
    }
}
