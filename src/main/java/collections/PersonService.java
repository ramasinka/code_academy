package collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by CodeAcademy on 2017.07.11.
 */
public class PersonService {
    public List<Person> sortByGender(List<Person> list, String gender) {
        List<Person> sortedList = new ArrayList<>();
        for (Person person : list) {
            if (person.getGender().equals(gender)) {
                sortedList.add(person);
            }
        }
        return sortedList;
    }

    public List<Person> getPersonData() {
        List<Person> personModelList = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\CodeAcademy\\IdeaProjects\\codeacademy\\src\\main\\java\\streams\\MOCK_DATA.csv"));
            personModelList = new ArrayList<>();
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                Person personModel = new Person();
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

    public List<String> getPersonEmails(List<Person> personList) {
        List<String> personEmails = new ArrayList<>();
        for (Person person : personList) {
            if (!person.getEmail().isEmpty()) {
                personEmails.add(person.getEmail());
            }
        }
        return personEmails;
    }

    public void removePersonsByGender(List<Person> personList, String gender) {
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().getGender().equals(gender)) {
                iterator.remove();
            }
        }
    }

    public Map<Integer, Person> addPersonToMap(List<Person> personList) {
        Map<Integer, Person> map = new HashMap<>();
        int i = 1;
        for (Person person : personList) {
            map.put(i, person);
            i++;
        }
        return map;
    }

    public Person getPersonDataById(int id, List<Person> list) {
        Map<Integer, Person> personMap = new HashMap<>();
        for (Person person : list) {
            personMap.put(person.getId(), person);
        }
        Person person = null;

        for (Map.Entry<Integer, Person> persons : personMap.entrySet()) {
            if (persons.getKey() == id) {
                person = personMap.get(id);
            }
        }
        return person;
    }
}