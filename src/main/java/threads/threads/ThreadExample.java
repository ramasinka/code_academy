package threads.threads;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class ThreadExample extends Thread {

    public ThreadExample(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread name" + Thread.currentThread().getName());
        ThreadExample1 threadExample1 = new ThreadExample1("1 thread");
        ThreadExample2 threadExample2 = new ThreadExample2("2 thread");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                try {
                    threadExample1.start();
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (i == 9) {
                threadExample2.start();
            }
        }
    }
}
