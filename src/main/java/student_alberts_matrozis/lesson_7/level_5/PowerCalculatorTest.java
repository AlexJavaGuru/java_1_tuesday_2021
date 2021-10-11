package student_alberts_matrozis.lesson_7.level_5;

import static student_alberts_matrozis.albertsUtils.Utils.*;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest testRunner = new PowerCalculatorTest();
        testRunner.zeroPowerTest();
        testRunner.positivePowerTest();
        testRunner.negativePowerTest();
    }

    public void zeroPowerTest() {
        int num = 2;
        int power = 0;
        PowerCalculator subject = new PowerCalculator();
        double receivedResult = subject.powerCalculator(num, power);
        System.out.println(receivedResult);
        check(1, receivedResult);
    }

    public void positivePowerTest() {
        int num = 2;
        int power = 2;
        PowerCalculator subject = new PowerCalculator();
        double receivedResult = subject.powerCalculator(num, power);
        System.out.println(receivedResult);
        check(4, receivedResult);
    }

    public void negativePowerTest() {
        int num = 2;
        int power = -3;
        PowerCalculator subject = new PowerCalculator();
        double receivedResult = subject.powerCalculator(num, power);
        System.out.println(receivedResult);
        check(0.125, receivedResult);
    }
}
