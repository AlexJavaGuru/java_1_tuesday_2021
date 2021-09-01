package student_josifs_makarenko.lesson_4.level4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.difTest();
        calculatorTest.multiTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();
        calculatorTest.maxOfThreeNumbersTest8();
        calculatorTest.maxOfThreeNumbersTest9();

}

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        check(expectedResult, realResult, "Sum");
    }

    public void difTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.dif(firstNumber, secondNumber);
        check(expectedResult, realResult, "Dif");
    }

    public void multiTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        check(expectedResult, realResult, "Multiplication");
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        double realResult = calculator.division(firstNumber, secondNumber);
        check(expectedResult, realResult, "Division");
    }

    public void isEvenTest() {
        int number = 2;
        Calculator calculator = new Calculator();
        boolean expectedResult = true;
        boolean realResult = calculator.isEven(number);
        check(expectedResult, realResult, "isEven" );
    }

    public void maxOfTwoNumbersTest(){
        int firstNumber = 3;
        int secondNumber = 1;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        check(expectedResult, calculator.maxOfTwoNumbers(firstNumber, secondNumber), "maxOfTwoNumbersTest");
    }

    public void maxOfThreeNumbersTest1(){
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 1;
        int expectedResult = 1;
        Calculator calculator = new Calculator();
        check(expectedResult, calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber), "maxOfThreeNumber");
    }

    public void maxOfThreeNumbersTest2(){
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 1;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        check(expectedResult, calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber), "maxOfThreeNumber");
    }

    public void maxOfThreeNumbersTest3(){
        int firstNumber = 3;
        int secondNumber = 5;
        int thirdNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        check(expectedResult, calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber), "maxOfThreeNumber");
    }

    public void maxOfThreeNumbersTest4(){
        int firstNumber = 11;
        int secondNumber = 11;
        int thirdNumber = 3;
        int expectedResult = 11;
        Calculator calculator = new Calculator();
        check(expectedResult, calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber), "maxOfThreeNumber");
    }

    public void maxOfThreeNumbersTest5(){
        int firstNumber = 9;
        int secondNumber = 5;
        int thirdNumber = 9;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        check(expectedResult, calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber), "maxOfThreeNumber");
    }

    public void maxOfThreeNumbersTest6(){
        int firstNumber = 7;
        int secondNumber = 5;
        int thirdNumber = 5;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        check(expectedResult, calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber), "maxOfThreeNumber");
    }

    public void maxOfThreeNumbersTest7(){
        int firstNumber = 7;
        int secondNumber = 9;
        int thirdNumber = 9;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        check(expectedResult, calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber), "maxOfThreeNumber");
    }

    public void maxOfThreeNumbersTest8(){
        int firstNumber = 7;
        int secondNumber = 5;
        int thirdNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        check(expectedResult, calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber), "maxOfThreeNumber");
    }

    public void maxOfThreeNumbersTest9() {
        int firstNumber = 7;
        int secondNumber = 5;
        int thirdNumber = 9;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        check(expectedResult, calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber), "maxOfThreeNumber");
    }

    public void check(double expectedResult, double realResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void check(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + "Test != OK");
            System.out.println("Expected: " + expectedResult + " but actual: " + realResult);
        }
    }

        public void check(int expectedResult, int realResult, String testName) {
            if (realResult == expectedResult) {
                System.out.println(testName + " test = OK");
            } else {
                System.out.println(testName + " test = FAIL");
            }
        }
}