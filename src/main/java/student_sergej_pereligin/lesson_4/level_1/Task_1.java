package student_sergej_pereligin.lesson_4.level_1;

import java.util.Scanner;

/*Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.*/
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
    }
}
