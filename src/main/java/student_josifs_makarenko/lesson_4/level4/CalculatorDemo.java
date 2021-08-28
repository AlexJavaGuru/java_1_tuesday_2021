package student_josifs_makarenko.lesson_4.level4;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(5, 6));
        System.out.println(calculator.dif(5, 6));
        System.out.println(calculator.multiplication(5, 6));
        System.out.println(calculator.division(5, 6));
    }
}