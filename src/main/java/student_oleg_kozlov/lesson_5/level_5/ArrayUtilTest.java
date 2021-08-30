package student_oleg_kozlov.lesson_5.level_5;

// Task_32, Task_36, Task_38
class ArrayUtilTest {
    // Define color constants
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private int totalRun = 0;
    private int totalPassed = 0;
    private int totalFailed = 0;

    private ArrayUtil arrayUtil = new ArrayUtil();

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.printFooter();
    }

    private void shouldCreateArray() {
        totalRun++;
        checkResult(5, (arrayUtil.createArray(5)).length, "shouldCreateArray test");
    }

    private void shouldFindMaxNumber() {
        totalRun++;
        int[] inputArray = {1, 20, 6, 45, -45};
        checkResult(45,  arrayUtil.findMaxNumber(inputArray),"shouldFindMaxNumber test");
    }

    private void shouldFindMinNumber() {
        totalRun++;
        int[] inputArray = {1, 20, 6, 45, -45};
        checkResult(-45, arrayUtil.findMinNumber(inputArray),"shouldFindMinNumber test");
    }

    private void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(TEXT_GREEN + testName + " passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testName + " failed");
            System.out.println("Expected: " + expectedResult);
            System.out.println("Actual:   " + actualResult + TEXT_RESET);
            totalFailed++;
        }
    }

    private void printFooter() {
        System.out.println("********************************************");
        if (totalFailed > 0) {
            System.out.println(TEXT_RED + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        } else {
            System.out.println(TEXT_GREEN + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        }
        System.out.println("********************************************");
    }
}
