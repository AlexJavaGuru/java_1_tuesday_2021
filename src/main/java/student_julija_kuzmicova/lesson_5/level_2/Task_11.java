package student_julija_kuzmicova.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        System.out.println("Please enter first number...");
        array[0] = scanner.nextInt();
        System.out.println("Please enter second number...");
        array[1] = scanner.nextInt();
        System.out.println("Please enter third number...");
        array[2] = scanner.nextInt();

        System.out.println("Array: " + Arrays.toString(array));
    }
}
