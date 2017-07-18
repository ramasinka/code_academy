package whait_notify;

import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.18.
 */
public class ProducerThread implements Runnable {
    Store store;


    public ProducerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        synchronized (store) {
            List<Item> itemList = store.getItemList();
            while (itemList.size() != 3) {
                try {
                    store.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Bought items:"  + store.getBoughtItems() );
        }
    }
}
