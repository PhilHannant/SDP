package worksheet5.facadePattern;

/**
 * Created by philhannant on 09/02/2016.
 */
public class ScheduleServerImpl implements ScheduleServer{


    @Override
    public void startBooting() {
        System.out.println("Start booting...");
    }

    @Override
    public void readSystemConfigFile() {
        System.out.println("Reading system config file...");
    }

    @Override
    public void init() {
        System.out.println("Initialise..");
    }

    @Override
    public void initializeContext() {
        System.out.println("Initialising context...");
    }

    @Override
    public void initializeListeners() {
        System.out.println("Initialise listeners...");
    }

    @Override
    public void createSystemObjects() {
        System.out.println("creating system objects...");
    }

    @Override
    public void releaseProcesses() {
        System.out.println("processes released...");
    }

    @Override
    public void destory() {
        System.out.println("Starting destroy process...");
    }

    @Override
    public void destroySystemObjects() {
        System.out.println("system objects destroyed..");
    }

    @Override
    public void destoryListeners() {
        System.out.println("listeners destroyed...");
    }

    @Override
    public void destoryContext() {
        System.out.println("context destroyed...");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting Down...");
    }
}
