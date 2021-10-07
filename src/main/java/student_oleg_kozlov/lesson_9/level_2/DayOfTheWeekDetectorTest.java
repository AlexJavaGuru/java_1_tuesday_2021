package student_oleg_kozlov.lesson_9.level_2;

// Task_4
class DayOfTheWeekDetectorTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    public static void main(String[] args) {
        dayOfTheWeekDetectorIfVersionImplTestValidDay();
        dayOfTheWeekDetectorIfVersionImplTestInvalidDay();
        dayOfTheWeekDetectorSwitchVersionImplTestValidDay();
        dayOfTheWeekDetectorSwitchVersionImplTestInvalidDay();
        dayOfTheWeekDetectorArrayVersionImplTestValidDay();
        dayOfTheWeekDetectorArrayVersionImplTestInvalidDay();
        printFooter();
    }

    private static void dayOfTheWeekDetectorIfVersionImplTestValidDay() {
        totalRun++;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorIfVersionImpl();
        checkResult("Wednesday",  detector.detectDayName(3),"dayOfTheWeekDetectorIfVersionImplTestValidDay");
    }

    private static void dayOfTheWeekDetectorIfVersionImplTestInvalidDay() {
        totalRun++;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorIfVersionImpl();
        checkResult("Please input a valid number between 1 and 7",  detector.detectDayName(9),"dayOfTheWeekDetectorIfVersionImplTestInvalidDay");
    }

    private static void dayOfTheWeekDetectorSwitchVersionImplTestValidDay() {
        totalRun++;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorSwitchVersionImpl();
        checkResult("Wednesday",  detector.detectDayName(3),"dayOfTheWeekDetectorSwitchVersionImplTestValidDay");
    }

    private static void dayOfTheWeekDetectorSwitchVersionImplTestInvalidDay() {
        totalRun++;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorSwitchVersionImpl();
        checkResult("Please input a valid number between 1 and 7",  detector.detectDayName(9),"dayOfTheWeekDetectorSwitchVersionImplTestInvalidDay");
    }

    private static void dayOfTheWeekDetectorArrayVersionImplTestValidDay() {
        totalRun++;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorArrayVersionImpl();
        checkResult("Wednesday",  detector.detectDayName(3),"dayOfTheWeekDetectorArrayVersionImplTestValidDay");
    }

    private static void dayOfTheWeekDetectorArrayVersionImplTestInvalidDay() {
        totalRun++;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorArrayVersionImpl();
        checkResult("Please input a valid number between 1 and 7",  detector.detectDayName(9),"dayOfTheWeekDetectorArrayVersionImplTestInvalidDay");
    }

    private static void checkResult(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(TEXT_GREEN + testName + " - passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testName + " - failed");
            System.out.println("Expected: " + expected);
            System.out.println("Actual:   " + actual + TEXT_RESET);
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
