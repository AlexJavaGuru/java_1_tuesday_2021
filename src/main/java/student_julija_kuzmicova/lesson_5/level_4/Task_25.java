package student_julija_kuzmicova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length...");
        int userSize = scanner.nextInt();

        int[] array = new int[userSize];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number...");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(array));
    }
}
