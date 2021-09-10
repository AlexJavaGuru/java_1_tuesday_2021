package student_oleg_kozlov.lesson_4.level_7;

// Task_22
class FizzBuzzTest {

    // Define color constants
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";
    private static final String TEXT_YELLOW = "\u001B[33m";

    private int totalRun = 0;
    private int totalPassed = 0;
    private int totalFailed = 0;

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest(); // Create an instance as static method can't run non-static methods
        fizzBuzzTest.detectTest();
        fizzBuzzTest.printFooter(); // Print totals
    }

    private void detectTest() {
        String realResult;

        // Prepare data for testing
        int[] inputNumber = {9, 10, 15, 17};
        String[] expectedResult = {"Fizz", "Buzz", "FizzBuzz", "17"};

        // Run tested method for each value combinations
        FizzBuzz flizzBuzz = new FizzBuzz();
        System.out.println("--------------------------------------------");
        System.out.println("Tested logic: " + TEXT_YELLOW + "detect" + TEXT_RESET);
        for (int i = 0; i < inputNumber.length; i++) {
            totalRun++;
            realResult = flizzBuzz.detect(inputNumber[i]);
            check(expectedResult[i], realResult, "Test Case " + (i + 1));
        }
    }

    private void check(String expectedResult, String actualResult, String testCase) {
        if (expectedResult.equals(actualResult)) {
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
