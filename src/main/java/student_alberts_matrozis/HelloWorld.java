package student_alberts_matrozis;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Input a first number: ");
        double num1 = a.nextDouble();
        System.out.println("Input a second number: ");
        double num2 = a.nextDouble();
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Substraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));

    }
}

class Book {

}

class Phone {

}

class BankAccount {

    public static void main(String[] args) {

    }
}

class Turtle {

    public static void main(String[] args) {

    }

}

class LoginService {

    public static void main(String[] args) {
        System.out.println("You can login!");
    }

}

class HelloUser {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = a.nextLine();
        System.out.println("Hello " + name + "!");
    }
}

class NumberMultiplication {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int num = a.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}

class CircleCalculator {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter a circle radius: ");
        double radius = a.nextDouble();
        System.out.println("Perimeter is = " + (2 * 3.14 * radius));
        System.out.println("Area is = " + (3.14 * (radius * radius)));
    }
}

class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter a first number: ");
        int num1 = a.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = a.nextInt();
        System.out.println("Please enter third number: ");
        int num3 = a.nextInt();

        float result = (num1 + num2 + num3) / 3f;

        System.out.println("Result is = " + result);
    }
}