package helloworldinterface;

/**
 * Created by philhannant on 18/01/2016.
 */
public class HelloWorldMessageProvider implements MessageProvider {
    public String getMessage() {
        return "Hello World!";
    }
}