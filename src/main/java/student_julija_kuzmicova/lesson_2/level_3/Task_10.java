package student_julija_kuzmicova.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius as a fractional number...");
        double radius = scanner.nextDouble();

        double perimeter = radius * 2 * Math.PI;
        double area = radius * radius * Math.PI;

        System.out.println("Results:");
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
