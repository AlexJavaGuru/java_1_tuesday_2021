package student_alberts_matrozis.lesson_4.level_7;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest testRunner = new CalculatorTest();
        testRunner.testCalculatorSum();
        testRunner.testCalculatorSub();
        testRunner.testCalculatorMul();
        testRunner.testCalculatorDiv();
        testRunner.testCalculatorIsEven();
    }
    public void testCalculatorSum() {
        int variableOne = 10;
        int variableTwo = 5;
        int expectedResult = 15;
        Calculator subject = new Calculator();
        int actualResult = subject.sum(variableOne, variableTwo);
        check(expectedResult, actualResult, "Test 1 Sum");
    }

    public void testCalculatorSub() {
        int variableOne = 10;
        int variableTwo = 5;
        int expectedResult = 5;
        Calculator subject = new Calculator();
        int actualResult = subject.sub(variableOne, variableTwo);
        check(expectedResult, actualResult, "Test 2 Sub");
    }
    public void testCalculatorMul() {
        int variableOne = 10;
        int variableTwo = 8;
        int exceptedResult = 80;
        Calculator subject = new Calculator();
        int actualResult = subject.mul(variableOne, variableTwo);
        check(exceptedResult, actualResult, "Test 3 Mul");
    }
    public void testCalculatorDiv() {
        int variableOne = 50;
        int variableTwo = 5;
        int exceptedResult = 10;
        Calculator subject = new Calculator();
        int actualResult = subject.div(variableOne, variableTwo);
        check(exceptedResult, actualResult, "Test 4 Div");
    }
    public void testCalculatorIsEven() {
        int variableOne = 13;
        boolean exceptedResult = false;
        Calculator subject = new Calculator();
        boolean actualResult = subject.isEven(variableOne);
        check(exceptedResult, actualResult, "Test 5 IsEven");
    }

    // Check
    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}