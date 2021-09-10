package student_josifs_makarenko.lesson_4.level3;

import java.util.Scanner;

public class ProgramDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProgramForThreeNumber program = new ProgramForThreeNumber();
        System.out.println("Input three numbers");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        program.equalOrDifferent(numberOne, numberTwo, numberThree);
        program.increasingOrDecreasing(numberOne, numberTwo, numberThree);
        program.lagerNumber(numberOne, numberTwo, numberThree);
        program.leastNumber(numberOne, numberTwo, numberThree);
    }
}
