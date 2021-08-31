package student_oleg_kozlov.lesson_4.level_5;

// Task_16
class LightColorDetectorTest {

    // Define color constants
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";
    private static final String TEXT_YELLOW = "\u001B[33m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    public static void main(String[] args) {
        detectTest();
        printFooter(); // Print totals
    }

    private static void detectTest() {
        String realResult;

        // Prepare data for testing
        int[] number = {400, 460, 500, 580, 600, 700, 1000};
        String[] expectedResult = {"Violet", "Blue", "Green", "Yellow", "Orange", "Red", "Invisible Light"};

        // Run tested method for each value combinations
        LightColorDetector detector = new LightColorDetector();
        System.out.println("--------------------------------------------");
        System.out.println("Tested logic: " + TEXT_YELLOW + "detect" + TEXT_RESET);
        for (int i = 0; i < number.length; i++) {
            totalRun++;
            realResult = detector.detect(number[i]);
            check(expectedResult[i], realResult, "Test Case " + (i + 1));
        }
    }

    private static void check(String expectedResult, String actualResult, String testCase) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(TEXT_GREEN + testCase + " passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testCase + " failed. Expected: " + expectedResult +
                    " but actual: " + actualResult + TEXT_RESET);
            totalFailed++;
        }
    }

    private static void printFooter() {
        System.out.println("\n********************************************");
        System.out.println("TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed + "; FAILED = " + totalFailed);
        System.out.println("********************************************");
    }
}
