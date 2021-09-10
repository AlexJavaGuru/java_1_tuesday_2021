package student_einars_marhilevics.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class TASK_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[3];
        System.out.println("Please enter 1st number");
        numbers[0] = scanner.nextInt();
        System.out.println("Please enter 2nd number");
        numbers[1] = scanner.nextInt();
        System.out.println("Please enter 3rd number");
        numbers[2] = scanner.nextInt();
        System.out.println(Arrays.toString(numbers));
    }
}
