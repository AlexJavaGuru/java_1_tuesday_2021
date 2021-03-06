package student_einars_marhilevics.lesson_5.level_5;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }
    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public int findMaxNumber(int[] array) {
        int bigNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > bigNum) {
                bigNum = array[i];
            }
        } return bigNum;
    }
    public int findMinNumber(int[] array) {
        int smallNum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallNum) {
                smallNum = array[i];
            }
        } return smallNum;
    }
}
