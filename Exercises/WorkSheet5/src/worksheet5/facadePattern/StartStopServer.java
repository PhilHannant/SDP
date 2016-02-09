package worksheet5.facadePattern;

/**
 * Created by philhannant on 09/02/2016.
 */
public class StartStopServer {

    private ScheduleServer scheduleServer;

    public StartStopServer(){
        scheduleServer = new ScheduleServerImpl();
    }

    public void startServer(){
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Start working......");
        System.out.println("After work done.........");
    }

    public void stopServer(){
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }
}
