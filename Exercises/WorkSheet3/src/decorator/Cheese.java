package decorator;

/**
 * Created by philhannant on 23/01/2016.
 */
public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() +  " Cheese";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 20.72;
    }
}
