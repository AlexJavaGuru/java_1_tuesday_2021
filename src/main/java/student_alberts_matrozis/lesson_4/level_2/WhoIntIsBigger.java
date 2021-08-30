package student_alberts_matrozis.lesson_4.level_2;

import java.util.Scanner;

// Task 5
class WhoIntIsBigger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число число!");
        int num = s.nextInt();
        System.out.println("Введите второе число!");
        int num2 = s.nextInt();
        if (num > num2) {
            System.out.println("Наибольшее число это - " + num + "!");
            return;
        }
        System.out.println("Наибольшее число это - " + num2 + "!");
    }
}
