package student_oleg_kozlov.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide 1st number: ");
        int number1 = scanner.nextInt();

        System.out.print("Please provide 2nd number: ");
        int number2 = scanner.nextInt();

        System.out.print("Please provide 3rd number: ");
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Greater number is: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Greater number is: " + number2);
        }  else if (number3 > number1 && number3 > number2) {
            System.out.println("Greater number is: " + number3);
        } else if (number1 == number2 && number1 > number3) {
            System.out.println("Greater number is: " + number1);
        } else if (number2 == number3 && number2 > number1) {
            System.out.println("Greater number is: " + number2);
        } else if (number1 == number3 && number1 > number2) {
            System.out.println("Greater number is: " + number1);
        } else {
            System.out.println("All numbers are equal");
        }
    }
}
