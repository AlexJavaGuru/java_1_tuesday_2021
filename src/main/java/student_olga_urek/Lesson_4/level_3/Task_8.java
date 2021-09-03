package student_olga_urek.Lesson_4.level_3;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {
        System.out.println("This program compares three integers");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter any integer:");
        int inputIntegerA = myScanner.nextInt();
        System.out.println("Please enter another integer:");
        int inputIntegerB = myScanner.nextInt();
        System.out.println("Please enter the third integer:");
        int inputIntegerC = myScanner.nextInt();
        if ((inputIntegerA != inputIntegerB) && (inputIntegerA !=inputIntegerC) && (inputIntegerC != inputIntegerB)) {
            System.out.println("All three integers are different!");
        } else if ((inputIntegerA == inputIntegerB) && (inputIntegerA ==inputIntegerC)) {
            System.out.println("All three integers are equal!");
        } else {
            System.out.println("The integers you entered are neither all different nor all equal!");
        }
    }
}