package teacher.lesson_2_variables.lessoncode;


import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter first variable...");
        int variableA = myScanner.nextInt();

        System.out.println("Enter second variable...");
        int variableB = myScanner.nextInt();
        int result = variableA + variableB;
        System.out.println("Result is: " + result);

        System.out.println("Enter first variable...");
        int variableC = myScanner.nextInt();

        System.out.println("Enter second variable...");
        int variableD = myScanner.nextInt();
        System.out.println((double) variableC / variableD);
    }
}
