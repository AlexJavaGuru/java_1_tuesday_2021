package student_oleg_kozlov.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide the 1st integer number for calculation: ");
        int fistNumber = scanner.nextInt();
        System.out.print("Please provide the 2nd integer number for calculation: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Please provide the 3rd integer number for calculation: ");
        int thirdNumber = scanner.nextInt();

        double result = ((double)fistNumber + secondNumber + thirdNumber) / 3;
        System.out.println("\nResult = " + result);

    }

}
