package student_josifs_makarenko.lesson_4.level2;

import java.util.Scanner;

public class ProgramDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProgramForTwoNumbers program = new ProgramForTwoNumbers();
        System.out.println("Input two numbers");
        program.setNumberOne(scanner.nextInt());
        program.setNumberTwo(scanner.nextInt());
        program.largerNumber();
        program.lesserNumber();
        program.equalOrDifferent();

    }
}
