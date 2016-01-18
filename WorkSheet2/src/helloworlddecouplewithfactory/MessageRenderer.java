package helloworlddecouplewithfactory;

/**
 * Created by philhannant on 18/01/2016.
 */
public interface MessageRenderer {
    public void render();
    public void setMessageProvider(MessageProvider provider);
    public MessageProvider getMessageProvider();
}
