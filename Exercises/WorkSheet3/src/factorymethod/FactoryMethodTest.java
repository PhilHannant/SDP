package factorymethod;

/**
 * Created by philhannant on 22/01/2016.
 */
public class FactoryMethodTest {

    public static void main(String[] args){
        Creator cr = new ConcreteCreator();
        cr.productCreator();
        System.out.println(cr.getClass());
    }

}
