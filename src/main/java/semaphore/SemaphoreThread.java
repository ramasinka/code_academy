package semaphore;

import streams.PersonModel;

import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.logging.Logger;

/**
 * Created by CodeAcademy on 2017.07.17.
 */
public class SemaphoreThread implements Runnable {
    Map<Integer, PersonModel> map;
    static Semaphore semaphore = new Semaphore(4);
    private final static Logger LOGGER = Logger.getLogger(SemaphoreThread.class.getName());

    public SemaphoreThread(Map<Integer, PersonModel> map) {
        this.map = map;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            for (Map.Entry<Integer, PersonModel> p : map.entrySet()) {
//                System.out.println(Thread.currentThread().getName() + "ID: " + p.getKey() + "VALUE" + p.getValue());
                Thread.sleep(100);
                LOGGER.info(" Thread running: " + Thread.currentThread().getName());
            }
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
