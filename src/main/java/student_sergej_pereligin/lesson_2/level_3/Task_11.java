package student_sergej_pereligin.lesson_2.level_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

/*Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом.*/
@CodeReview(approved = false)
@CodeReviewComment(comment = "Не используйте такие сокращения типа s, s1. Нам не жалко букв. Пишите полное название scanner" +
        "придумайте более подходящее название для s, a, b, c")
public class Task_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input integer:");
        int a = s.nextInt();
        System.out.println("Input integer:");
        int b = s.nextInt();
        System.out.println("Input integer:");
        int c = s.nextInt();
        System.out.println("Middle integer=" + ((a + b + c) / 3));
    }
}
