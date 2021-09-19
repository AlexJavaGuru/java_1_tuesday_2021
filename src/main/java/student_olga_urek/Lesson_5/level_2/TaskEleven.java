package student_olga_urek.Lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class TaskEleven {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any integer: ");
        numbers[0] = scanner.nextInt();

        System.out.println("Please enter another integer: ");
        numbers[1] = scanner.nextInt();

        System.out.println("Please enter another integer: ");
        numbers[2] = scanner.nextInt();

        System.out.println(Arrays.toString(numbers));
    }
}
