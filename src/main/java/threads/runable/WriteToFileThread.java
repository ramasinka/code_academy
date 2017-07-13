package threads.runable;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.13.
 */
public class WriteToFileThread implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            addDate();
        }
    }

    private void addDate() {
        for (int i = 0; i < 5; i++) {
            List<String> list1 = addDateToList(5);
            List<String> list2 = addDateToList(10);
            List<String> list3 = addDateToList(30);
            writeToFile("File1", list1);
            writeToFile("File2", list2);
            writeToFile("File3", list3);
        }
    }

    private List<String> addDateToList(int value) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            list.add(String.valueOf(i));
        }
        return list;
    }

    private void writeToFile(String filename, List<String> list) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\CodeAcademy\\IdeaProjects\\codeacademy\\src\\main\\java\\threads\\runable\\" + filename + ".txt", true));
            bufferedWriter.newLine();
            for (String s : list) {
                bufferedWriter.write(s);
                bufferedWriter.write(",");
            }
            bufferedWriter.write(String.valueOf(new Date()));
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
