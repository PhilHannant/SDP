package helloworlddecoupledwithfactory;



/**
 * Created by philhannant on 18/01/2016.
 */
public class HelloWorldDecoupledWithFactory {


    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
