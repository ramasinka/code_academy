package semaphore;

import streams.PersonModel;

import java.util.Map;
import java.util.concurrent.Semaphore;

/**
 * Created by CodeAcademy on 2017.07.17.
 */
public class ThreadExample implements Runnable {
    Map<Integer, PersonModel> map;
    static Semaphore semaphore = new Semaphore(2);

    public ThreadExample(Map<Integer, PersonModel> map) {
        this.map = map;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            for (Map.Entry<Integer, PersonModel> p : map.entrySet()) {
                System.out.println("ID: " + p.getKey() + "VALUE" + p.getValue());
                Thread.sleep(100);
            }
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
    }
}
