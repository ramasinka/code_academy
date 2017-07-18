package callable;

import java.util.concurrent.Callable;

/**
 * Created by CodeAcademy on 2017.07.18.
 */
public class CallableThread implements Callable {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        System.out.println("Current thread: " + Thread.currentThread().getName());
        return Service.calculateSum(5, 5, 2);
    }
}
