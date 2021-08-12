package student_josifs_makarenko.lesson_2.level1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a first number");
        int num1 = scanner.nextInt();
        System.out.println("Input second number");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of that numbers =" +sum);
        int diff = num1 - num2;
        System.out.println("difference of that numbers =" +diff);
        System.out.println("multiplication of that numbers =" +num1*num2);
        System.out.println("division of that numbers =" +(double)num1/num2);

    }
}
