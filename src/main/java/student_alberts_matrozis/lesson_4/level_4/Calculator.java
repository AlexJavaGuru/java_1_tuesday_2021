package student_alberts_matrozis.lesson_4.level_4;

// Task 11, 13, 14, 15

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int dif(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        }
        return secondNumber;
    }
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int[] arr = {firstNumber, secondNumber, thirdNumber};
        int maxInt = firstNumber;

        for (int number : arr) {
            if (number > maxInt) {
                maxInt = number;
            }
        }
        return maxInt;
    }
}
