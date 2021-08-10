package student_artjom_satskih.lesson2.level2;

import java.io.PrintStream;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Yor Name?");
//        String name = name.nextLine();
        PrintStream printStream = System.out.printf("Hello" + name + "!");

    }
}
