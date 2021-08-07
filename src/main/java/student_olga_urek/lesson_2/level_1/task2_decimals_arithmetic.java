package student_olga_urek.lesson_2.level_1;

import java.util.Scanner;

public class task2_decimals_arithmetic {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter any decimal number:");
        double decimalA = myScanner.nextDouble();

        System.out.println("Please enter another decimal number:");
        double decimalB = myScanner.nextDouble();

        double addition_result = decimalA + decimalB;
        System.out.println(decimalA + "+"+ decimalB + "=" + addition_result);

        double subtraction_result = decimalA - decimalB;
        System.out.println(decimalA + "-"+ decimalB + "=" + subtraction_result);

        double multiplication_result = decimalA * decimalB;
        System.out.println(decimalA + "*"+ decimalB + "=" + multiplication_result);

        double division_result = decimalA / decimalB;
        System.out.println(decimalA + ":"+ decimalB + "=" + division_result);


    }
}
