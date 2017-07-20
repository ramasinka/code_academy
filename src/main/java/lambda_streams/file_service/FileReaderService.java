package lambda_streams.file_service;

import lambda_streams.data.Person;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.20.
 */
public class FileReaderService {

    public List<Person> getPersons() throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader("C:\\Users\\CodeAcademy\\IdeaProjects\\codeacademy\\src\\main\\java\\lambda_streams\\STREAMDATA.csv"));
        List<Person> persons = new ArrayList<>();
        try {
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                Person person = new Person();
                person.setId(Integer.parseInt(split[0]));
                person.setName(split[1]);
                person.setLastName(split[2]);
                person.setEmail(split[3]);
                persons.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }
}
