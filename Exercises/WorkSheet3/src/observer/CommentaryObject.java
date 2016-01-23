package observer;

import java.util.List;

/**
 * Created by philhannant on 23/01/2016.
 */
public class CommentaryObject implements Subject, Commentary {

    private List<Observer> subscribers;
    private static String title;
    private String desc;

    public CommentaryObject(List<Observer> subscribers, String title) {
        this.subscribers = subscribers;
        this.title = title;
    }

    @Override
    public void subscribeObserver(Observer observer) {

    }

    @Override
    public void unSubscribeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public String subjectDetails() {
        return null;
    }

    @Override
    public void setDesc(String desc) {

    }
}
