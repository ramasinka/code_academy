package json.file_service;

import json.data.Person;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


/**
 * Created by CodeAcademy on 2017.07.19.
 */
public class JsonWriter {

    private static final String PATH = "C:\\Users\\CodeAcademy\\IdeaProjects\\codeacademy\\src\\main\\resources\\";

    public void writeToFile(Person person, List<Person> personList, String fileName) {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        try {
            jsonObject.put("id", person.getId());
            jsonObject.put("name", person.getName());

            for (Person p : personList) {
                jsonArray.add(p.toString());
            }
            jsonObject.put("personList", jsonArray);

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH + fileName));
            bufferedWriter.write(jsonObject.toJSONString());
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
