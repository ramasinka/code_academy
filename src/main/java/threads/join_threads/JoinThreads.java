package threads.join_threads;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class JoinThreads implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Threan started: " + Thread.currentThread().getName());
            Thread.sleep(4 * 1000);
            System.out.println("Started");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
