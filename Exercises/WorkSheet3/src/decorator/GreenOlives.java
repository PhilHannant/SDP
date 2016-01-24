package decorator;

/**
 * Created by philhannant on 23/01/2016.
 */
public class GreenOlives extends PizzaDecorator{

    public GreenOlives(Pizza pizza) {
        super(pizza);;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() +  " Green Olives'";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 5.47;
    }
}
