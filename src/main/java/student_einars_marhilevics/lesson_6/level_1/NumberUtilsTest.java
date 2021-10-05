package student_einars_marhilevics.lesson_6.level_1;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.TestIsEven();
        numberUtilsTest.TestIsOdd();
    }
    void TestIsEven() {
        NumberUtils numberUtils = new NumberUtils();
        int number = 2;
        boolean expectedResult = true;
        boolean realResult = numberUtils.isEven(2);
        check(expectedResult, realResult, "Test EVEN");
    }
    void TestIsOdd() {
        NumberUtils numberUtils = new NumberUtils();
        int number = 3;
        boolean expectedResult = false;
        boolean realResult = numberUtils.isEven(3);
        check(expectedResult, realResult, "Test ODD");
    }
    void check(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
