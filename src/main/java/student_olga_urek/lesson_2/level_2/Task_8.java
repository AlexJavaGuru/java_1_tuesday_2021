package student_olga_urek.lesson_2.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String userName = myScanner.nextLine();

        System.out.println("Hello, " + userName + "!");
    }
}
