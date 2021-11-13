package student_josifs_makarenko.lesson_6.level7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        ifFizzBuzzTest();
        ifBuzzTest();
        ifFizzTest();
        ifNumberTest();
    }

    static void ifFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        check(fizzBuzz.detect(number).equals("FizzBuzz"), "FizzBuzzTest");
    }

    static void ifFizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 9;
        check(fizzBuzz.detect(number).equals("Fizz"), "FizzTest");
    }

    static void ifBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 10;
        check(fizzBuzz.detect(number).equals("Buzz"), "BuzzTest");
    }

    static void ifNumberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 4;
        check(fizzBuzz.detect(number).equals("" + number), "NumberTest");
    }

    public static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER! ");
        }
    }
}
