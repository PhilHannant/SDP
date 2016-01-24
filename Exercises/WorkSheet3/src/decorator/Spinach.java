package decorator;

/**
 * Created by philhannant on 23/01/2016.
 */
public class Spinach extends PizzaDecorator {

    public Spinach(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + " Spinach";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 7.92;
    }
}
