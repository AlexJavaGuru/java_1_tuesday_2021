package student_josifs_makarenko.lesson_2.level5;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you write a joke under mine");
        System.out.print(" Interesting fact tomato wives drink only tomato juices ");
        String joke1 = scanner.nextLine();
        System.out.println("What happen? You can not do that ... Fine,you have one more chance");
        System.out.print(" Interesting fact tomato wives drink only tomato juices ");
        String joke2 = scanner.nextLine();
        System.out.println("Again? It's your last try...");
        System.out.print(" Interesting fact tomato wives drink only tomato juices ");
        String joke3 = scanner.nextLine();
        System.out.println("YOU LOSE! HAHAHAHAHAHAHAH");
    }
}
