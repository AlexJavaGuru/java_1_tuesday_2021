package student_einars_marhilevics.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class TASK_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of massive!");
        int userSize = scanner.nextInt();
        int[] numbers = new int[userSize];
        for (int i = 0; i < userSize; i++) {
            System.out.println("Please enter massive number nr " + (i + 1));
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
