package student_olga_urek.lesson_2.level_7;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_32 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        /* Here I´m learning
        to implement the if...else statement in Java

         */

        //and using two types of comments

        System.out.println("Please enter any integer:");
        int inputInteger = myScanner.nextInt();
        int remainder = inputInteger % 2;

        if (remainder == 0) {
            System.out.println("The number you entered is even");
        } else {
            System.out.println("The number you entered is odd");
        }


    }
}
