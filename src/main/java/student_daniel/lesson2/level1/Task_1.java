package student_daniel.lesson2.level1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Введите целых два числа, после каждого введенного числа нажмите клавишу \"Enter\" ");
        int numOne = myScanner.nextInt();
        int numTwo = myScanner.nextInt();

        double multiplyResult = (double) numOne * numTwo;
        double devideResult = (double) numOne / numTwo;
        double plusResult = (double) numOne + numTwo;
        double minusResult = (double) numOne - numTwo;

        System.out.println("Умножение: " + multiplyResult);
        System.out.println("Деление: " + devideResult);
        System.out.println("Сложение: " + plusResult);
        System.out.println("Вычитание: " + minusResult);
    }
}