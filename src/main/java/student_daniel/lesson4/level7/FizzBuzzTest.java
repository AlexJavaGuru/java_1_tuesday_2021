package student_daniel.lesson4.level7;

class FizzBuzzTest {
    //Task 22
    public static void main(String[] args) {
        FizzBuzzTest myTest = new FizzBuzzTest();
        myTest.detectTest1();
        myTest.detectTest2();
        myTest.detectTest3();
        myTest.detectTest4();
    }

    void detectTest1() {
        FizzBuzz myFizz = new FizzBuzz();
        int number = 3;
        String expectedResult = "Fizz";
        String realResult = myFizz.detect(number);
        check(expectedResult, realResult, "Fizz (3) ");
    }

    void detectTest2() {
        FizzBuzz myFizz = new FizzBuzz();
        int number = 5;
        String expectedResult = "Buzz";
        String realResult = myFizz.detect(number);
        check(expectedResult, realResult, "Buzz (5) ");
    }

    void detectTest3() {
        FizzBuzz myFizz = new FizzBuzz();
        int number = 15;
        String expectedResult = "FizzBuzz";
        String realResult = myFizz.detect(number);
        check(expectedResult, realResult, "FizzBuzz (15) ");
    }

    void detectTest4() {
        FizzBuzz myFizz = new FizzBuzz();
        int number = 11;
        String expectedResult = "Number '" + number + "' cannot be divided on 3 or 5";
        String realResult = myFizz.detect(number);
        check(expectedResult, realResult, "Can't be divided on 3 or 5 (1) ");
    }

    void check(String expectedResult, String realResult, String testName) {
        if(expectedResult == realResult) {
            System.out.println(testName + "Test PASSED");
        } else if (expectedResult.equals(realResult)) {
            System.out.println(testName + "Test PASSED");
        } else {
            System.out.println(testName + "Test FAILED");
        }
        System.out.println();
    }
}
