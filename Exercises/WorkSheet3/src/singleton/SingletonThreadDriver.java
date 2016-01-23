package singleton;

import singleton.SingletonDL;
/**
 * Created by philhannant on 23/01/2016.
 */
public class SingletonThreadDriver implements Runnable {


    public static void main(String[] args){
        Thread t1 = new Thread(new SingletonThreadDriver());
        t1.start();
        Thread t2 = new Thread(new SingletonThreadDriver());
        t2.start();
    }

    @Override
    public void run() {
        System.out.println("running");
        System.out.println(SingletonDL.getInstance().getClass());
    }

}
