package student_artjom_satskih.lesson2.level3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("ender radius")
               // vvedite radius
        double radius = sc.nextDouble();
       double area = Math.PI * (radius * radius);
        System.out.println("Area is:" + area);
        double perimeter = Math.PI * 2*radius;
        System.out.println("Perimeter is:" + perimeter);



    }
}
