package student_einars_marhilevics.lesson_4.level_2;

import java.util.Scanner;

class TASK_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int numberOne = scanner.nextInt();
        System.out.println("Please enter second number");
        int numberTwo = scanner.nextInt();
        if (numberOne > numberTwo) {
            System.out.println(numberTwo + " is smaller than " + numberOne);
        } else if (numberOne < numberTwo) {
            System.out.println(numberOne + " is smaller than " + numberTwo);
        } else {
            System.out.println("numbers are equals");
        }
    }
}
