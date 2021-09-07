package student_sergej_pereligin.lesson_4.level_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите число:");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Понедельник");
        }
        if (number == 1) {
            System.out.println("Понедельник");
        }
        if (number == 2) {
            System.out.println("Вторник");
        }
        if (number == 3) {
            System.out.println("Среда");
        }
        if (number == 4) {
            System.out.println("Четверг");
        }
        if (number == 5) {
            System.out.println("Пятница");
        }
        if (number == 6) {
            System.out.println("Суббота");
        }
        if (number == 7) {
            System.out.println("Воскресенье");
        }
        if (number > 7 || number < 0) {
            System.out.println("Такого дня нет");
        }
    }
}
