package student_julija_kuzmicova.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number...");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number...");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = (double) firstNumber / secondNumber;

        System.out.println("Results:");
        System.out.println(firstNumber + "+" + secondNumber + "=" + addition);
        System.out.println(firstNumber + "-" + secondNumber + "=" + subtraction);
        System.out.println(firstNumber + "*" + secondNumber + "=" + multiplication);
        System.out.println(firstNumber + "/" + secondNumber + "=" + division);
    }
}
