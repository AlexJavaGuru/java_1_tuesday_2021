package student_alberts_matrozis.lesson_4.level_3;

import java.util.Scanner;

// Task 9
class IncreasingOrDecreasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int num = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();
        System.out.println("Enter third number");
        int num3 = s.nextInt();

        if (num < num2 && num2 < num3) {
            System.out.println("Increasing");
        } else if (num > num2 && num2 > num3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
