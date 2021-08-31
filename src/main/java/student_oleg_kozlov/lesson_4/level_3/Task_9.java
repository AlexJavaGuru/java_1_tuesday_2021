package student_oleg_kozlov.lesson_4.level_3;

import java.util.Scanner;

class Task_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide 1st number: ");
        int number1 = scanner.nextInt();

        System.out.print("Please provide 2nd number: ");
        int number2 = scanner.nextInt();

        System.out.print("Please provide 3rd number: ");
        int number3 = scanner.nextInt();

        if (number1 < number2 && number2 < number3) {
            System.out.println("increasing");
        } else if (number1 > number2 && number2 > number3) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
