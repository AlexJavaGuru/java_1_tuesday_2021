package student_josifs_makarenko.lesson_2.level3;

import teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a radius (real number)");
        double pi = 3.14;
        double r = scanner.nextDouble();
        double P = 2 * pi * r;
        System.out.println("Perimeter is = " + P);
        double S = pi * (r * r);
        System.out.println("Area is =" + S);
    }
}
