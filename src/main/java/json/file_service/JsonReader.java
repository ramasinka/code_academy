package json.file_service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.19.
 */
public class JsonReader {

    private static final String PATH = "C:\\Users\\CodeAcademy\\IdeaProjects\\codeacademy\\src\\main\\resources\\";

    public void getJsonFromFile(String fileName){
        JSONParser jsonParser = new JSONParser();
        try {

            Object parse = jsonParser.parse(new FileReader(PATH + fileName));
            JSONObject jsonObject = (JSONObject) parse;
            long id = (long) jsonObject.get("id");
            String name = (String) jsonObject.get("name");
            JSONArray jsonArray = (JSONArray) jsonObject.get("personList");
            System.out.println("ID: " + id + " NAME: " + name + " PERSONLIST: " + jsonArray);

            String name1 = (String) jsonArray.get(0);
            System.out.println("PERSON" + name1);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
