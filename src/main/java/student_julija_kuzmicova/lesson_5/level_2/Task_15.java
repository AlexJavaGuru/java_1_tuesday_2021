package student_julija_kuzmicova.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_15 {

    public static void main(String[] args) {

        int[] array = new int[3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }

        System.out.println("Array: " + Arrays.toString(array));
    }
}
