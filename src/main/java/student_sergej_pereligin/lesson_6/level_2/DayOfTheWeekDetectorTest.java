package student_sergej_pereligin.lesson_6.level_2;

public class DayOfTheWeekDetectorTest {

    private DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();

        dayOfTheWeekDetectorTest.mondayTest(1);
        dayOfTheWeekDetectorTest.tuesdayTest(2);
        dayOfTheWeekDetectorTest.wednesdayTest(3);
        dayOfTheWeekDetectorTest.thursdayTest(4);
        dayOfTheWeekDetectorTest.fridayTest(5);
        dayOfTheWeekDetectorTest.saturdayTest(6);
        dayOfTheWeekDetectorTest.sundayTest(7);
        dayOfTheWeekDetectorTest.nonExistentDay(8);
    }

    void mondayTest(int dayNumber) {
        String result = detector.findDayOfTheWeek(dayNumber);
        checkResults(result.equals("Monday"), "mondayTest");
    }

    void tuesdayTest(int dayNumber) {
        String result = detector.findDayOfTheWeek(dayNumber);
        checkResults(result.equals("Tuesday"), "tuesdayTest");
    }

    void wednesdayTest(int dayNumber) {
        String result = detector.findDayOfTheWeek(dayNumber);
        checkResults(result.equals("Wednesday"), "wednesdayTest");
    }

    void thursdayTest(int dayNumber) {
        String result = detector.findDayOfTheWeek(dayNumber);
        checkResults(result.equals("Thursday"), "thursdayTest");
    }

    void fridayTest(int dayNumber) {
        String result = detector.findDayOfTheWeek(dayNumber);
        checkResults(result.equals("Friday"), "fridayTest");
    }

    void saturdayTest(int dayNumber) {
        String result = detector.findDayOfTheWeek(dayNumber);
        checkResults(result.equals("Saturday"), "saturdayTest");
    }

    void sundayTest(int dayNumber) {
        String result = detector.findDayOfTheWeek(dayNumber);
        checkResults(result.equals("Sunday"), "sundayTest");
    }

    void nonExistentDay(int dayNumber){
        String result = detector.findDayOfTheWeek(dayNumber);
        checkResults(result.equals("Invalid number"), "nonExistentDay");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println("Test " + testName + " passed.");
        } else {
            System.out.println("Test " + testName + " failed.");
        }
    }
}
