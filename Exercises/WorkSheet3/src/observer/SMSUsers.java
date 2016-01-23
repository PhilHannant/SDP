package observer;

/**
 * Created by philhannant on 23/01/2016.
 */
public class SMSUsers implements Observer {

    private Subject sub;
    private String msg;
    private String desc;


    public SMSUsers(Subject s, String msg) {
        this.sub = s;
        this.msg = msg;
    }

    @Override
    public void update(String desc) {
        this.desc = desc;
        System.out.println(desc);
    }

    @Override
    public void subscribe() {
        sub.subscribeObserver(this);

    }

    @Override
    public void unSubscribe() {
        sub.unSubscribeObserver(this);

    }


}
