package student_ruslan_pankratov.lesson_2.level_1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstDoubleNumber = scanner.nextDouble();
        double twoNumber = scanner.nextDouble();

        double division = firstDoubleNumber / twoNumber;
        System.out.println("Результат деления = " + division);

        double multiplication = firstDoubleNumber * twoNumber;
        System.out.println("Результат умножения = " + multiplication);

        double addition = firstDoubleNumber + twoNumber;
        System.out.println("Результат суммы = " + addition);

        double subtraction = firstDoubleNumber - twoNumber;
        System.out.println("Результат вычитания = " + subtraction);
    }
}
