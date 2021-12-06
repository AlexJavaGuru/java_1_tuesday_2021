package student_sergej_pereligin.lesson_6.level_1;

public class NumberUtilDemo {
    public static void main(String[] args) {
        NumberUtilDemo numberUtilsTest = new NumberUtilDemo();
        numberUtilsTest.isEvenTest();

    }

    void isEvenTest() {
        NumberUtil numberUtils = new NumberUtil();
        boolean result = numberUtils.isEven(4);
        checkRecults(result, "isEvenTest");
    }

    void checkRecults(boolean condition, String testName) {
        if (condition) {
            System.out.println("Test " + testName + " passed!");
        } else {
            System.out.println("Test " + testName + "  failed!");
        }
    }
}
