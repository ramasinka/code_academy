package algorithm;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by CodeAcademy on 2017.07.04.
 */
public class Main {
    public static void main(String[] args) {
        whileAlgorithm();
    }

    public static void sumAlgorithm() {
        int x = 10;
        int y = 10;
        System.out.println("x= " + x++);
        System.out.println("x1= " + x);
        System.out.println("y= " + ++y);
        System.out.println("y1= " + y);
    }

    public static void minusAlgorithm() {
        int x = 10;
        int y = -10;
        boolean checkTrue = true;
        boolean checkFalse = false;

        System.out.println("- x" + ~x);
        System.out.println("y" + ~y);

        System.out.println(!checkTrue);
        System.out.println(!checkFalse);
    }

    public static void shiftBinaryAlgorithm() {
        int x = 10;
        int y = 2;

        System.out.println(x << y);
        System.out.println(x << ++y);

        System.out.println(x >> y);
        System.out.println(x >> ++y);

        System.out.println("One shift");
        System.out.println(Integer.toBinaryString(121));
        System.out.println(Integer.toBinaryString(121 >> 1));
        System.out.println(Integer.toBinaryString(121 >> 2));
        System.out.println(Integer.toBinaryString(121 >> 3));
        System.out.println(Integer.toBinaryString(121 >> 4));

        System.out.println("Two shift");
        System.out.println(Integer.toBinaryString(121 << 1));
        System.out.println(Integer.toBinaryString(121 << 2));
        System.out.println(Integer.toBinaryString(121 << 3));
        System.out.println(Integer.toBinaryString(121 << 4));

        System.out.println("Three shift");
        System.out.println(Integer.toBinaryString(121 >>> 1));
        System.out.println(Integer.toBinaryString(121 >>> 2));
        System.out.println(Integer.toBinaryString(121 >>> 3));
        System.out.println(Integer.toBinaryString(121 >>> 4));

        System.out.println("Shift with minus");
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-1));

    }

    public static void logicalAlgorithmOperators() {
        int x = 20;
        int y = 10;
        int z = 5;
        boolean check = false;
        if (x < y && z > y) {
            check = true;
        }
        System.out.println(check);
        if (y < x && z < y) {
            check = true;
        }
        System.out.println(check);
        if (y < z || z > x) {
            check = true;
        }
        System.out.println(check);

        if (x % 3 == 0) {
            check = true;
        }
        System.out.println(check);

        //Operators inline
        Scanner scanner = new Scanner(System.in);
        int value = Integer.parseInt(scanner.nextLine());
        String charValue = value >= 9 ? "A" : value >= 7 && value <= 8 ? "B" : value >= 5 && value <= 6 ? "C" : value <= 4 ? "D" : "Unknown value";
        System.out.println(charValue);
    }

    public static void switchAlgorithm() {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.parseInt(scanner.nextLine());
        switch (value) {
            case 1:
                System.out.println(value);
                break;
            case 2:
                System.out.println(value);
                break;
            case 10:
                System.out.println(value);
                break;
        }
    }

    public static void switchExample() {
        for (int i = -1; i < 3; i++) {
            switch (i) {
                case 0:
                    break;
                case 1:
                    System.out.println("one");
                case 2:
                    System.out.println("two");
                case 3:
                    System.out.println("three");
                default:
                    System.out.println("default value");
            }
        }
        System.out.println("done");
    }

    public static void forLoopAlgorithm() {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        int textLength = inputText.length();
        for (int i = 1; i <= textLength; i++) {
            char reversedChar = inputText.charAt(textLength - i);
            System.out.println(reversedChar);
        }
    }

    public static void forLoopExample() {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        char[] array = inputText.toCharArray();
        for (int i = 0, y = array.length; i < (array.length) / 2; i++, y--) {
            System.out.print(inputText.substring(i, y));
            System.out.println();
        }
    }

    public static void forLoopSecondExample() {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + ((i * j / 10 == 0) ? "0" + i * j : i * j));
            }
            System.out.println();
        }
    }

    public static void forEachAlgorithm() {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int arrayValue : array) {
            if (arrayValue == 2) {
                System.out.println("correct value");
            }
        }
    }

    public static void forEachExample() {

        String[] nameArray = new String[1000];
        for (int j = 0; j < 1000; j++) {
            String name = "";
            char[] bytes = new char[10];
            for (int i = 0; i < 10; i++) {
                int randomChar = 97 + (int) (Math.random() * 26);
                bytes[i] = (char) randomChar;
                name = String.copyValueOf(bytes);
            }
            nameArray[j] = name;
        }
        for (int i = 97; i <= 122; i++) {
            char alphabetChar = (char) i;
            System.out.println("first symbol" + alphabetChar);
            for (String nameValue : nameArray) {
                if (nameValue.charAt(0) == alphabetChar) {
                    System.out.print(nameValue + " ");
                }
                System.out.println();
            }
        }
    }

    public static void arrayExamples() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i % 2 == 0 && j % 2 == 0 || i == j) {
                    System.out.print(" " + i + "" + j);
                }
                continue;
            }
            System.out.println();
        }
    }

    public static void forLoopContinue() {
        for (int i = 0; i < 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void forLoopContinueExample() {
        for (int i = 0; i < 10; i++) {
            label:
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    continue label;
                }
                System.out.print(" " + i + j);
            }
            System.out.println();
        }
    }

    public static void forEachSecondExample() {
        //eternal cycle
        for (; ; ) {
            System.out.println();
        }
    }

    public static void whileAlgorithm() {
        String history = "";
        String inputText = JOptionPane.showInputDialog("Input text");
/*
        while (!inputText.equals("quit")) {
            inputText = JOptionPane.showInputDialog("Input text");
            history += inputText;
            JOptionPane.showMessageDialog(null, history);
        }
*/
        do {
            inputText = JOptionPane.showInputDialog("Input text");
            history += inputText;
            JOptionPane.showMessageDialog(null, history);

        } while (!inputText.equals("quit"));

    }
}
