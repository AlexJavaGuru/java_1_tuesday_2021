package student_ruslan_pankratov.leson_2.level_1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int twoNumber = scanner.nextInt();

        int result = firstNumber + twoNumber;
        System.out.println("Мой результат = " + result);

    }
}
