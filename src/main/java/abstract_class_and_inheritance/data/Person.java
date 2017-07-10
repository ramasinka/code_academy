package abstract_class_and_inheritance.data;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class Person {
    public int id;
    public String name;
    public String code;

    public void createPerson(int id, String name, String code){
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Person(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
