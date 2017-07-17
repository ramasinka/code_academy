package threads.join_threads;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class MainJoin {
    public static void main(String[] args) {
        Thread joinThread = new Thread(new JoinThreads(), "Join thread");
        Thread joinThread1 = new Thread(new JoinThreads(), "Join thread 1");
        Thread joinThread2 = new Thread(new JoinThreads(), "Join thread 2");
        joinThread.start();
        try {
            joinThread.join(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        joinThread1.start();

        try {
            joinThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        joinThread2.start();
    }
}

