package semaphore;

import collections.Person;
import streams.PersonModel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by CodeAcademy on 2017.07.17.
 */
public class FileService {

    private static final String PATH = "C:\\Users\\CodeAcademy\\IdeaProjects\\codeacademy\\src\\main\\java\\semaphore\\";

    Map<Integer, PersonModel> map = new HashMap<>();

    public Map<Integer, PersonModel> addDataToMap(String fileName) {
        try {
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH + fileName));
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {

                String[] split = line.split(",");
                for (int i = 0; i < split.length; i++) {
                    PersonModel personModel = new PersonModel();
                    personModel.setId(Integer.parseInt(split[0]));
                    personModel.setFirst_name(split[1]);
                    map.put(Integer.parseInt(split[0]), personModel);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
