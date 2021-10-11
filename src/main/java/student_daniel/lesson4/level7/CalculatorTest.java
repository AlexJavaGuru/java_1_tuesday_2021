package student_daniel.lesson4.level7;

public class CalculatorTest {
    //Task 24
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        int expectedResult = 75;
        check(expectedResult, result, "sumTest - " );
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        int expectedResult = 20;
        check(expectedResult, result, "subTest - " );
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        int expectedResult = 25;
        check(expectedResult, result, "mulTest - " );
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        int expectedResult = 5;
        check(expectedResult, result, "divTest - " );
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(40);
        boolean expectedResult = true;
        check(expectedResult, result, "isEvenTest1 - " );
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(41);
        boolean expectedResult = false;
        check(expectedResult, result, "isEvenTest2 - " );
    }

    void check(int expectedResult, int realResult, String testName) {
        if(expectedResult == realResult) {
            System.out.println(testName + "Test PASSED");
        } else {
            System.out.println(testName + "Test FAILED");
        }
    }

    void check(boolean expectedResult, boolean realResult, String testName) {
        if(expectedResult == realResult) {
            System.out.println(testName + "Test PASSED");
        } else {
            System.out.println(testName + "Test FAILED");
        }
    }
}
