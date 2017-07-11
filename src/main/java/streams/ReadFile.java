package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.11.
 */
public class ReadFile {
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
        List<PersonModel> personData = rf.getPersons();
        System.out.println(personData);
    }

    private List<PersonModel> getPersons() {
        List<PersonModel> personModelList = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\CodeAcademy\\IdeaProjects\\codeacademy\\src\\main\\java\\streams\\MOCK_DATA.csv"));
            personModelList = new ArrayList<>();
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                PersonModel personModel = new PersonModel();
                personModel.setId(Integer.parseInt(split[0]));
                personModel.setFirst_name(split[1]);
                personModel.setLast_name(split[2]);
                personModel.setEmail(split[3]);
                personModel.setGender(split[4]);
                personModel.setIp_address(split[5]);
                personModelList.add(personModel);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personModelList;
    }

}
