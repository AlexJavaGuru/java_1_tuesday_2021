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
}
