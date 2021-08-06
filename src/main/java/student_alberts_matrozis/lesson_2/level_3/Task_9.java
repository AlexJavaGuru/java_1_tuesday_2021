package student_alberts_matrozis.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int num = a.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}
