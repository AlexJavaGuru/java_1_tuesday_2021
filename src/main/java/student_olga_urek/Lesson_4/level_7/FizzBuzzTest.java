package student_olga_urek.Lesson_4.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzyTest = new FizzBuzzTest();
        fizzyTest.fizzTest();
        fizzyTest.buzzTest();
        fizzyTest.fizzBuzzTest();
        fizzyTest.neitherTest();
    }
    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 6;
        String expectedResult = "Fizz";
        String realResult = fizzBuzz.fizzify(number);
        if (realResult == expectedResult) {
            System.out.println("fizzTest = OK");
        } else {
            System.out.println("fizzTest = FAIL");
        }
    }
    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 10;
        String expectedResult = "Buzz";
        String realResult = fizzBuzz.fizzify(number);
        if (realResult == expectedResult) {
            System.out.println("buzzTest = OK");
        } else {
            System.out.println("buzzTest = FAIL");
        }
    }
    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String expectedResult = "FizzBuzz";
        String realResult = fizzBuzz.fizzify(number);
        if (realResult == expectedResult) {
            System.out.println("fizzBuzzTest = OK");
        } else {
            System.out.println("fizzBuzzTest = FAIL");
        }
    } //тест проваливается, и я не понимаю, почему. Код работает.
    public void neitherTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 8;
        String expectedResult = "8";
        String realResult = fizzBuzz.fizzify(number);
        if (realResult == expectedResult) {
            System.out.println("neitherTest = OK");
        } else {
            System.out.println("neitherTest = FAIL");
        }
    }
}
