package student_julija_kuzmicova.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number...");
        int userInput = scanner.nextInt();

        if (userInput % 2 ==0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not even");
        }
    }
}
