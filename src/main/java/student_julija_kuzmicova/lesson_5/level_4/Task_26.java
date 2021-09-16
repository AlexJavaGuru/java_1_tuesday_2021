package student_julija_kuzmicova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length...");
        int userSize = scanner.nextInt();

        int[] array = new int[userSize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Array: " + Arrays.toString(array));
    }
}
