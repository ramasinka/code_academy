package trecia_paskaita.construktoriai;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student(1,1,"test1"));
        students.add(new Student(2,2,"test2"));
        students.add(new Student(3,3,"test3"));
        students.add(new Student(4,4,"test4"));
        students.add(new Student(5,5,"test5"));

        System.out.println("Students: " + students);
        System.out.println(students.get(0));
        Student firstStudent = students.get(0);
        System.out.println("id: " + firstStudent.getId() + " name: " + firstStudent.getName() + " code: " + firstStudent.getCode());
    }
}
