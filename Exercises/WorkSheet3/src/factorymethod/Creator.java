package factorymethod;

/**
 * Created by philhannant on 22/01/2016.
 */
public abstract class Creator {

    public void productCreator(){
        Product product = factoryMethod();
    }

    protected abstract Product factoryMethod();
}
