package student_alberts_matrozis.lesson_4.level_2;

import java.util.Scanner;

// Task 6
class WhoIntIsLower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число число!");
        int num = s.nextInt();
        System.out.println("Введите второе число!");
        int num2 = s.nextInt();
        if (num < num2) {
            System.out.println("Наименьшее число это - " + num + "!");
        } else {
            System.out.println("Наименьшее число это - " + num2 + "!");
        }
    }
}
