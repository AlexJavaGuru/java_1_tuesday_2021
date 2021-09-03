package student_josifs_makarenko.lesson_4.level7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fuzzBuzzTest = new FizzBuzzTest();
        fuzzBuzzTest.detectTest1();
        fuzzBuzzTest.detectTest2();
        fuzzBuzzTest.detectTest3();
        fuzzBuzzTest.detectTest4();
    }

    public void detectTest1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;
        String expectedResult = "Fizz";
        String realResult = fizzBuzz.detect(number);
        check(expectedResult, realResult, "DetectTest");
    }

    public void detectTest2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;
        String expectedResult = "Buzz";
        String realResult = fizzBuzz.detect(number);
        check(expectedResult, realResult, "DetectTest");
    }

    public void detectTest3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String expectedResult = "FizzBuzz";
        String realResult = fizzBuzz.detect(number);
        check(expectedResult, realResult, "DetectTest");
    }

    public void detectTest4(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(4).equals("4"), "DetectTest");
    }

    public void check (String expectedResult, String realResult, String testName) {
        if (expectedResult == realResult)  {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " != OK");
        }
    }

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " != OK");
        }
    }
}
