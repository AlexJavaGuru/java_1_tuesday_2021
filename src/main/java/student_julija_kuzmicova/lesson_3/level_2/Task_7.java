package student_julija_kuzmicova.lesson_3.level_2;

import java.util.Scanner;

//Task_7, Task_8, Task_9
class Task_7 {

    public static void main(String[] args) {

        String myName = "Julija";
        System.out.println(myName);

        String greeting = "Hi " + myName + "!";
        System.out.println(greeting);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name...");
        String userName = scanner.next();
        System.out.println("Hello " + userName + "!");
    }

}
