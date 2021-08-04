package student_einars_marhilevics.lesson2.level1;

import java.util.Scanner;

public class TASK_1 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = myScanner.nextInt();

        System.out.println("Enter second number");
        int secondNumber = myScanner.nextInt();

        int sum = firstNumber + secondNumber;
        int min = firstNumber - secondNumber;
        int multi = firstNumber * secondNumber;
        double div = (double) firstNumber / secondNumber;


        System.out.println("sum is " + sum);
        System.out.println("difference is " + min);
        System.out.println("multiplication is " + multi);
        System.out.println("division is " + div);



    }
}