package abstract_class_and_inheritance.service;

import abstract_class_and_inheritance.data.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class PersonService {
    List<Person> persons = new ArrayList<Person>();

    public List<Person> getPersons() {
        return this.persons;
    }

    public void addPerson(Person person) {
        this.persons.add(person);
    }

    public boolean findPerson(String name) {
        for (Person person: persons) {
            if (person.getName().contains(name)) {
                return true;
            }
        }
        return false;
    }
}
