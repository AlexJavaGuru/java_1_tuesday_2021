package student_olga_urek.Lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class TaskTwentyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter an integer: ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
