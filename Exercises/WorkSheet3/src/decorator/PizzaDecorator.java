package decorator;

/**
 * Created by philhannant on 23/01/2016.
 */
public abstract class PizzaDecorator implements Pizza {

    public Pizza pizza;

    public abstract String getDesc();

}
