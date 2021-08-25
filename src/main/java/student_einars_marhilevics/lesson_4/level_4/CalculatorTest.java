package student_einars_marhilevics.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.difTest();
        calculatorTest.multiTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTestOne();
        calculatorTest.maxOfTwoNumbersTestTwo();
        calculatorTest.maxOfTwoNumbersTestThree();
        calculatorTest.maxOfThreeNumbersTestOne();
        calculatorTest.maxOfThreeNumbersTestTwo();
        calculatorTest.maxOfThreeNumbersTestThree();
        calculatorTest.maxOfThreeNumbersTestFour();
        calculatorTest.maxOfThreeNumbersTestFive();
        calculatorTest.maxOfThreeNumbersTestSix();
        calculatorTest.maxOfThreeNumbersTestSeven();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void difTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.dif(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Dif test = OK");
        } else {
            System.out.println("Dif test = FAIL");
        }
    }
    public void multiTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multi(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multi test = OK");
        } else {
            System.out.println("Multi test = FAIL");
        }
    }
    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }
    public void isEvenTest() {
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }
    public void maxOfTwoNumbersTestOne() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersOne test = OK");
        } else {
            System.out.println("maxOfTwoNumbersOne test = FAIL");
        }
    }
    public void maxOfTwoNumbersTestTwo() {
        int firstNumber = 10;
        int secondNumber = 20;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTwo test = OK");
        } else {
            System.out.println("maxOfTwoNumbersTwo test = FAIL");
        }
    }
    public void maxOfTwoNumbersTestThree() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersThree test = OK");
        } else {
            System.out.println("maxOfTwoNumbersThree test = FAIL");
        }
    }
    public void maxOfThreeNumbersTestOne() {
        int firstNumber = 10;
        int secondNumber = 8;
        int thirdNumber = 6;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersOne test = OK");
        } else {
            System.out.println("maxOfThreeNumbersOne test = FAIL");
        }
    }
    public void maxOfThreeNumbersTestTwo() {
        int firstNumber = 8;
        int secondNumber = 10;
        int thirdNumber = 6;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersTwo test = OK");
        } else {
            System.out.println("maxOfThreeNumbersTwo test = FAIL");
        }
    }
    public void maxOfThreeNumbersTestThree() {
        int firstNumber = 6;
        int secondNumber = 8;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersThree test = OK");
        } else {
            System.out.println("maxOfThreeNumbersThree test = FAIL");
        }
    }
    public void maxOfThreeNumbersTestFour() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 8;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersFour test = OK");
        } else {
            System.out.println("maxOfThreeNumbersFour test = FAIL");
        }
    }
    public void maxOfThreeNumbersTestFive() {
        int firstNumber = 8;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersFive test = OK");
        } else {
            System.out.println("maxOfThreeNumbersFive test = FAIL");
        }
    }
    public void maxOfThreeNumbersTestSix() {
        int firstNumber = 10;
        int secondNumber = 8;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersSix test = OK");
        } else {
            System.out.println("maxOfThreeNumbersSix test = FAIL");
        }
    }
    public void maxOfThreeNumbersTestSeven() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersSeven test = OK");
        } else {
            System.out.println("maxOfThreeNumbersSeven test = FAIL");
        }
    }
}
