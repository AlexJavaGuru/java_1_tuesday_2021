package student_alberts_matrozis.lesson_2.level_8;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_33 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Input a number: ");
        int minutes = a.nextInt();
        int seconds = minutes * 60;
        System.out.println("In " + minutes + " minutes is " + seconds + "!");
    }
}
