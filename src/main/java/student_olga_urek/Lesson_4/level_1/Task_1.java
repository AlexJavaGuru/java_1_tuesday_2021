package student_olga_urek.Lesson_4.level_1;

//Task 1, 2

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter any integer:");
        int inputInteger = myScanner.nextInt();
        if (inputInteger > 0) {
            System.out.println("The number you entered is positive");
        } else if (inputInteger < 0) {
            System.out.println("The number you entered is negative");
        } else {
            System.out.println("The number you entered equals zero");
        }
    }
}
