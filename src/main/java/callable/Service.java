package callable;

import java.util.Random;

/**
 * Created by CodeAcademy on 2017.07.18.
 */
public class Service {

    public static int calculateSum(int col, int row, int tableNumber) {
        int sum = 0;
        int array[][][] = new int[col][row][tableNumber];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = new Random().nextInt(100);
                    sum += array[i][j][k];
                }
            }
        }
        return sum;
    }
}
