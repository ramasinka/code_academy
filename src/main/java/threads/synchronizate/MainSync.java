package threads.synchronizate;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class MainSync {
    public static void main(String[] args) {
        DisplayThread displayThread = new DisplayThread("display thread ");
        DisplayThread displayThread1 = new DisplayThread("display thread 1");
        DisplayThread displayThread2 = new DisplayThread("display thread 2");
        DisplayThread displayThread3 = new DisplayThread("display thread 3");
        displayThread.start();
        displayThread1.start();
        displayThread2.start();
        displayThread3.start();
    }
}
