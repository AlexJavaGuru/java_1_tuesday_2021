package student_julija_kuzmicova.lesson_4.level_3;

import java.util.Scanner;

class Task_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number...");
        int numberOne = scanner.nextInt();

        System.out.println("Please enter second number...");
        int numberTwo = scanner.nextInt();

        System.out.println("Please enter third number...");
        int numberThree = scanner.nextInt();

        if (numberOne == numberTwo && numberOne == numberThree) {
            System.out.println("All numbers are equal");
        } else if (numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
