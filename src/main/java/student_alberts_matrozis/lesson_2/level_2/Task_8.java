package student_alberts_matrozis.lesson_2.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = a.nextLine();
        System.out.print("Hello " + name + "!");
    }
}
