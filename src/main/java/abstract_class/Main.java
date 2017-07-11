package abstract_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by CodeAcademy on 2017.07.10.
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("first value");
        int firstValue = Integer.parseInt(scanner.next());
        values.add(firstValue);
        System.out.println("second value");
        int secondValue = Integer.parseInt(scanner.next());
        values.add(secondValue);

        int [] array = new int[values.size()];


        MathematicalAlgorithm mathematicalAlgorithm = new MathematicalAlgorithm() {
            @Override
            int sum(int x, int y) {
                System.out.println("sum: " + (x + y));
                return x;
            }

            @Override
            int calculateMax(int x, int y, int z) {
                System.out.println("Max value: " + Math.max(x, Math.max(y, z)));
                return x;
            }

            @Override
            double calculateAverage(int... args) {
                int sum = 0;
                for (int i = 0; i < args.length; i++) {
                    sum += args[i];
                }
                int average = sum/args.length;
                System.out.println("Average: " + average);
                return average;
            }
        };
        mathematicalAlgorithm.sum(firstValue, secondValue);
        mathematicalAlgorithm.calculateMax(firstValue, secondValue, 0);
        mathematicalAlgorithm.calculateAverage(new int[3]);
    }
}
