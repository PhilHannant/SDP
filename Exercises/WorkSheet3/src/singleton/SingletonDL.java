package singleton;

/**
 * Created by philhannant on 23/01/2016.
 */
public class SingletonDL {

    private static volatile SingletonDL singleton;
    private static double number;

    private SingletonDL(){
        number = Math.random() * 10;

    }

    public static synchronized SingletonDL getInstance() {

        if (singleton == null) {
            synchronized (SingletonDL.class) {

                if (singleton == null) {
                    singleton = new SingletonDL();
                }
            }
        }
        return singleton;
    }

    public double getNumber(){
        return number;
    }
}

