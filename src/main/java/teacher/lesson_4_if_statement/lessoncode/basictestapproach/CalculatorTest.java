package teacher.lesson_4_if_statement.lessoncode.basictestapproach;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest testRunner = new CalculatorTest();
        testRunner.testCalculatorSum();
        testRunner.testCalculatorDif();
        testRunner.testCalculatorIsEven();
    }

    public void testCalculatorSum() {
        int variableOne = 10;
        int variableTwo = 5;
        int expectedResult = 15;
        Calculator subject = new Calculator();
        int actualResult = subject.sum(variableOne, variableTwo);
        check(expectedResult, actualResult, "Test1 Sum");
    }

    public void testCalculatorDif() {
        int variableOne = 10;
        int variableTwo = 5;
        int expectedResult = 5;
        Calculator subject = new Calculator();
        int actualResult = subject.dif(variableOne, variableTwo);
        check(expectedResult, actualResult, "Test2 Dif");
    }

    public void testCalculatorIsEven() {
        int variable = 10;
        boolean expectedResult = true;
        Calculator subject = new Calculator();
        boolean actualResult = subject.isEven(variable);
        check(expectedResult, actualResult, "Test2 Dif");
    }

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
