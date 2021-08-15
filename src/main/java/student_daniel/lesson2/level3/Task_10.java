package student_daniel.lesson2.level3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_10 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Введите вещественное число и нажмите клавишу \"Enter\" ");
        double radius = myScanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}