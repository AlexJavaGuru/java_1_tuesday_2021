package student_ruslan_pankratov.lesson_4.level_4;

//Task_12
//Task_13
//Task_14
//Task_15
class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.divisionTest();
        calculatorTest.minusTest();
        calculatorTest.multiplicationTest();
        calculatorTest.isEvenTest();

        calculatorTest.maxOfTwoNumbersTest_1();
        calculatorTest.maxOfTwoNumbersTest_2();
        calculatorTest.maxOfTwoNumbersTest_3();

        calculatorTest.maxOfThreeNumbersTest();
        calculatorTest.maxOfThreeNumbersTest_2();
        calculatorTest.maxOfThreeNumbersTest_3();
        calculatorTest.maxOfThreeNumbersTest_4();
        calculatorTest.maxOfThreeNumbersTest_5();
        calculatorTest.maxOfThreeNumbersTest_6();
        calculatorTest.maxOfThreeNumbersTest_7();
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

    public void divisionTest() {
        int firstNumber = 100;
        int secondNumber = 10;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }

    }

    public void minusTest() {
        int firstNumber = 1000;
        int secondNumber = 900;
        int expectedResult = 100;

        Calculator calculator = new Calculator();
        int realResult = calculator.minus(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Minus test = OK");
        } else {
            System.out.println("Minus test = FAIL");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 90;
        int expectedResult = 900;

        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 10;
        boolean expectedResult = true;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (expectedResult == realResult) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }

    }

    public void maxOfTwoNumbersTest_1() {
        int firstNumber = 100;
        int secondNumber = 110;
        int expectedResult = 110;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (expectedResult == realResult) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest_2() {
        int firstNumber = 150;
        int secondNumber = 110;
        int expectedResult = 150;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (expectedResult == realResult) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }


    public void maxOfTwoNumbersTest_3() {
        int firstNumber = 150;
        int secondNumber = 150;
        int expectedResult = 150;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (expectedResult == realResult) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest() {
        int firstNumber = 150;
        int secondNumber = 110;
        int threeNumber = 100;
        int expectedResult = 150;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);

        if (expectedResult == realResult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }


    }

    public void maxOfThreeNumbersTest_2() {
        int firstNumber = 100;
        int secondNumber = 110;
        int threeNumber = 100;
        int expectedResult = 110;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);

        if (expectedResult == realResult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }


    }

    public void maxOfThreeNumbersTest_3() {
        int firstNumber = 150;
        int secondNumber = 110;
        int threeNumber = 160;
        int expectedResult = 160;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);

        if (expectedResult == realResult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }


    }

    public void maxOfThreeNumbersTest_4() {
        int firstNumber = 150;
        int secondNumber = 150;
        int threeNumber = 100;
        int expectedResult = 150;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);

        if (expectedResult == realResult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }


    }

    public void maxOfThreeNumbersTest_5() {
        int firstNumber = 100;
        int secondNumber = 150;
        int threeNumber = 150;
        int expectedResult = 150;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);

        if (expectedResult == realResult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }


    }

    public void maxOfThreeNumbersTest_6() {
        int firstNumber = 150;
        int secondNumber = 110;
        int threeNumber = 150;
        int expectedResult = 150;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);

        if (expectedResult == realResult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }


    }

    public void maxOfThreeNumbersTest_7() {
        int firstNumber = 150;
        int secondNumber = 150;
        int threeNumber = 150;
        int expectedResult = 150;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);

        if (expectedResult == realResult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }


    }


}