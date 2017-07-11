package collections;

import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.11.
 */
public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        List<Person> personData = personService.getPersonData();
        System.out.println(personService.sortByGender(personData, "Female"));
        System.out.println(personService.getPersonEmails(personData));
    }
}
