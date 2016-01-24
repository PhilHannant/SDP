package decorator;

/**
 * Created by philhannant on 23/01/2016.
 */
public class RomaTomatoes extends PizzaDecorator{

    public RomaTomatoes(Pizza pizza) {
        super(pizza);;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Roma Tomatoes (5.20)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 5.20;
    }
}
