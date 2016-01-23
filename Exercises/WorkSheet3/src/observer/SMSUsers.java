package observer;

/**
 * Created by philhannant on 23/01/2016.
 */
public class SMSUsers implements Observer {

    private Subject sub;
    private String msg;
    private static int userNo = 0;


    public SMSUsers(Subject s, String msg) {
        this.sub = s;
        this.msg = msg;
    }

    @Override
    public void update(String desc) {

    }

    @Override
    public void subscribe() {
        sub.subscribeObserver(this);
        userNo++;
    }

    @Override
    public void unSubscribe() {
        sub.unSubscribeObserver(this);
        userNo--;
    }


}
