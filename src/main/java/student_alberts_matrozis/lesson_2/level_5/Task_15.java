package student_alberts_matrozis.lesson_2.level_5;

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = a.nextLine();
        System.out.print("Hello ");
        System.out.print(name + ", ");
        System.out.print("nice to meet you!");
    }
}
