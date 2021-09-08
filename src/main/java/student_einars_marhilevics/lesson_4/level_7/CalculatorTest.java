package student_einars_marhilevics.lesson_4.level_7;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.difTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
    }
    void sumTest() {
        int firstNumber = 20;
        int secondNumber = 30;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        checkTest(expectedResult, realResult, "Sum");
    }
    void difTest() {
        int firstNumber = 40;
        int secondNumber = 30;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        checkTest(expectedResult, realResult, "Dif");
    }
    void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        checkTest(expectedResult, realResult, "Div");
    }
    void mulTest() {
        int firstNumber = 3;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        checkTest(expectedResult, realResult, "Mul");
    }
    void isEvenTest() {
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        checkTest(expectedResult, realResult, "IsEven");
    }
    void checkTest (int expectedResult, int realResult, String test) {
        if (expectedResult == realResult) {
            System.out.println(test + " passed");
        } else {
            System.out.println(test + " failed");
        }
    }
    void checkTest (boolean expectedResult, boolean realResult, String test) {
        if (expectedResult == realResult) {
            System.out.println(test + " passed");
        } else {
            System.out.println(test + " failed");
        }
    }
}
