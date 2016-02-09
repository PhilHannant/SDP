package worksheet5.bridge;

/**
 * Created by philhannant on 09/02/2016.
 */
public class GearLocking implements Product {

    private String productName;

    public GearLocking(String productName){
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Gear Locking System");
    }
}
