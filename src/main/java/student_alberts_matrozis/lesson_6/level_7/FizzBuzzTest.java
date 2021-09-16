package student_alberts_matrozis.lesson_6.level_7;

import student_alberts_matrozis.albertsUtils.Utils;

public class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest testRunner = new FizzBuzzTest();
        testRunner.buzzTest();
        testRunner.fizzTest();
        testRunner.fizzBuzzTest();
        testRunner.elseFizzBuzzTest();
    }

    public void fizzBuzzTest() {
        FizzBuzz subject = new FizzBuzz();
        int num = 15;
        String exceptedResult = "FizzBuzz";
        String receivedResult = subject.detect(num);
        Utils.check(exceptedResult, receivedResult);
    }

    public void fizzTest() {
        FizzBuzz subject = new FizzBuzz();
        int num = 6;
        String exceptedResult = "Fizz";
        String receivedResult = subject.detect(num);
        Utils.check(exceptedResult, receivedResult);
    }

    public void buzzTest() {
        FizzBuzz subject = new FizzBuzz();
        int num = 5;
        String exceptedResult = "Buzz";
        String receivedResult = subject.detect(num);
        Utils.check(exceptedResult, receivedResult);
    }

    public void elseFizzBuzzTest() {
        FizzBuzz subject = new FizzBuzz();
        int num = 2;
        boolean result = subject.detect(num).equals("2");
        Utils.check(true, result);
    }
}
