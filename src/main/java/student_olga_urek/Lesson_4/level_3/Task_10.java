package student_olga_urek.Lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        System.out.println("This program finds the largest of three integers");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter any integer:");
        int inputIntegerA = myScanner.nextInt();
        System.out.println("Please enter another integer:");
        int inputIntegerB = myScanner.nextInt();
        System.out.println("Please enter the third integer:");
        int inputIntegerC = myScanner.nextInt();
        if ((inputIntegerA >= inputIntegerB) && (inputIntegerA >= inputIntegerC)) {
            System.out.println("The largest number you entered is " + inputIntegerA);
        } else if ((inputIntegerB >= inputIntegerA) && (inputIntegerB >= inputIntegerC)) {
            System.out.println("The largest number you entered is " + inputIntegerB);
        } else {
            System.out.println("The largest number you entered is " + inputIntegerC);
        }
    }
}
