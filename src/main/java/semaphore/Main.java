package semaphore;

import streams.PersonModel;

import java.util.Map;

/**
 * Created by CodeAcademy on 2017.07.17.
 */
public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        Map<Integer, PersonModel> map = fileService.addDataToMap("DATA.csv");

        new Thread(new ThreadExample(map)).start();
        new Thread(new ThreadExample(map)).start();
        new Thread(new ThreadExample(map)).start();
        new Thread(new ThreadExample(map)).start();
        new Thread(new ThreadExample(map)).start();
        new Thread(new ThreadExample(map)).start();
        new Thread(new ThreadExample(map)).start();
        new Thread(new ThreadExample(map)).start();
        new Thread(new ThreadExample(map)).start();
        new Thread(new ThreadExample(map)).start();
        new Thread(new ThreadExample(map)).start();
    }
}
