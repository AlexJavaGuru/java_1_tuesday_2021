package student_alberts_matrozis.lesson_5.level_5;

import java.util.Arrays;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] arr = new int[arrayLength];
        return arr;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int )(Math.random() * 50 + 1);
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
