package student_ruslan_pankratov.leson_2.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9_2 {

    int j = 1;
    int d = 11;

    public void factorial(int one) {

        if (j != d) {
            int sum = one * j;
            System.out.println(one + " x " + j++ + " = " + sum);
            factorial(one);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите ваше целое число");
        int one = scanner.nextInt();

        Task_9_2 task = new Task_9_2();
        task.factorial(one);

    }
}