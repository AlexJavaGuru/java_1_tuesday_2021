package student_oleg_kozlov.lesson_3.level_2;

import java.util.Scanner;

// Task_7, Task_8, Task_9
class Task_7 {

    public static void main(String[] args) {

        String myName = "Oleg";

        System.out.println(myName);
        System.out.println();

        System.out.println("Hi " + myName + "!");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide your name: ");
        String userName = scanner.nextLine();

        if (userName.isEmpty())
            userName = "Incognito";

        System.out.println("Hello " + userName + "!");
    }
}
