package threads.threads;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class ThreadExample2 extends Thread {

    public ThreadExample2(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Current thread: " + Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            System.out.println("A");
        }
    }
}
