package student_einars_marhilevics.lesson_4.level_1;

import java.util.Scanner;

class TASK_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Number is 0");
        } else if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
