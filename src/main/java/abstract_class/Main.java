package abstract_class;

import java.util.Scanner;

/**
 * Created by CodeAcademy on 2017.07.10.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first value");
        int firstValue = Integer.parseInt(scanner.next());

        System.out.println("second value");
        int secondValue = Integer.parseInt(scanner.next());


        MathematicalAlgorithm mathematicalAlgorithm = new MathematicalAlgorithm() {
            @Override
            void sum(int x, int y) {
                System.out.println("sum: " + (x + y));
            }

            @Override
            void calculateMax(int x, int y, int z) {
                System.out.println("Max value: " + Math.max(x, Math.max(y, z)));
            }

            @Override
            void calculateAverage(int... args) {
                int average = 0;
                for (int value : args) {
                    average = average + value;

                }
                System.out.println("Average: " + average);
            }
        };
        mathematicalAlgorithm.sum(firstValue, secondValue);
        mathematicalAlgorithm.calculateMax(firstValue, secondValue, 0);
        mathematicalAlgorithm.calculateAverage();
    }
}
