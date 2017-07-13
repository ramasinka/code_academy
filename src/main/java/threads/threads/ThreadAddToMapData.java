package threads.threads;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class ThreadAddToMapData extends Thread {

    public ThreadAddToMapData(String name) {
        super(name);
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        MapData.addDataToMap(getName(), ""+i );
        }
    }
}
