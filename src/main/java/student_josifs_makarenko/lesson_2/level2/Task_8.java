package student_josifs_makarenko.lesson_2.level2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name");
        String name = scanner.nextLine();
        System.out.println("Hello" +name+ "!");

    }
}
