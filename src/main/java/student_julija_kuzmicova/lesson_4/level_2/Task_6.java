package student_julija_kuzmicova.lesson_4.level_2;

import java.util.Scanner;

class Task_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number...");
        int numberOne = scanner.nextInt();

        System.out.println("Please enter second number...");
        int numberTwo = scanner.nextInt();

        if (numberOne < numberTwo) {
            System.out.println("The smallest number is " + numberOne);
        } else {
            System.out.println("The smallest number is " + numberTwo);
        }
    }
}
