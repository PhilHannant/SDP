package observer;

/**
 * Created by philhannant on 23/01/2016.
 */
public interface Observer {
    void update(String desc);

    void subscribe();

    void unSubscribe();
}
