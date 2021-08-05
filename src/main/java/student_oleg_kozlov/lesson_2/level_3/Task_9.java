package student_oleg_kozlov.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide an integer number for calculation: ");
        int input = scanner.nextInt();

        System.out.println("\n==========Results==========");

        for (int i = 1; i < 11; i++) {
            System.out.println(input + " x " + i + " = " + (input * i));
        }
    }

}
