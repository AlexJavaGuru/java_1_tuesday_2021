package student_daniel.lesson2.level1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Введите два вещественных числа, после каждого введенного числа нажмите клавишу \"Enter\" ");
        double numOne = myScanner.nextDouble();
        double numTwo = myScanner.nextDouble();

        double multiplyResult = numOne * numTwo;
        double devideResult = numOne / numTwo;
        double plusResult = numOne + numTwo;
        double minusResult = numOne - numTwo;

        System.out.println("Умножение: " + multiplyResult);
        System.out.println("Деление: " + devideResult);
        System.out.println("Сложение: " + plusResult);
        System.out.println("Вычитание: " + minusResult);
    }
}