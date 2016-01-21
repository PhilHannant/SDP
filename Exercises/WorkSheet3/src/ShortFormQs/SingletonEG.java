package ShortFormQs;

/**
 * Created by philhannant on 21/01/2016.
 */
class Singleton {

    private static Singleton singleton  = new Singleton();

    private Singleton(){}

    public static Singleton getSingleton(){
        return singleton;
    }
}

public class SingletonEG{

    public static void main(String[] args){
        Singleton single = Singleton.getSingleton();
    }
}
