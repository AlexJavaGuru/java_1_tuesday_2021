package student_olga_urek.Lesson_4.level_2;

import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {
        System.out.println("This program compares two integers");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter any integer:");
        int inputIntegerA = myScanner.nextInt();
        System.out.println("Please enter another integer:");
        int inputIntegerB = myScanner.nextInt();
        if (inputIntegerA == inputIntegerB) {
            System.out.println("The integers you entered are equal");
        } else {
            System.out.println("The integers you entered are not equal");
        }
    }
}
