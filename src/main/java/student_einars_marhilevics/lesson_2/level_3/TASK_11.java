package student_einars_marhilevics.lesson_2.level_3;

import java.util.Scanner;

public class TASK_11 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int numOne = myScanner.nextInt();
        System.out.println("Enter 2nd number");
        int numTwo = myScanner.nextInt();
        System.out.println("Enter 3rd number");
        int numThree = myScanner.nextInt();
        double result = (double) (numOne + numTwo + numThree) / 3;
        System.out.println("Average number is " + result);


    }
}
