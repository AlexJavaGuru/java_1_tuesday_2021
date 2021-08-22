package student_josifs_makarenko.lesson_3.level7;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle1 = new Circle();
        System.out.println("Input radius");
        circle1.setRadius(scanner.nextDouble());
        circle1.calculateArea();
    }
}
