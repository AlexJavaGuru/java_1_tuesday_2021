package student_olga_urek.lesson_2.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class task_10 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("This program calculates circumference and area of a circle given its radius. Please enter the radius of the circle:");
        double radius = myScanner.nextDouble();
        double circumference = radius * 2 * Math.PI;
        double area = radius * radius * Math.PI;

        System.out.println("Circumference of the circle = " + circumference);
        System.out.println("Area of the circle = " + area);

    }
}