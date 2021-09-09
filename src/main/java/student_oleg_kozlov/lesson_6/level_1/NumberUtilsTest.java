package student_oleg_kozlov.lesson_6.level_1;

import student_oleg_kozlov.lesson_5.level_5.ArrayUtil;

// Task_6
class NumberUtilsTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static NumberUtils numberUtils = new NumberUtils();

    public static void main(String[] args) {
        isEvenTestForEvenNumber();
        isEvenTestForOddNumber();
        printFooter();
    }

    private static void isEvenTestForEvenNumber() {
        totalRun++;
        checkResult(true, numberUtils.isEven(4), "isEvenTestForEvenNumber");
    }

    private static void isEvenTestForOddNumber() {
        totalRun++;
        checkResult(false, numberUtils.isEven(5), "isEvenTestForOddNumber");
    }

    private static void checkResult(Boolean expectedResult, Boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(TEXT_GREEN + testName + " - test passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testName + " - test failed");
            System.out.println("Expected: " + expectedResult);
            System.out.println("Actual:   " + actualResult + TEXT_RESET);
            totalFailed++;
        }
    }

    private static void printFooter() {
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
