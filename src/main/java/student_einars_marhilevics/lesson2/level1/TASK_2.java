package student_einars_marhilevics.lesson2.level1;

import java.util.Scanner;

public class TASK_2 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter first decimal number");
        double firstNumber = myScanner.nextDouble();

        System.out.println("Enter second decimal number");
        double secondNumber = myScanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double min = firstNumber - secondNumber;
        double multi = firstNumber * secondNumber;
        double div = firstNumber / secondNumber;


        System.out.println("sum is " + sum);
        System.out.println("difference is " + min);
        System.out.println("multiplication is " + multi);
        System.out.println("division is " + div);



    }
}


