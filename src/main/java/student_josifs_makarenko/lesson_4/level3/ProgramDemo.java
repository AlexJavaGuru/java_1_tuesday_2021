package student_josifs_makarenko.lesson_4.level3;

import java.util.Scanner;

public class ProgramDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProgramForThreeNumbera program = new ProgramForThreeNumbera();
        System.out.println("Input three numbers");
        program.setNumberOne(scanner.nextInt());
        program.setNumberTwo(scanner.nextInt());
        program.setNumberThree(scanner.nextInt());
        program.equalOrDifferent();
        program.increasingOrDecreasing();
        program.lagerNumber();
        program.leastNumber();
    }
}
