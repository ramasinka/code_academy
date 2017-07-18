package whait_notify;

/**
 * Created by CodeAcademy on 2017.07.18.
 */
public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        ProducerThread producerThread = new ProducerThread(store);
        Thread threadProducer = new Thread(producerThread);
        threadProducer.start();
        Item item = new Item(1, "Beer1");
        Item item1 = new Item(2, "Beer2");
        Item item2 = new Item(3, "Beer3");
        Item item3 = new Item(4, "Beer4");
        Item item4 = new Item(5, "Beer5");
        Item item5 = new Item(6, "Beer6");
        Item item6 = new Item(7, "Beer7");

        store.addToStore(item);
        store.addToStore(item1);
        store.addToStore(item2);
        store.addToStore(item3);
        store.addToStore(item4);
        store.addToStore(item5);
        store.addToStore(item6);

        ConsumerThread consumerThread = new ConsumerThread(store);
        Thread threadConsumer = new Thread(consumerThread);
        threadConsumer.start();
    }
}
