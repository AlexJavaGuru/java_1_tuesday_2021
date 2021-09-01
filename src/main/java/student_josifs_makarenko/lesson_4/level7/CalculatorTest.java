package student_josifs_makarenko.lesson_4.level7;

public class CalculatorTest {
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
            int expectedResult = 75;
            int realResult = calculator.sum(firstNumber, secondNumber);
            check(expectedResult, realResult, "sumTest");
        }

        public void subTest() {
            int firstNumber = 35;
            int secondNumber = 15;
            Calculator calculator = new Calculator();
            int expectedResult = 20;
            int realResult = calculator.sub(firstNumber, secondNumber);
            check(expectedResult, realResult, "subTest");
        }

        public void mulTest() {
            int firstNumber = 5;
            int secondNumber = 5;
            Calculator calculator = new Calculator();
            int expectedResult = 25;
            int realResult = calculator.mul(firstNumber, secondNumber);
           check(expectedResult, realResult, "mulTest");
        }

        public void divTest() {
            int firstNumber = 40;
            int secondNumber = 8;
            Calculator calculator = new Calculator();
            int expectedResult = 5;
            int realResult = calculator.div(firstNumber, secondNumber);
            check(expectedResult, realResult, "divTest");
        }

        public void isEvenTest1() {
            Calculator calculator = new Calculator();
            boolean expectedResult = true;
            boolean realResult = calculator.isEven(40);
            check(expectedResult, realResult, "isEvenTest1");
        }

        public void isEvenTest2() {
            Calculator calculator = new Calculator();
            boolean expectedResult = false;
            boolean realResult = calculator.isEven(41);
            check(expectedResult, realResult, "isEvenTest2");
        }

    public void check(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " Test = OK");
        } else {
            System.out.println(testName + " Test != OK");
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
