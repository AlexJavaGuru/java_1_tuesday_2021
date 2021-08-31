package student_einars_marhilevics.lesson_4.level_4;

class Calculator {
    int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int dif(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int multi(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if ( secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        }
            return thirdNumber;
    }
}
