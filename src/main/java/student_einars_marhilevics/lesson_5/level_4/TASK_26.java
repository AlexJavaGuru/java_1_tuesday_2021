package student_einars_marhilevics.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class TASK_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter massive size");
        int userSize = scanner.nextInt();
        int[] numbers = new int[userSize];
        for (int i = 0; i < userSize; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
