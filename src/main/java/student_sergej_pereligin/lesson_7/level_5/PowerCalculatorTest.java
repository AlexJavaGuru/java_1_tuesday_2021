package student_sergej_pereligin.lesson_7.level_5;


public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.numToPowTest();
    }

    public void numToPowTest(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int actualResult = powerCalculator.numToPow(5,3);
        int expectedResult = 9;
        checkResults(true, "numToPowTest");



    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
