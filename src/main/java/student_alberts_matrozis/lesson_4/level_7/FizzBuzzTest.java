package student_alberts_matrozis.lesson_4.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.testFizzBuzz();
    }
    public void testFizzBuzz() {
        int variableOne = 3;
        int variableTwo = 5;
        int variableThree = 15;
        int variableFour = 1;
        FizzBuzz subject = new FizzBuzz();
        checkResults(subject.detect(variableOne).equals("Fizz"), "Test 1");
        checkResults(subject.detect(variableTwo).equals("Buzz"), "Test 2");
        checkResults(subject.detect(variableThree).equals("FizzBuzz"), "Test 3");
        checkResults(subject.detect(variableFour).equals("1"), "Test 4"); // Он выводит правильно, но почему то считает это ошибкой.

    }

    // Позаимствовал саму проверку после одной своей ошибки
    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
