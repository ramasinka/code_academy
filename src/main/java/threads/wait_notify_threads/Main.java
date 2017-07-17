package threads.wait_notify_threads;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new WaitInitial(new Message("Hello")), "waiting1");
        Thread thread2 = new Thread(new WaitInitial(new Message("Hello")), "waiting2");
        thread1.start();
        thread2.start();

        Thread notifyThread1 = new Thread(new NotifyMessageInitial(new Message("Done!!!")), "notify1");
        Thread notifyThread2 = new Thread(new NotifyMessageInitial(new Message("Done!!!")), "notify2");
        notifyThread1.start();
        notifyThread2.start();
    }
}
