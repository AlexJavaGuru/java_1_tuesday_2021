package student_artjom_satskih.lesson2.level7;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_29 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter 1nd number");
        int numberOne = myScanner.nextInt();
        System.out.println("enter 2nd number");
        int numberTwo = myScanner.nextInt();
        int result = numberOne + numberTwo;
        System.out.println("result is" + result);
    }
}
