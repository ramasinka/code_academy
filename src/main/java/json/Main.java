package json;

import json.data.Person;
import json.file_service.JsonReader;
import json.file_service.JsonWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.19.
 */
public class Main {
    public static void main(String[] args) {
        JsonWriter jsonWriter = new JsonWriter();
        JsonReader jsonReader = new JsonReader();

        List<Person> personList = new ArrayList<>();
        Person person1 = new Person(1, "Test");
        Person person2 = new Person(2, "Test2");
        Person person3 = new Person(3, "Test3");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        jsonWriter.writeToFile(person1, personList, "TEST.json");
        jsonReader.getJsonFromFile("TEST.json");
    }
}
