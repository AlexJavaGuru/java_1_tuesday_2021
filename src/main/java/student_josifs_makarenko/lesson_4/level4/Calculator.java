package student_josifs_makarenko.lesson_4.level4;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int dif(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber){
            return firstNumber;
        }
        return secondNumber;
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            return firstNumber;
        } else if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (secondNumber == firstNumber && secondNumber < thirdNumber) {
            return thirdNumber;
        } else if (thirdNumber == firstNumber && thirdNumber < secondNumber) {
            return secondNumber;
        } else if (secondNumber == thirdNumber && secondNumber < firstNumber) {
            return firstNumber;
        } else if (secondNumber == firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber == firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else if (secondNumber == thirdNumber && secondNumber > firstNumber) {
            return secondNumber;
        }
        return thirdNumber;
    }
}