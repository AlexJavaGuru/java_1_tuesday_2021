package student_sergej_pereligin.lesson_2.level_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

/*Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/
@CodeReview(approved = false)
@CodeReviewComment(comment = "Не используйте такие сокращения типа s, s1. Нам не жалко букв. Пишите полное название scanner" +
        "придумайте более подходящее название для s1")
public class Task_10 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Radius:");
        double s1=s.nextDouble();
        System.out.println("Perimiter is="+(2* s1 *Math.PI));
        System.out.println("Area is="+(s1*s1*Math.PI));
    }
}
