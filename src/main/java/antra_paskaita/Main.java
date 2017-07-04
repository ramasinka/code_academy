package antra_paskaita;

import java.util.Scanner;

/**
 * Created by CodeAcademy on 2017.07.04.
 */
public class Main {
    public static void main(String[] args) {
//        minusAlgorithm();
//        sumAlgorithm();
//        shiftBinaryAlgorithm();
        logicalAlgorithmOperators();
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

        //Operators in inline
        Scanner scanner = new Scanner(System.in);
        int value = Integer.parseInt(scanner.nextLine());
        String charValue = value >= 9 ? "A" : value >= 7 && value <= 8 ? "B" : value >= 5 && value <=6 ? "C" : value <= 4 ? "D" : "Unknown value";
        System.out.println(charValue);


    }

}
