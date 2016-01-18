package helloworldspringwithdixml;

/**
 * Created by philhannant on 18/01/2016.
 */
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {

        return "Hello World!";
    }

}
