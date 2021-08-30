package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Random;

public class ArrayUtil {

    int[] createArray(int size) {
        int[] resultArray = new int[size];
        return resultArray;
        //return new int[size];
    }

    void fillArrayWithRandom(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    int[] copyArray(int[] sourceArray) {
        int[] destArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            destArray[i] = sourceArray[i];
        }
        return destArray;
    }

    int maxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
