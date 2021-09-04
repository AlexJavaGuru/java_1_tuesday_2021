package student_olga_urek.Lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter any integer:");
        int inputInteger = myScanner.nextInt();
        int remainder = inputInteger%2;
        if (remainder == 0) {
            System.out.println("The number you entered is even");
        } else {
            System.out.println("The number you entered is odd");
        }
    }
}
