package student_julija_kuzmicova.lesson_4.level_4;

//Task_12, Task_13, Task_14, Task_15

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTestFirst();
        calculatorTest.maxOfTwoNumbersTestSecond();
        calculatorTest.maxOfTwoNumbersTestThird();
        calculatorTest.maxOfThreeNumbersTestFirst();
        calculatorTest.maxOfThreeNumbersTestSecond();
        calculatorTest.maxOfThreeNumbersTestThird();
        calculatorTest.maxOfThreeNumbersTestFirstSecondEqual();
        calculatorTest.maxOfThreeNumbersTestSecondThirdEqual();
        calculatorTest.maxOfThreeNumbersTestFirstThirdEqual();
        calculatorTest.maxOfThreeNumbersTestAllEqual();
    }

    public void sumTest() {
        int firstNumber = 8;
        int secondNumber = 2;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 8;
        int secondNumber = 2;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 8;
        int secondNumber = 2;
        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 8;
        int secondNumber = 2;
        int expectedResult = 16;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 16;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersTestFirst() {
        int firstNumber = 5;
        int secondNumber = 2;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test: first number is greater = OK");
        } else {
            System.out.println("maxOfTwoNumbers test: first number is greater = FAIL");
        }
    }

    public void maxOfTwoNumbersTestSecond() {
        int firstNumber = 5;
        int secondNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test: second number is greater = OK");
        } else {
            System.out.println("maxOfTwoNumbers test: second number is greater = FAIL");
        }
    }

    public void maxOfTwoNumbersTestThird() {
        int firstNumber = 7;
        int secondNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test: numbers are equal = OK");
        } else {
            System.out.println("maxOfTwoNumbers test: numbers are equal = FAIL");
        }
    }

    public void maxOfThreeNumbersTestFirst() {
        int firstNumber = 6;
        int secondNumber = 3;
        int thirdNumber = 1;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test: first number is greater = OK");
        } else {
            System.out.println("maxOfThreeNumbers test: first number is greater = FAIL");
        }
    }

    public void maxOfThreeNumbersTestSecond() {
        int firstNumber = 2;
        int secondNumber = 5;
        int thirdNumber = 4;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test: second number is greater = OK");
        } else {
            System.out.println("maxOfThreeNumbers test: second number is greater = FAIL");
        }
    }

    public void maxOfThreeNumbersTestThird() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 4;
        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test: third number is greater = OK");
        } else {
            System.out.println("maxOfThreeNumbers test: third number is greater = FAIL");
        }
    }

    public void maxOfThreeNumbersTestFirstSecondEqual() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 3;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test: first and second numbers are equal and greater than third = OK");
        } else {
            System.out.println("maxOfThreeNumbers test: first and second numbers are equal and greater than third = FAIL");
        }
    }

    public void maxOfThreeNumbersTestSecondThirdEqual() {
        int firstNumber = 4;
        int secondNumber = 7;
        int thirdNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test: second and third numbers are equal and greater than first = OK");
        } else {
            System.out.println("maxOfThreeNumbers test: second and third numbers are equal and greater than first = FAIL");
        }
    }

    public void maxOfThreeNumbersTestFirstThirdEqual() {
        int firstNumber = 8;
        int secondNumber = 2;
        int thirdNumber = 8;
        int expectedResult = 8;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test: first and third numbers are equal and greater than second = OK");
        } else {
            System.out.println("maxOfThreeNumbers test: first and third numbers are equal and greater than second = FAIL");
        }
    }

    public void maxOfThreeNumbersTestAllEqual() {
        int firstNumber = 7;
        int secondNumber = 7;
        int thirdNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test: all numbers are equal = OK");
        } else {
            System.out.println("maxOfThreeNumbers test: all numbers are equal = FAIL");
        }
    }
}
