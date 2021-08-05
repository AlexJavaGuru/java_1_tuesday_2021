package student_oleg_kozlov.lesson_2.level_2;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide your name: ");
        String name = scanner.nextLine();

        if (name.isEmpty())
            name = "Unknown";

        System.out.println("\nHello " + name + "!");

    }

}
