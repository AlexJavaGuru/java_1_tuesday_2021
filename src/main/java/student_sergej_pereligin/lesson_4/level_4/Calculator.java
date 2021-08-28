package student_sergej_pereligin.lesson_4.level_4;
public class Calculator {

    int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    boolean isEven(int number) { // task 13
        return (number % 2 == 0);
    }


    int maxOfTwo(int firstNumber, int secondNumber) { // task 14
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }

    }

    public int maxofThree(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (secondNumber < firstNumber && firstNumber <= thirdNumber) {
            return thirdNumber;
        } else {
            return firstNumber;

        }
    }

}
