package threads.wait_notify_threads;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class WaitInitial implements Runnable {
    Message message;

    public WaitInitial(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            synchronized (message) {
                message.wait(10 * 1000);
            }
        } catch (InterruptedException e) {
        }
        System.out.println("Name: " + name + "Data: " + System.currentTimeMillis() + "Message: " + message);
    }
}
