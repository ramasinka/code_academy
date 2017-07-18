package semaphore;

import streams.PersonModel;

import java.util.Map;
import java.util.concurrent.Semaphore;

/**
 * Created by CodeAcademy on 2017.07.17.
 */
public class SemaphoreThread implements Runnable {
    Map<Integer, PersonModel> map;
    static Semaphore semaphore = new Semaphore(4);

    public SemaphoreThread(Map<Integer, PersonModel> map) {
        this.map = map;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            for (Map.Entry<Integer, PersonModel> p : map.entrySet()) {
                System.out.println(Thread.currentThread().getName() + "ID: " + p.getKey() + "VALUE" + p.getValue());
                Thread.sleep(10);
            }
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
