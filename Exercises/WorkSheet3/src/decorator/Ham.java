package decorator;

/**
 * Created by philhannant on 23/01/2016.
 */
public class Ham extends PizzaDecorator {

    public Ham (Pizza pizza) {
        super(pizza);;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Ham (18.72)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 18.12;
    }
}
