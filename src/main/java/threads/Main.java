package threads;

import threads.runable.OpenUrlThread;
import threads.runable.WriteToFileThread;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class Main {
    public static void main(String[] args) {
/*
        ThreadAddToMapData threadAddToMapData = new ThreadAddToMapData("thread example3");
        ThreadDisplay threadDisplay = new ThreadDisplay("thread example 4");
        threadAddToMapData.start();
        threadDisplay.start();
*/
        WriteToFileThread writeToFileThread = new WriteToFileThread();
        Thread wf1 = new Thread(writeToFileThread, "pirmas");
        wf1.start();
        OpenUrlThread openUrlThread = new OpenUrlThread();
        Thread rf1 = new Thread(openUrlThread, "read1");
        rf1.start();
//        writeToFileThread.start();
//        openUrlThread.run();
    }
}
