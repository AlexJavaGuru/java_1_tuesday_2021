package student_ruslan_pankratov.lesson_4.level_4;

//Task_11
//Task_13
//Task_14
//Task_15
class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber) {
            return secondNumber;
        } else {
            return secondNumber;
        }

    }


    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int threeNumber) {
        if ((firstNumber >= secondNumber) && (secondNumber >= threeNumber)) {
            return firstNumber;
        } else if ((secondNumber >= firstNumber) && (firstNumber >= threeNumber)) {
            return secondNumber;
        } else if((threeNumber >= firstNumber) && (threeNumber >= secondNumber)){
            return threeNumber;
        } else {
            return firstNumber;
        }

    }


}
