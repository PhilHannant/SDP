package worksheet5.bridge;

/**
 * Created by philhannant on 09/02/2016.
 */
public class CentralLocking implements Product {

    private String productName;

    public CentralLocking(String productName){
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System");
    }
}
