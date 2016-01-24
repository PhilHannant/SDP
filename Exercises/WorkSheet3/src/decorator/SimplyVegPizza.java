package decorator;

/**
 * Created by philhannant on 24/01/2016.
 */
    public class SimplyVegPizza implements Pizza{


        @Override
        public String getDesc() {
            return "SimplyVegPizza";
        }

        @Override
        public double getPrice() {
            return 230;
        }
    }


