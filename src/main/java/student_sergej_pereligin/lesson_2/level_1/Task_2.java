package student_sergej_pereligin.lesson_2.level_1;

import java.util.Scanner;

/*Написать консольную программу, которая запрашивает у пользователя два вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble();*/
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Результат:");
        System.out.println(firstNumber  + "+2 = " + (firstNumber + 2));
        System.out.println(firstNumber  + "-2 = " + (firstNumber - 2));
        System.out.println(firstNumber  + "*2 = " + (firstNumber * 2));
        System.out.println(firstNumber  + "/2 = " + (firstNumber / 2));
    }

}
