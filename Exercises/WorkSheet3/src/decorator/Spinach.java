package decorator;

/**
 * Created by philhannant on 23/01/2016.
 */
public class Spinach extends PizzaDecorator {

    public Spinach(Pizza pizza) {
    }

    @Override
    public String getDesc() {
        return "Spinach";
    }

    @Override
    public double getPrice() {
        return 7.92;
    }
}
