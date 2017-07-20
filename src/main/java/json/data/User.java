package json.data;

import java.util.List;
import java.util.Map;

/**
 * Created by CodeAcademy on 2017.07.19.
 */
public class User {

    int id;
    int age;
    String name;
    String email;
    Address address;
    List<Animals> animals;
    Map<Integer, Car> cars;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Animals> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }

    public Map<Integer, Car> getCars() {
        return cars;
    }

    public void setCars(Map<Integer, Car> cars) {
        this.cars = cars;
    }
}
