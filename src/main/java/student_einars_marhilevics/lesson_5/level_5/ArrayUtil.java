package student_einars_marhilevics.lesson_5.level_5;

import java.util.Random;

class ArrayUtil {
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
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
    public int findMaxNumber(int[] array) {
        int bigNum = 0;
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
