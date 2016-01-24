package decorator;

/**
 * Created by philhannant on 23/01/2016.
 */
public class GreenOlives extends PizzaDecorator{

    public GreenOlives(Pizza pizza) {
    }

    @Override
    public String getDesc() {
        return "Green Olives'";
    }

    @Override
    public double getPrice() {
        return 5.47;
    }
}
