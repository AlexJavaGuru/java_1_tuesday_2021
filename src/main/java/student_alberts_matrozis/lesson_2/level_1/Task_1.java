package student_alberts_matrozis.lesson_2.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Плохо, что объект сканера называеться a " +
        "Такое название не дает никакой смысловой нагрузки")
public class Task_1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Input a first number: ");
        int num1 = a.nextInt();
        System.out.println("Input a second number: ");
        int num2 = a.nextInt();
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Substraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
    }
}
