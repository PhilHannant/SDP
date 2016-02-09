package worksheet5.bridge;

/**
 * Created by philhannant on 09/02/2016.
 */
public class BigWheel extends Car {

    private final Product product;
    private final String car;

    public BigWheel(Product product, String car){
        super(product, car);
        this.product = product;
        this.car = car;
    }

    @Override
    public void assemble() {
        System.out.println("Modifying product " + product.productName() + " according to " + car);

    }

    @Override
    public void produceProduct() {
        System.out.println("Producing " + product.productName());
        product.produce();
    }
}
