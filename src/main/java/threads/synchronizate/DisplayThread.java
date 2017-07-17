package threads.synchronizate;

import java.util.Random;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class DisplayThread extends Thread {
    String name;

    public DisplayThread(String name) {
        this.name = name;
    }

    public static synchronized void displayInts(String name) {
        System.out.println("Name: " + name);
        for (int i = 0; i < 1000; i++) {
            try {
                Random random = new Random();
                Thread.sleep(random.nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Name: " + name + " ints: " + i);
        }
    }

    @Override
    public void run() {
        displayInts(Thread.currentThread().getName());
    }
}
