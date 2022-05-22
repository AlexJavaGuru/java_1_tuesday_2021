package student_daniel.lesson7.level5;

import java.util.Objects;

public class PowerCalculatorTest {
    //Task 9
    public static void main(String[] args) {
        PowerCalculatorTest myTest = new PowerCalculatorTest();
        myTest.powerCalcTest();
        myTest.powerCalcTest2();
        myTest.powerCalcTest3();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    PowerCalculator myPowerCalculator = new PowerCalculator();

    void powerCalcTest() {
        int value = 3;
        int multiplyRate = 3;
        int expectedResult = 27;
        int actualResult = myPowerCalculator.powerCalculation(value, multiplyRate);
        check(expectedResult, actualResult, "Result: " + actualResult);
    }

    void powerCalcTest2() {
        int value = 8;
        int multiplyRate = 2;
        int expectedResult = 64;
        int actualResult = myPowerCalculator.powerCalculation(value, multiplyRate);
        check(expectedResult, actualResult, "Result: " + actualResult);
    }

    void powerCalcTest3() {
        int value = 2;
        int multiplyRate = 3;
        int expectedResult = 8;
        int actualResult = myPowerCalculator.powerCalculation(value, multiplyRate);
        check(expectedResult, actualResult, "Result: " + actualResult);
    }

    void check(int expectedResult, int actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName);
        }
    }
}