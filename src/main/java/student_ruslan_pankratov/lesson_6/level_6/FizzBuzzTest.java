package student_ruslan_pankratov.lesson_6.level_6;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.initialNumberTestOne();
        fizzBuzzTest.initialNumberTestTwo();
        fizzBuzzTest.initialNumberTestThree();
        fizzBuzzTest.initialNumberTestFour();

    }

    void initialNumberTestOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(15);
        String expectedResult = "FizzBuzz";

        methodTest(result, expectedResult, "initialNumberTestOne");

    }
    void initialNumberTestTwo() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(9);
        String expectedResult = "Fizz";

        methodTest(result, expectedResult, "initialNumberTestTwo");

    }
    void initialNumberTestThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(5);
        String expectedResult = "Buzz";

        methodTest(result, expectedResult, "initialNumberTestThree");

    }
    void initialNumberTestFour() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(2);
        String expectedResult = "2";

        methodTest(result, expectedResult, "initialNumberTestFour");

    }

    static void methodTest(String result, String expectedResult, String name) {
        if (result.equalsIgnoreCase(expectedResult)) {
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIL");
        }
    }

}
