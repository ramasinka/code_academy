package whait_notify;

import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.18.
 */
public class ConsumerThread implements Runnable {
    List<Item> itemList;

    public ConsumerThread(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            for (int i = 0; i < itemList.size(); i++) {
                buy(itemList.get(i));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void buy(Item item) {
        itemList.remove(item);
    }
}
