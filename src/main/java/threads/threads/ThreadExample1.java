package threads.threads;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class ThreadExample1 extends Thread {

    public ThreadExample1(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Current thread: " + Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            System.out.println("zzzz");
            try {
                if(i==3){
                    sleep(5000L);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
