package abstract_class_and_inheritance.inheritance;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class InheritanceChild extends InheritanceParent {

    String color = "red";
    String name = "aaa";

    public void display() {
        System.out.println("color: " + color + "name: " + name);
        System.out.println("color: " + super.color + "name: " + super.name);
    }
}
