package student_alberts_matrozis.lesson_2.level_1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Input a first number: ");
        double num1 = a.nextDouble();
        System.out.println("Input a second number: ");
        double num2 = a.nextDouble();
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Substraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));

    }
}
