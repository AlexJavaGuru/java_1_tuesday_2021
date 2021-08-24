package student_ruslan_pankratov.lesson_4.level_7;

//Task_22
class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.detect();
        fizzBuzzTest.detectOne();
        fizzBuzzTest.detectTwo();
        fizzBuzzTest.detectThree();
    }

    public void detect() {
        int number = 9;
        String expectedResult = "Fizz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);
        if (actualResult.equals(expectedResult)) {
            System.out.println("FizzBuzz Test = OK");
        } else {
            System.out.println("FizzBuzz Test = FAIL");
        }

    }

    public void detectOne() {
        int number = 10;
        String expectedResult = "Buzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);
        if (actualResult.equals(expectedResult)) {
            System.out.println("FizzBuzz Test = OK");
        } else {
            System.out.println("FizzBuzz Test = FAIL");
        }

    }

    public void detectTwo() {
        int number = 15;
        String expectedResult = "FizzBuzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);
        if (actualResult.equals(expectedResult)) {
            System.out.println("FizzBuzz Test = OK");
        } else {
            System.out.println("FizzBuzz Test = FAIL");
        }

    }

    public void detectThree() {
        int number = 2;
        String expectedResult = "2";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);
        if (actualResult.equals(expectedResult)) {
            System.out.println("FizzBuzz Test = OK");
        } else {
            System.out.println("FizzBuzz Test = FAIL");
        }

    }

}
