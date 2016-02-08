package worksheet5.builder;

/**
 * Created by philhannant on 08/02/2016.
 */
public abstract class CarBuilder {

    protected Car car;

    public Car getCar(){
        return car;
    }

    public abstract void setCar(String carType);

    public abstract void buildBodyStyle();

    public abstract void buildPower();

    public abstract void buildEngine();

    public abstract void buildBreaks();

    public abstract void buildSeats();

    public abstract void buildWindows();

    public abstract void buildFuelType();


}
