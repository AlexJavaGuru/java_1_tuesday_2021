package student_julija_kuzmicova.lesson_4.level_4;

//Task_11, Task_13, Task_14, Task_15

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return  firstNumber - secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return  firstNumber / secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return  firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber){
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

}
