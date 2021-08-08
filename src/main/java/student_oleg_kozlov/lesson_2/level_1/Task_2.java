package student_oleg_kozlov.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide the 1st fractional number for calculation: ");
        double fistNumber = scanner.nextDouble();
        System.out.print("Please provide the 2nd fractional number for calculation: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("\n==========Results==========");
        System.out.println(fistNumber + " + " + secondNumber + " = " + (fistNumber + secondNumber));
        System.out.println(fistNumber + " - " + secondNumber + " = " + (fistNumber - secondNumber));
        System.out.println(fistNumber + " * " + secondNumber + " = " + (fistNumber * secondNumber));
        System.out.println(fistNumber + " / " + secondNumber + " = " + (fistNumber / secondNumber));
    }
}
