package student_olga_urek.lesson_2.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class task_11 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("This program calculates the average of any three integers. Please enter any three integers:");
        int integerOne = myScanner.nextInt();
        int integerTwo = myScanner.nextInt();
        int integerThree = myScanner.nextInt();

        double average = (double)(integerOne + integerTwo + integerThree) / 3;
        System.out.println("The average of the values you entered is " + average);

    }

}
