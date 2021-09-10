package student_josifs_makarenko.lesson_4.level2;

import java.util.Scanner;

public class ProgramDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProgramForTwoNumbers program = new ProgramForTwoNumbers();
        System.out.println("Input two numbers");
        program.largerNumber(scanner.nextInt(), scanner.nextInt());
        System.out.println("Input two numbers");
        program.lesserNumber(scanner.nextInt(), scanner.nextInt());
        System.out.println("Input two numbers");
        program.equalOrDifferent(scanner.nextInt(), scanner.nextInt());

    }
}
