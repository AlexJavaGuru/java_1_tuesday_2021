package student_daniel.lesson6.level7;

import java.util.Objects;

public class FizzBuzzTest {
    //Task 32
    public static void main(String[] args) {
        FizzBuzzTest myFiBuTest = new FizzBuzzTest();
        myFiBuTest.dividedByThreeAndFive();
        myFiBuTest.dividedByThree();
        myFiBuTest.dividedByFive();
        myFiBuTest.dividedByNone();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    FizzBuzz myFiBu = new FizzBuzz();

    void dividedByThreeAndFive () {
        int detectNumber = 15;
        String expectedResult = "FizzBuzz";
        String actualResult = myFiBu.detect(detectNumber);
        check(expectedResult, actualResult, detectNumber + " >>> can be divided on 3 and 5 >>> " + actualResult);
    }

    void dividedByThree () {
        int detectNumber = 6;
        String expectedResult = "Fizz";
        String actualResult = myFiBu.detect(detectNumber);
        check(expectedResult, actualResult, detectNumber + " >>> can be divided on 3 >>> " + actualResult);
    }

    void dividedByFive() {
        int detectNumber = 10;
        String expectedResult = "Buzz";
        String actualResult = myFiBu.detect(detectNumber);
        check(expectedResult, actualResult, detectNumber + " >>> can be divided on 5 >>> " + actualResult);
    }

    void dividedByNone() {
        int detectNumber = 7;
        String expectedResult = "" + 7;
        String actualResult = myFiBu.detect(detectNumber);
        check(expectedResult, actualResult, detectNumber + " >>> can't be divided on 3 or 5");
    }

    void check(String expectedResult, String actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName);
        }
    }
}
