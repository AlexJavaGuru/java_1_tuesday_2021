package student_einars_marhilevics.lesson_6.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.testMonday();
        dayOfTheWeekDetectorTest.testTuesday();
        dayOfTheWeekDetectorTest.testWednesday();
        dayOfTheWeekDetectorTest.testThursday();
        dayOfTheWeekDetectorTest.testFriday();
        dayOfTheWeekDetectorTest.testSaturday();
        dayOfTheWeekDetectorTest.testSunday();
        dayOfTheWeekDetectorTest.testOther();
    }

    void testMonday() {
        int dayNumber = 1;
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(result.equals("Monday"), "Monday");
    }

    void testTuesday() {
        int dayNumber = 2;
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(result.equals("Tuesday"), "Tuesday");
    }

    void testWednesday() {
        int dayNumber = 3;
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(result.equals("Wednesday"), "Wednesday");
    }

    void testThursday() {
        int dayNumber = 4;
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(result.equals("Thursday"), "Thursday");
    }

    void testFriday() {
        int dayNumber = 5;
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(result.equals("Friday"), "Friday");
    }

    void testSaturday() {
        int dayNumber = 6;
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(result.equals("Saturday"), "Saturday");
    }

    void testSunday() {
        int dayNumber = 7;
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(result.equals("Sunday"), "Sunday");
    }

    void testOther() {
        int dayNumber = 10;
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(result.equals("Not correct day number"), "Not correct day number");
    }

    void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " failed");
        }
    }
}

