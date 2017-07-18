package whait_notify;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.18.
 */
public class Store implements Runnable {

    List<Item> itemList = new ArrayList<>();
    List<Item> boughtItems = new ArrayList<>();

    public Store() {
    }

    public void remove(Item item2) {
        itemList.remove(item2);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addBoughtItems(Item boughtItem) {
        boughtItems.add(boughtItem);
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public void addToStore(Item item) {
        itemList.add(item);
    }

    @Override
    public String toString() {
        return "Store{" +
                "itemList=" + itemList +
                '}';
    }

    public List<Item> getBoughtItems() {
        return boughtItems;
    }
}
