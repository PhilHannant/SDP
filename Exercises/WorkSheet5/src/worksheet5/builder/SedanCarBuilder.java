package worksheet5.builder;

/**
 * Created by philhannant on 08/02/2016.
 */
public class SedanCarBuilder extends CarBuilder {

    private Car sedanCar;

    public SedanCarBuilder(){
        sedanCar = new Car("Sedan");
    }


    @Override
    public Car getCar() {
        return sedanCar;
    }

    public void buildBodyStyle() {
        sedanCar.setBodyStyle("Body: External dimensions: overall length (inches): 202.9,\n" +
                "overall width (inches): 76.2, overall height (inches): 60.7,\n" +
                "wheelbase (inches): 112.9, front track (inches): 65.3,\n" +
                "rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5");
    }

    @Override
    public void buildPower() {
        sedanCar.setPower(" 285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm");
    }

    @Override
    public void buildEngine() {
        sedanCar.setEngine(" 3.5L Duramax V 6 DOHC");
    }

    @Override
    public void buildBreaks() {
        sedanCar.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
    }

    @Override
    public void buildSeats() {
        sedanCar.setSeats("Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats");
    }

    @Override
    public void buildWindows() {
        sedanCar.setWindows("Laminated side windows.Fixed rear window with defroster");
    }

    @Override
    public void buildFuelType() {
        sedanCar.setFuelType("Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range");
    }

}

