package student_julija_kuzmicova.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_13 {

    public static void main(String[] args) {

        int[] array = new int[3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Array: " + Arrays.toString(array));

        int sum = array[0] + array[1] + array[2];

        System.out.println("Sum: " + sum);
    }
}
