package student_olga_urek.Lesson_4.level_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        System.out.println("This program analyzes the order of three integers");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter any integer:");
        int inputIntegerA = myScanner.nextInt();
        System.out.println("Please enter another integer:");
        int inputIntegerB = myScanner.nextInt();
        System.out.println("Please enter the third integer:");
        int inputIntegerC = myScanner.nextInt();
        if ((inputIntegerA > inputIntegerB) && (inputIntegerB > inputIntegerC)) {
            System.out.println("The integers are in descending order!");
        } else if ((inputIntegerA < inputIntegerB) && (inputIntegerB < inputIntegerC)) {
            System.out.println("The integers are in ascending order!");
        } else {
            System.out.println("The integers you entered are in neither ascending nor descending order!");
        }
    }
}
