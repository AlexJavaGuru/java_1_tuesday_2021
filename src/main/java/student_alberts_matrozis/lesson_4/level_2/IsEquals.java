package student_alberts_matrozis.lesson_4.level_2;

import java.util.Scanner;

// Task 7
class IsEquals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number!");
        int num = s.nextInt();
        System.out.println("Enter second number!");
        int num2 = s.nextInt();

        if (num == num2) {
            System.out.println("Numbers are equals!");
            return;
        }
        System.out.println("Numbers are different!");
    }
}
