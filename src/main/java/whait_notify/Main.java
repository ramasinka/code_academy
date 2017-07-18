package whait_notify;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.18.
 */
public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1,"Beer1" ));
        items.add(new Item(2,"Beer2" ));
        items.add(new Item(3,"Beer3" ));
        items.add(new Item(4,"Beer4" ));
        items.add(new Item(5,"Beer5" ));
        items.add(new Item(6,"Beer6" ));
        ProducerThread producerThread = new ProducerThread(items);
        ConsumerThread consumerThread = new ConsumerThread(items);

    }
}
