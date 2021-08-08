package student_olga_urek.lesson_2.level_3;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle:");
        double radius = myScanner.nextDouble();
        double circumference = radius * 2 * Math.PI;
        double area = radius * radius * Math.PI;

        System.out.println("Circumference of the circle = " + circumference);
        System.out.println("Area of the circle = " + area);

    }
}