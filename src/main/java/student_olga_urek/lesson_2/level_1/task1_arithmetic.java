package student_olga_urek.lesson_2.level_1;

import java.util.Scanner;

public class task1_arithmetic {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter any integer:");
        int integerA = myScanner.nextInt();

        System.out.println("Please enter another integer:");
        int integerB = myScanner.nextInt();

        int addition_result = integerA + integerB;
        System.out.println(integerA + "+"+ integerB + "=" + addition_result);

        int subtraction_result = integerA - integerB;
        System.out.println(integerA + "-"+ integerB + "=" + subtraction_result);

        int multiplication_result = integerA * integerB;
        System.out.println(integerA + "*"+ integerB + "=" + multiplication_result);

        double division_result = (double) integerA / integerB;
        System.out.println(integerA + ":"+ integerB + "=" + division_result);


    }
}
