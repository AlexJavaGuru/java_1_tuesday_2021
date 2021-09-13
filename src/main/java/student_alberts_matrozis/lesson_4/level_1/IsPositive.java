package student_alberts_matrozis.lesson_4.level_1;

import java.util.Scanner;

// Task 1
public class IsPositive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число!");
        int num = s.nextInt();
        if (num > 0) {
            System.out.println("Число положительное!");
            return;
        }
        System.out.println("Число отрицательное!");
    }
}
