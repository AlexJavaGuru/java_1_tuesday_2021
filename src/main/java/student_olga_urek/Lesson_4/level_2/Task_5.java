package student_olga_urek.Lesson_4.level_2;

import java.util.Scanner;

//Task 5, 6

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("This programs finds the larger of the two integers");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter any integer:");
        int inputIntegerA = myScanner.nextInt();
        System.out.println("Please enter another integer:");
        int inputIntegerB = myScanner.nextInt();

        if (inputIntegerA > inputIntegerB) {
            System.out.println("The larger of the two integers is " + inputIntegerA);
        } else if (inputIntegerA < inputIntegerB) {
            System.out.println("The larger of the two integers is " + inputIntegerB);
        } else {
            System.out.println("The integers you entered are equal.");
        }
    }
}
