package student_daniel.lesson4.level4;

import java.util.Scanner;

class Calculator {
    //Task 11 12
    Scanner myScanner = new Scanner(System.in);

    double firstNumber = myScanner.nextDouble();
    double secondNumber = myScanner.nextDouble();
    //Task 15
    double thirdNumber = myScanner.nextDouble();

    public double increase() {
        return firstNumber + secondNumber;
    }

    public double decrease() {
        return firstNumber - secondNumber;
    }

    public double multiply() {
        return firstNumber * secondNumber;
    }

    public double divide() {
        return firstNumber / secondNumber;
    }

    //Task 13
    public boolean isEven(int firstNumber) {
        return firstNumber % 2 == 0;
    }

    public boolean isOdd(int secondNumber) {
        return secondNumber % 2 == 0;
    }

    //Task 14
    public int isGreater(int firstNumber, int secondNumber) {
        if(firstNumber > secondNumber ) {
            return firstNumber;
        }
        else {
            return secondNumber;
        }
    }

    void printResult() {
        //Task 12
        System.out.println(increase());
        System.out.println(decrease());
        System.out.println(multiply());
        System.out.println(divide());

        //Task 13
        System.out.println("Even number? " + firstNumber + " " + isEven((int)firstNumber));
        System.out.println("Even number? " + secondNumber + " " + isOdd((int)secondNumber));

        //Task 14
        System.out.println("Greater number: " + isGreater((int)firstNumber, (int)secondNumber));
    }
}
