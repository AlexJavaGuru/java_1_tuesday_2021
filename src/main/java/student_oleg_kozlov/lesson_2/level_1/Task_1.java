package student_oleg_kozlov.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide the 1st integer number for calculation: ");
        int fistNumber = scanner.nextInt();
        System.out.print("Please provide the 2nd integer number for calculation: ");
        int secondNumber = scanner.nextInt();

        System.out.println("\n==========Results==========");
        System.out.println(fistNumber + " + " + secondNumber + " = " + (fistNumber + secondNumber));
        System.out.println(fistNumber + " - " + secondNumber + " = " + (fistNumber - secondNumber));
        System.out.println(fistNumber + " * " + secondNumber + " = " + (fistNumber * secondNumber));
        System.out.println(fistNumber + " / " + secondNumber + " = " + ((double)fistNumber / secondNumber));
    }

}
