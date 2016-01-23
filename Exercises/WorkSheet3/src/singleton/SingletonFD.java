package singleton;

/**
 * Created by philhannant on 23/01/2016.
 */
public class SingletonFD {

        private static SingletonFD singleton  = new SingletonFD();

        private SingletonFD(){}

        public static SingletonFD getInstance() {
            return singleton;
        }
}
