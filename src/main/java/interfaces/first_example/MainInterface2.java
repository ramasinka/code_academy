package interfaces.first_example;

/**
 * Created by CodeAcademy on 2017.07.10.
 */
public class MainInterface2 implements Printable, Printable2 {
    public void print() {
        System.out.println("first interface");
    }

    public void print2() {
        System.out.println("second interface");
    }

    public int suma(int fistValue, int secondValue) {
        return fistValue + secondValue;
    }
}
