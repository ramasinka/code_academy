package whait_notify;

/**
 * Created by CodeAcademy on 2017.07.18.
 */
public class ConsumerThread implements Runnable {
    private Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        synchronized (store) {
            try {
                for (int i = 0; i < store.getItemList().size(); i++) {
                    int randomItemNumber = (int) ((Math.random() * store.getItemList().size()));
                    Item boughtItem = store.getItemList().get(randomItemNumber);
                    store.remove(boughtItem);
                    store.addBoughtItems(boughtItem);
                    System.out.println("Current List" + store.getItemList());
                    System.out.println("Bought item" + boughtItem);
                    Thread.sleep(2000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (store.getItemList().size() == 3) {
                store.notify();
                System.out.println("Sold out. Left items: " + store.getItemList());
            }
        }
    }
}
