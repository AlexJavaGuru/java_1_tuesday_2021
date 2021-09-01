package student_oleg_kozlov.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide a number: ");
        int userInput = scanner.nextInt();

        if (userInput < 0) {
            System.out.println("Provided number is negative");
        } else {
            System.out.println("Provided number is positive");
        }
    }
}
