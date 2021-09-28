package student_julija_kuzmicova.lesson_5.level_5;

import java.util.Arrays;
import java.util.Random;

//Task_31, Task_33, Task_34, Task_35, Task_37
public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] resultArray = new int[arrayLength];
        return resultArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
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
