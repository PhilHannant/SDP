package worksheet5.bridge;

/**
 * Created by philhannant on 09/02/2016.
 */
public abstract class Car {

    private final Product product;
    private final String car;

    public Car(Product product, String car) {
        this.product = product;
        this.car = car;
    }

    public abstract void assemble();
    public abstract void produceProduct();

    public void printDetails(){

    }

}
