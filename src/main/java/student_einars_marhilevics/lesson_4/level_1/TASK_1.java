package student_einars_marhilevics.lesson_4.level_1;

import java.util.Scanner;

class TASK_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter real number");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("This number is positive");
        } else {
            System.out.println("This number is negative");
        }
    }
}
