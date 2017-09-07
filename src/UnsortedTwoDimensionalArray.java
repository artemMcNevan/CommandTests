import java.util.Arrays;
import java.util.Random;

public class UnsortedTwoDimensionalArray {
    public static int randInt(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) -1) + min;
    }

    public static int getMinElementInUnsortedIntegerArray(int[][] unsortedIntegerArray) {
        if(unsortedIntegerArray.equals(null)) {
            throw new NullPointerException("Array must not be null");
        }

        int arrayIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < unsortedIntegerArray.length; i++) {
            for (int j = 0; j < unsortedIntegerArray[i].length; j++) {
                if (unsortedIntegerArray[i][j] < unsortedIntegerArray[arrayIndex][minIndex]) {
                    minIndex = j;
                    arrayIndex = i;
                }
            }
        }

        return unsortedIntegerArray[arrayIndex][minIndex];
    }
}
