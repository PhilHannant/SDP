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
        subscribers.add(observer);


    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        subscribers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < subscribers.size(); i++){
            subscribers.get(i).update(desc);
        }

    }

    @Override
    public String subjectDetails() {
        return title;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObservers();
    }


}
