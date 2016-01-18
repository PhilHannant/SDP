package helloworldspringwithdixml;

/**
 * Created by philhannant on 18/01/2016.
 */
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {

        return "Hello World!";

    }

}
