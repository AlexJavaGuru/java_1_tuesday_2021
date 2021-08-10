package student_sergej_pereligin.lesson_2.level_3;

import java.util.Scanner;

/*Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом.*/
public class Task_11 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Input integer:");
        int a =s.nextInt();
        System.out.println("Input integer:");
        int b =s.nextInt();
        System.out.println("Input integer:");
        int c =s.nextInt();
        System.out.println("Middle integer="+((a+b+c)/3));
    }
}
