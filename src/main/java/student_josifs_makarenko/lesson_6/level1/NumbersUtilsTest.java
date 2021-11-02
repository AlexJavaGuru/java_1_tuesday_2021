package student_josifs_makarenko.lesson_6.level1;

public class NumbersUtilsTest {
    public static void main(String[] args) {
        NumbersUtilsTest numbersUtilsTest = new NumbersUtilsTest();
        numbersUtilsTest.isEvenTest();
    }

    public void isEvenTest() {
        NumbersUtils numbersUtils = new NumbersUtils();
        check(!numbersUtils.isEven(5), "isEvenTest");

    }

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " != OK");
        }
    }
}
