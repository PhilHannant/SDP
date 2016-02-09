package worksheet5.facadePattern;

/**
 * Created by philhannant on 09/02/2016.
 */
public class TestscheduleServer {

    public static void main(String[] args){

        ScheduleServer scheduleServer = new ScheduleServer();

        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Start working......");
        System.out.println("After work done.........");

        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }
}
