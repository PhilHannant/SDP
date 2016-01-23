package decorator;

/**
 * Created by philhannant on 23/01/2016.
 */
public class RomaTomatoes implements Pizza{

    public RomaTomatoes(Pizza pizza) {
    }

    @Override
    public String getDesc() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
