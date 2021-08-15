package student_ruslan_pankratov.leson_2.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите ваше целое число");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int multiplication = i * number;
            System.out.println(number + " x " + i + " = " + multiplication);
        }
    }
}
