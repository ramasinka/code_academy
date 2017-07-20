package json.data;

import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.19.
 */
public class Person {
    int id;
    String name;
    private List<Person> list;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
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

    public void setList(List<Person> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
