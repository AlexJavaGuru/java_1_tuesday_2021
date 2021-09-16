package student_julija_kuzmicova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_27 {

    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Array: " + Arrays.toString(array));

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The largest number in the array is: " + max);
    }
}
