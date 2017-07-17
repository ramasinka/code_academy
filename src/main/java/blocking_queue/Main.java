package blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by CodeAcademy on 2017.07.17.
 */
public class Main {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(100);
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
