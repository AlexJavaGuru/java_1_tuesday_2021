package student_oleg_kozlov.lesson_4.level_2;

import java.util.Scanner;

class Task_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide 1st number: ");
        int number1 = scanner.nextInt();

        System.out.print("Please provide 2nd number: ");
        int number2 = scanner.nextInt();

        if (number1 < number2) {
            System.out.println("Lower number is " + number1);
        } else if (number2 < number1) {
            System.out.println("Lower number is " + number2);
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
