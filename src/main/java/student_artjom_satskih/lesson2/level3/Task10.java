package student_artjom_satskih.lesson2.level3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ender radius");
               // vvedite radius
        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Area is:" + area);
        double perimeter = Math.PI * 2 * radius;
        System.out.println("Perimeter is:" + perimeter);
    }
}
