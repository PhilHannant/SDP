package worksheet5.bridge;

/**
 * Created by philhannant on 09/02/2016.
 */
public class Motoren extends Car {

    private final Product product;
    private final String car;

    public Motoren(Product product, String car){
        super(product, car);
        this.product = product;
        this.car = car;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + product.productName() + " for " + car);

    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Modifying product " + product.productName() + " according to " + car);
    }
}
