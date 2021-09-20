package student_daniel.lesson5.level6;

import java.util.Random;

class ArrayUtil {
    //Task 34 35 36 37 38 39 40
    public int[] createArray(int arrayLength) {
        int[] resultArray = new int[arrayLength];
        return resultArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Random myRandom = new Random();
            int numBounds = 10;
            array[i] = myRandom.nextInt(numBounds);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNum < array[i]) {
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public int findMinNumber(int[] array) {
        int mixNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (mixNum > array[i]) {
                mixNum = array[i];
            }
        }
        return mixNum;
    }
}

