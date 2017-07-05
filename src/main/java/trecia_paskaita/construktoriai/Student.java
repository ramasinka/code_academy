package trecia_paskaita.construktoriai;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class Student {
    private int id;
    private int code;
    private String name;

    public Student(int id, int code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}

