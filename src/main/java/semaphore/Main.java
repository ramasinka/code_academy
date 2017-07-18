package semaphore;

import streams.PersonModel;

import java.util.Map;
import java.util.concurrent.Semaphore;

/**
 * Created by CodeAcademy on 2017.07.17.
 */
public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        Map<Integer, PersonModel> map = fileService.addDataToMap("DATA.csv");

        Semaphore semaphore = new Semaphore(1);
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new SemaphoreThread(map)).start();
        new Thread(new SemaphoreThread(map)).start();
        new Thread(new SemaphoreThread(map)).start();
        new Thread(new SemaphoreThread(map)).start();
        new Thread(new SemaphoreThread(map)).start();
        new Thread(new SemaphoreThread(map)).start();
        new Thread(new SemaphoreThread(map)).start();
        new Thread(new SemaphoreThread(map)).start();
        new Thread(new SemaphoreThread(map)).start();
        new Thread(new SemaphoreThread(map)).start();
        new Thread(new SemaphoreThread(map)).start();
    }
}
