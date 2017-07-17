package blocking_queue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by CodeAcademy on 2017.07.17.
 */
public class Consumer implements Runnable {
    BlockingQueue<Message> blockingQueue;

    public Consumer(BlockingQueue<Message> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        Message message;
        try {
            while (!(message = blockingQueue.take()).getMesssage().equals("Pasibaige")) {
                Thread.sleep(400);
                System.out.println("Consumed " + message.getMesssage());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
