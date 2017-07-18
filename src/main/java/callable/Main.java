package callable;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by CodeAcademy on 2017.07.18.
 */
public class Main {
    public static void main(String[] args) {
        CallableThread callableThread = new CallableThread();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            for (int i = 0; i < 10; i++) {
                Future<Integer> submit = executorService.submit(callableThread);
                System.out.println("Date: " + new Date() + " SUM: " + submit.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
