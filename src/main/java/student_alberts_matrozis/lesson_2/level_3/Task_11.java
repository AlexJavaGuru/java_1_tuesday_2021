package student_alberts_matrozis.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter a first number: ");
        int num1 = a.nextInt();
        System.out.println("Please enter a second number: ");
        int num2 = a.nextInt();
        System.out.println("Please enter a third number: ");
        int num3 = a.nextInt();

        float result = (num1 + num2 + num3) / 3f;

        System.out.println("Result is = " + result);
    }
}
