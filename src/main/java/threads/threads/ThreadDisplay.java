package threads.threads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class ThreadDisplay extends Thread {
    public ThreadDisplay(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(20 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            displayData();
        }
    }

    public void displayData() {
        Map<String, List<String>> map = MapData.getMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry data = (Map.Entry) it.next();
            System.out.println("Key: " + data.getKey() + " value: " + data.getValue());
        }
    }
}

