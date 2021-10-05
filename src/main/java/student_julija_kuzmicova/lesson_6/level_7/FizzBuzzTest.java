package student_julija_kuzmicova.lesson_6.level_7;

//Task_32
class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.detectFizzTest();
        fizzBuzzTest.detectBuzzTest();
        fizzBuzzTest.detectFizzBuzzTest();
        fizzBuzzTest.detectNotFizzBuzzTest();
    }

    void detectFizzTest() {
        checkResult("Fizz", fizzBuzz.detect(6), "detectFizzTest");
    }

    void detectBuzzTest() {
        checkResult("Buzz", fizzBuzz.detect(10), "detectBuzzTest");
    }

    void detectFizzBuzzTest() {
        checkResult("FizzBuzz", fizzBuzz.detect(15), "detectFizzBuzzTest");
    }

    void detectNotFizzBuzzTest() {
        checkResult("7", fizzBuzz.detect(7), "detectNotFizzBuzzTest");
    }

    void checkResult(String expectedResult, String actualResult, String testName){
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
