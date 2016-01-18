package helloworldspringautoscan;

/**
 * Created by philhannant on 18/01/2016.
 */
public interface MessageRenderer {
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
