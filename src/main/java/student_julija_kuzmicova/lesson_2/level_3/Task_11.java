package student_julija_kuzmicova.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number...");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number...");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the third number...");
        int thirdNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        double average = (double) sum / 3;

        System.out.println("Average is = " + average);
    }
}
