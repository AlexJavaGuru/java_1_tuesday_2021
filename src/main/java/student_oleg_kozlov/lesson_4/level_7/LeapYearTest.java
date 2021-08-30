package student_oleg_kozlov.lesson_4.level_7;

// Task_23
class LeapYearTest {

    // Define color constants
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";
    private static final String TEXT_YELLOW = "\u001B[33m";

    private int totalRun = 0;
    private int totalPassed = 0;
    private int totalFailed = 0;

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest(); // Create an instance as static method can't run non-static methods
        leapYearTest.isLeapYearTest();
        leapYearTest.printFooter(); // Print totals
    }

    private void isLeapYearTest() {
        boolean realResult;

        // Prepare data for testing
        int[] inputNumber = {2, 80, 400, 500};
        boolean[] expectedResult = {false, true, true, false};

        // Run tested method for each value combinations
        LeapYear leapYear = new LeapYear();
        System.out.println("--------------------------------------------");
        System.out.println("Tested logic: " + TEXT_YELLOW + "isLeapYear" + TEXT_RESET);
        for (int i = 0; i < inputNumber.length; i++) {
            totalRun++;
            realResult = leapYear.isLeapYear(inputNumber[i]);
            check(expectedResult[i], realResult, "Test Case " + (i + 1));
        }
    }

    private void check(boolean expectedResult, boolean actualResult, String testCase) {
        if (expectedResult == actualResult) {
            System.out.println(TEXT_GREEN + testCase + " passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testCase + " failed");
            System.out.println("Expected: " + expectedResult);
            System.out.println("Actual:   " + actualResult + TEXT_RESET);
            totalFailed++;
        }
    }

    private void printFooter() {
        System.out.println("\n********************************************");
        System.out.println("TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed + "; FAILED = " + totalFailed);
        System.out.println("********************************************");
    }
}
