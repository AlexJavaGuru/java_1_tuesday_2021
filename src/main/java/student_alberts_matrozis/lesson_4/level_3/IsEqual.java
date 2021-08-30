package student_alberts_matrozis.lesson_4.level_3;

import java.util.Scanner;

// Task 8
class IsEqual {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int num = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();
        System.out.println("Enter third number");
        int num3 = s.nextInt();

        if (num == num2 && num2 == num3 && num == num3) {
            System.out.println("All numbers are equal!");
        }
        else if (num == num2 || num2 == num3 || num == num3) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
