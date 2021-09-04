package student_olga_urek.Lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTestFirst();
        calculatorTest.maxOfTwoNumbersTestSecond();
        calculatorTest.maxOfTwoNumbersTestEqual();
        calculatorTest.maxOfThreeNumbersTestFirst();
        calculatorTest.maxOfThreeNumbersTestSecond();
        calculatorTest.maxOfThreeNumbersTestThird();
        calculatorTest.maxOfThreeNumbersTestTwoFirstEqual();
        calculatorTest.maxOfThreeNumbersTestTwoLastEqual();
        calculatorTest.maxOfThreeNumbersTestFirstLastEqual();
        calculatorTest.maxOfThreeNumbersTestAllEqual();
    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 7;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }
    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }
    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }
    public void isEvenTest() {
        int number = 11;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }
    public void maxOfTwoNumbersTestFirst() {
        int firstNumber = 11;
        int secondNumber = 5;
        int expectedResult = 11;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test -first number is larger- = OK");
        } else {
            System.out.println("maxOfTwoNumbers test -first number is larger- = FAIL");
        }
    }
    public void maxOfTwoNumbersTestSecond() {
        int firstNumber = 5;
        int secondNumber = 11;
        int expectedResult = 11;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test -second number is larger- = OK");
        } else {
            System.out.println("maxOfTwoNumbers test -second number is larger- = FAIL");
        }
    }
    public void maxOfTwoNumbersTestEqual() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test -both are equal- = OK");
        } else {
            System.out.println("maxOfTwoNumbers test -both are equal- = FAIL");
        }
    }
    public void maxOfThreeNumbersTestFirst() {
        int firstNumber = 10;
        int secondNumber = 8;
        int thirdNumber = 6;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test -first number is larger- = OK");
        } else {
            System.out.println("maxOfThreeNumbers test -first number is larger- = FAIL");
        }
    }
    public void maxOfThreeNumbersTestSecond() {
        int firstNumber = 10;
        int secondNumber = 18;
        int thirdNumber = 6;
        int expectedResult = 18;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test -second number is larger- = OK");
        } else {
            System.out.println("maxOfThreeNumbers test -second number is larger- = FAIL");
        }
    }
    public void maxOfThreeNumbersTestThird() {
        int firstNumber = 10;
        int secondNumber = 8;
        int thirdNumber = 26;
        int expectedResult = 26;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test -third number is larger- = OK");
        } else {
            System.out.println("maxOfThreeNumbers test -third number is larger- = FAIL");
        }
    }
    public void maxOfThreeNumbersTestTwoFirstEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 6;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test -two first numbers are equal and larger- = OK");
        } else {
            System.out.println("maxOfThreeNumbers test -two first numbers are equal and larger- = FAIL");
        }
    }
    public void maxOfThreeNumbersTestTwoLastEqual() {
        int firstNumber = 6;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test -two last numbers are equal and larger- = OK");
        } else {
            System.out.println("maxOfThreeNumbers test -two last numbers are equal and larger- = FAIL");
        }
    }
    public void maxOfThreeNumbersTestFirstLastEqual() {
        int firstNumber = 10;
        int secondNumber = 6;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test -first and third numbers are equal and larger- = OK");
        } else {
            System.out.println("maxOfThreeNumbers test -first and third numbers are equal and larger- = FAIL");
        }
    }
    public void maxOfThreeNumbersTestAllEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test -all numbers are equal- = OK");
        } else {
            System.out.println("maxOfThreeNumbers test -all numbers are equal- = FAIL");
        }
    }
}

