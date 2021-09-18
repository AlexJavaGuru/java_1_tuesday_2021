package student_julija_kuzmicova.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number...");
        int userInput = scanner.nextInt();

        if (userInput > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

    }
}
