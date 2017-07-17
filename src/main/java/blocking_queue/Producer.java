package blocking_queue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by CodeAcademy on 2017.07.17.
 */
public class Producer implements Runnable {

    BlockingQueue blockingQueue;

    public Producer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println("Item: " + i);
            Message message = new Message("Item: " + i);
            try {
                Thread.sleep(1000 - 10 * i);
//                while (blockingQueue.size() != 5) {
//                    blockingQueue.put(i);
//                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                blockingQueue.put(message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getClass().getSimpleName() + "Message: " + message);
        }
        try {
            blockingQueue.put(new Message("Pasibaige"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
