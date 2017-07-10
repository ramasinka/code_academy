package abstract_class_and_inheritance.service;

import java.util.Scanner;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class InputValueService {

    public String getScannerValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public int convertStringToInt(String text) {
        return Integer.parseInt(text);
    }

    public int sumConvertedValue(int value, int sum) {
        return sum + value;
    }
}
