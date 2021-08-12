package student_alberts_matrozis.lesson_2.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_10 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter a circle radius: ");
        double radius = a.nextDouble();
        System.out.println("Perimeter is = " + (2 * 3.14 * radius));
        System.out.println("Area is = " + (3.14 * (radius * radius)));
    }
}
