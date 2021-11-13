package student_julija_kuzmicova.lesson_7.level_5;

//Task_9
class PowerCalculatorTest {

    PowerCalculator powerCalculator = new PowerCalculator();

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.numberToPowerZeroNumberPositivePowerTest();
        powerCalculatorTest.numberToPowerPositiveNumberZeroPowerTest();
        powerCalculatorTest.numberToPowerNegativeNumberZeroPowerTest();
        powerCalculatorTest.numberToPowerPositiveNumberPositivePowerTest();
        powerCalculatorTest.numberToPowerPositiveNumberNegativePowerTest();
        powerCalculatorTest.numberToPowerNegativeNumberPositivePowerTest();
        powerCalculatorTest.numberToPowerNegativeNumberNegativePowerTest();
    }

    void numberToPowerZeroNumberPositivePowerTest(){
        checkResult(0, powerCalculator.numberToPower(0, 2), "numberToPowerZeroNumberPositivePowerTest");
    }

    void numberToPowerPositiveNumberZeroPowerTest(){
        checkResult(1, powerCalculator.numberToPower(3, 0), "numberToPowerPositiveNumberZeroPowerTest");
    }

    void numberToPowerNegativeNumberZeroPowerTest(){
        checkResult(1, powerCalculator.numberToPower(-3, 0), "numberToPowerNegativeNumberZeroPowerTest");
    }

    void numberToPowerPositiveNumberPositivePowerTest(){
        checkResult(8, powerCalculator.numberToPower(2, 3), "numberToPowerPositiveNumberPositivePowerTest");
    }

    void numberToPowerPositiveNumberNegativePowerTest(){
        checkResult(0.125, powerCalculator.numberToPower(2, -3), "numberToPowerPositiveNumberNegativePowerTest");
    }

    void numberToPowerNegativeNumberPositivePowerTest(){
        checkResult(81, powerCalculator.numberToPower(-3, 4), "numberToPowerNegativeNumberPositivePowerTest");
    }

    void numberToPowerNegativeNumberNegativePowerTest(){
        checkResult(-0.015625, powerCalculator.numberToPower(-4, -3), "numberToPowerNegativeNumberPositivePowerTest");
    }

    void checkResult(double expectedResult, double actualResult, String testName){
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
