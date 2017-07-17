package threads.wait_notify_threads;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class NotifyMessageInitial implements Runnable {

    Message message;

    public NotifyMessageInitial(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            synchronized (message) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed: " + name + "Message: " + message);
        message.notify();
    }
}
