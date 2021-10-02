package student_einars_marhilevics.lesson_6.level_7;


class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizz();
        fizzBuzzTest.buzz();
        fizzBuzzTest.fizzBuzz();
        fizzBuzzTest.none();
    }

    void fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(6);
        check(realResult.equals("Fizz"), "Fizz");
    }

    void buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(10);
        check(realResult.equals("Buzz"), "Buzz");
    }

    void fizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        check(realResult.equals("FizzBuzz"), "FizzBuzz");
    }

    void none() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(29);
        check(realResult.equals("" + 29), "none");


    }

    void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " failed");
        }
    }
}

