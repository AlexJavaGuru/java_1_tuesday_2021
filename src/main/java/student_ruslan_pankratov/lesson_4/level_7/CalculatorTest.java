package student_ruslan_pankratov.lesson_4.level_7;

//Task_24
class CalculatorTest {
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
        int expectedResult = 75;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        controller(result, expectedResult, "Sum");
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        controller(result, expectedResult, "Sub");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        controller(result, expectedResult, "Mul");
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        controller(result, expectedResult, "Div");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean expectedResult = true;
        boolean result = calculator.isEven(40);
        controller(result, expectedResult, "isEven");

    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean expectedResult = false;
        boolean result = calculator.isEven(41);
        controller(result, expectedResult, "isEven");
    }

    public void controller(int result, int expectedResult, String name) {
        if (result == expectedResult) {
            System.out.println(name + " test = OK");
        } else {
            System.out.println(name + " test = FAIL");
        }
    }


    public void controller(boolean result, boolean expectedResult, String name) {
        if (result == expectedResult) {
            System.out.println(name + " test = OK");
        } else {
            System.out.println(name + " test = FAIL");
        }
    }

}
