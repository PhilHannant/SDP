package decorator;

/**
 * Created by philhannant on 23/01/2016.
 */
public abstract class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDesc(){
        return pizza.getDesc();

    }

}
