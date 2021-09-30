package student_alberts_matrozis.lesson_6.level_1;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest testRunner = new NumberUtilsTest();
        testRunner.isEvenTest1();
        testRunner.isEvenTest2();
    }

    public void isEvenTest1() {
        NumberUtils subject = new NumberUtils();
        int number = 5;
        boolean result = subject.isEven(number);
        boolean exceptedResult = false;
        check(result, exceptedResult);
    }

    public void isEvenTest2() {
        NumberUtils subject = new NumberUtils();
        int number = 12;
        boolean result = subject.isEven(number);
        boolean exceptedResult = true;
        check(result, exceptedResult);
    }

    public void check(boolean variableOne, boolean variableTwo) {
        if (variableOne == variableTwo) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }
}
