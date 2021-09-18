package student_julija_kuzmicova.lesson_4.level_7;

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }

    void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 9;
        String expectedResult = "Fizz";
        String realResult = fizzBuzz.detect(number);
        if (realResult == expectedResult) {
            System.out.println("fizzTest = OK");
        } else {
            System.out.println("fizzTest = FAIL");
        }
    }

    void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 10;
        String expectedResult = "Buzz";
        String realResult = fizzBuzz.detect(number);
        if (realResult == expectedResult) {
            System.out.println("buzzTest = OK");
        } else {
            System.out.println("buzzTest = FAIL");
        }
    }

    void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String expectedResult = "FizzBuzz";
        String realResult = fizzBuzz.detect(number);
        if (realResult == expectedResult) {
            System.out.println("fizzBuzzTest = OK");
        } else {
            System.out.println("fizzBuzzTest = FAIL");
        }
    }

    void notFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 13;
        String expectedResult = "13";
        String realResult = fizzBuzz.detect(number);
        if (realResult == expectedResult) {
            System.out.println("notFizzBuzzTest = OK");
        } else {
            System.out.println("notFizzBuzzTest = FAIL");
        }
    }
}
