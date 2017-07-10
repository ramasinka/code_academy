package interfaces;

import interfaces.first_example.MainInterface2;
import interfaces.second_example.DefaultInterface;

/**
 * Created by CodeAcademy on 2017.07.10.
 */
public class Main {
    public static void main(String[] args) {
        MainInterface2 mainInterface2 = new MainInterface2();
        mainInterface2.print();
        mainInterface2.print2();
        System.out.println(mainInterface2.suma(1, 2));
    }
}
