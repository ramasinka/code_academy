package streams;

import java.io.Serializable;

/**
 * Created by CodeAcademy on 2017.07.11.
 */
public class PersonSerializable implements Serializable {

    private Gender gender;

    public enum Gender {
        FEMALE,
        MALE
    }

    int id;
    int age;
    String name;
    String surname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender(Gender gender) {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PersonSerializable{" +
                "gender=" + gender +
                ", id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
