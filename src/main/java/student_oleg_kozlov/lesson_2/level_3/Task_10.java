package student_oleg_kozlov.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide circle radius: ");
        double radius = scanner.nextDouble();

        // Circle perimeter = 2 * pi * radius
        double perimeter = 2 * Math.PI * radius;

        // Circle area = pi * radius * radius
        double area = Math.PI * (radius * radius);

        System.out.println("\n==========Results==========");
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
