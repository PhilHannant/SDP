package singleton;

/**
 * Created by philhannant on 23/01/2016.
 */
public class SingletonLazy {

    private static SingletonLazy singleton;


    public static synchronized SingletonLazy getInstance() {
        if (singleton == null) {
            singleton = new SingletonLazy();
        }
        return singleton;
    }
}
