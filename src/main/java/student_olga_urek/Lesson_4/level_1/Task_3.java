package student_olga_urek.Lesson_4.level_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter an integer from 1 to 7:");
        int inputInteger = myScanner.nextInt();
        if (inputInteger == 1) {
            System.out.println("Monday");
        } else if (inputInteger == 2) {
            System.out.println("Tuesday");
        } else if (inputInteger == 3) {
            System.out.println("Wednesday");
        } else if (inputInteger == 4) {
            System.out.println("Thursday");
        } else if (inputInteger == 5) {
            System.out.println("Friday");
        } else if (inputInteger == 6) {
            System.out.println("Saturday");
        } else if (inputInteger == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Input error!");
        }
    }
}
