package student_julija_kuzmicova.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first fractional number...");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Enter the second fractional number...");
        double secondDoubleNumber = scanner.nextDouble();

        double addition = firstDoubleNumber + secondDoubleNumber;
        double subtraction = firstDoubleNumber - secondDoubleNumber;
        double multiplication = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Results:");
        System.out.println(firstDoubleNumber + "+" + secondDoubleNumber + "=" + addition);
        System.out.println(firstDoubleNumber + "-" + secondDoubleNumber + "=" + subtraction);
        System.out.println(firstDoubleNumber + "*" + secondDoubleNumber + "=" + multiplication);
        System.out.println(firstDoubleNumber + "/" + secondDoubleNumber + "=" + division);
    }


}
