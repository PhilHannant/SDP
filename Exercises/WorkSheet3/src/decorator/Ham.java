package decorator;

/**
 * Created by philhannant on 23/01/2016.
 */
public class Ham extends PizzaDecorator {

    public Ham (Pizza pizza) {
    }

    @Override
    public String getDesc() {
        return "Ham";
    }

    @Override
    public double getPrice() {
        return 18.12;
    }
}
