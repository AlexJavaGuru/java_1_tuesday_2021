package student_josifs_makarenko.lesson_4.level1;

import java.util.Scanner;
//task 1,2,4
public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Input a number");
        calculator.setNumber(scanner.nextInt());
        calculator.showWhatIsYourNumber();
        calculator.evenOdd();
    }
}
