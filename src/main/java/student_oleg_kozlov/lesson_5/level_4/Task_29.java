package student_oleg_kozlov.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_29 {
    public static void main(String[] args) {
        int[] array = new int[5];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Array: " + Arrays.toString(array));

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (counter == 0) {
                    System.out.print("Even numbers are: " + array[i]);
                } else {
                    System.out.print(", " + array[i]);
                }
                counter++;
            }
        }
    }
}
