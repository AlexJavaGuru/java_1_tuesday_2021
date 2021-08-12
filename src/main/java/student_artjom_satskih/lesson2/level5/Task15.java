package student_artjom_satskih.lesson2.level5;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task15 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Your Name!");
        String name = myScanner.nextLine();
        System.out.print("Hello" + name);

    }
}
