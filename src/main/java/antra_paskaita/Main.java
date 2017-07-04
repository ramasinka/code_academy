package antra_paskaita;

/**
 * Created by CodeAcademy on 2017.07.04.
 */
public class Main {
    public static void main(String[] args) {
        sumAlgorithm();
        minusAlgorithm();
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
        System.out.println("y" +~y);

        System.out.println(!checkTrue);
        System.out.println(!checkFalse);
    }

    public static void shiftAlgorithm(){
        int x = 20;
        int y = 2;

        System.out.println(x<<y);
        System.out.println(y>>2);
    }

}
