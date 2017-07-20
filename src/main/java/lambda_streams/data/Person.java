package lambda_streams.data;

/**
 * Created by CodeAcademy on 2017.07.20.
 */
public class Person {
    int id;
    String name;
    String lastName;
    String email;
    String gender;
    String ip;

    public Person(int id, String name, String lastName, String email, String gender, String ip) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.ip = ip;
    }

    public Person() {
    }

    public Person(int id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
