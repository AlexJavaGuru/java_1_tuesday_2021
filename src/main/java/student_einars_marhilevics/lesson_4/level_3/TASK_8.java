package student_einars_marhilevics.lesson_4.level_3;

import java.util.Scanner;

class TASK_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int numberOne = scanner.nextInt();
        System.out.println("Please enter second number");
        int numberTwo = scanner.nextInt();
        System.out.println("Please enter third number");
        int numberThree = scanner.nextInt();
        if (numberOne == numberTwo && numberTwo == numberThree) {
            System.out.println("All numbers are equal");
        } else if (numberOne != numberTwo && numberTwo != numberThree) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
