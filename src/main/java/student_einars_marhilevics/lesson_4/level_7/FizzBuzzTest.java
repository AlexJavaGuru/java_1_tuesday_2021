package student_einars_marhilevics.lesson_4.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizz();
        fizzBuzzTest.buzz();
        fizzBuzzTest.fizzBuzz();
        fizzBuzzTest.none();
    }
    void fizz() {
        int number = 6;
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test Fizz = OK");
        }
    }
    void buzz() {
        int number = 10;
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test Buzz = OK");
        }
    }
    void fizzBuzz() {
        int number = 30;
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test FizzBuzz = OK");
        }
    }
    void none() {
        int number = 29;
        String expectedResult = "" +  number;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test None = OK");
        }
    }
}
