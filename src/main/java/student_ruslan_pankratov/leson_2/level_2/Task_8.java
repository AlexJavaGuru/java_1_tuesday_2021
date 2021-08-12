package student_ruslan_pankratov.leson_2.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }
}
