package student_einars_marhilevics.lesson_7.level_5;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.testOne();
        powerCalculatorTest.testTwo();
        powerCalculatorTest.testThree();
    }
    void testOne() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 27;
        int result = powerCalculator.elevate(3,3);
        check(result == expectedResult, "testOne");
    }
    void testTwo() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 32;
        int result = powerCalculator.elevate(2,5);
        check(result == expectedResult, "testTwo");
    }
    void testThree() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = -125;
        int result = powerCalculator.elevate(-5,3);
        check(result == expectedResult, "testThree");
    }
    void check (boolean condition, String test) {
        if(condition) {
            System.out.println(test + " passed");
        } else {
            System.out.println(test + " failed");
        }
    }
}
