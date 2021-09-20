package student_daniel.lesson5.level5;

import java.util.Random;

class ArrayUtil {
    //Task 31 32 33
    public int[] createArray(int arrayLength) {
        int[] resultArray = new int[arrayLength];
        return resultArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random myRandom = new Random();
        int numBounds = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = myRandom.nextInt(numBounds);
        }
    }
}
