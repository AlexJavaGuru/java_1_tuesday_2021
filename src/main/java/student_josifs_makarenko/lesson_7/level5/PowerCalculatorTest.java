package student_josifs_makarenko.lesson_7.level5;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        powerCalculatorTest();
    }
    static void powerCalculatorTest() {
        PowerCalculator powerCalculator = new PowerCalculator();
        check(powerCalculator.exponentiation(7, 7) == 823543, "PowerCalculatorTest");
    }

    public static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER! ");
        }
    }
}
