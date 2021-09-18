package student_alberts_matrozis.lesson_4.level_1;

import java.util.Scanner;

// Task 4

class Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число!");
        int num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }
    }
}
