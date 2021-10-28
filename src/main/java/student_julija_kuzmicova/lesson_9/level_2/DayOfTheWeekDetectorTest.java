package student_julija_kuzmicova.lesson_9.level_2;

//Task_4
class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.detectDayNameIfVersionValidDayTest();
        dayOfTheWeekDetectorTest.detectDayNameIfVersionInvalidDayTest();
        dayOfTheWeekDetectorTest.detectDayNameSwitchVersionValidDayTest();
        dayOfTheWeekDetectorTest.detectDayNameSwitchVersionInvalidDayTest();
        dayOfTheWeekDetectorTest.detectDayNameArrayVersionValidDayTest();
        dayOfTheWeekDetectorTest.detectDayNameArrayVersionInvalidDayTest();
    }

    void detectDayNameIfVersionValidDayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersionImpl();
        checkResult("Thursday", dayOfTheWeekDetector.detectDayName(4), "detectDayNameIfVersionValidDayTest");
    }

    void detectDayNameIfVersionInvalidDayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersionImpl();
        checkResult("Please input a valid number between 1 and 7", dayOfTheWeekDetector.detectDayName(0), "detectDayNameIfVersionInvalidDayTest");
    }

    void detectDayNameSwitchVersionValidDayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorSwitchVersionImpl();
        checkResult("Tuesday", dayOfTheWeekDetector.detectDayName(2), "detectDayNameSwitchVersionValidDayTest");
    }

    void detectDayNameSwitchVersionInvalidDayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorSwitchVersionImpl();
        checkResult("Please input a valid number between 1 and 7", dayOfTheWeekDetector.detectDayName(8), "detectDayNameSwitchVersionInvalidDayTest");
    }

    void detectDayNameArrayVersionValidDayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorArrayVersionImpl();
        checkResult("Sunday", dayOfTheWeekDetector.detectDayName(7), "detectDayNameArrayVersionValidDayTest");
    }

    void detectDayNameArrayVersionInvalidDayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorArrayVersionImpl();
        checkResult("Please input a valid number between 1 and 7", dayOfTheWeekDetector.detectDayName(9), "detectDayNameArrayVersionInvalidDayTest");
    }

    void checkResult(String expectedResult, String actualResult, String testName){
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
