package worksheet5.builder;

/**
 * Created by philhannant on 08/02/2016.
 */
public class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public void build(){
        carBuilder.buildBodyStyle();
        carBuilder.buildBreaks();
        carBuilder.buildEngine();
        carBuilder.buildPower();
        carBuilder.buildFuelType();
        carBuilder.buildSeats();
        carBuilder.buildWindows();

    }
}
