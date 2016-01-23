package singleton;

/**
 * Created by philhannant on 23/01/2016.
 */
public class SingletonDL {

    private static volatile SingletonDL singleton;

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
}
}
