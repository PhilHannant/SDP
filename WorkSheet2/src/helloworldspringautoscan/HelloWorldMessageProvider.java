package helloworldspringautoscan;

/**
 * Created by philhannant on 18/01/2016.
 */
import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessageProvider implements MessageProvider {
    public String getMessage() {
        return "Hello World! --- with Autoscan! How does that work?";
    }
}
