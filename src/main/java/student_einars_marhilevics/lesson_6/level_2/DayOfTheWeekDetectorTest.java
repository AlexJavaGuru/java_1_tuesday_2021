package student_einars_marhilevics.lesson_6.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.shouldReturnError();
    }

    void shouldReturnMonday() {
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(1);
        check(result.equals("Monday"), "Monday");
    }

    void shouldReturnTuesday() {
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(2);
        check(result.equals("Tuesday"), "Tuesday");
    }

    void shouldReturnWednesday() {
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(3);
        check(result.equals("Wednesday"), "Wednesday");
    }

    void shouldReturnThursday() {
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(4);
        check(result.equals("Thursday"), "Thursday");
    }

    void shouldReturnFriday() {
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(5);
        check(result.equals("Friday"), "Friday");
    }

    void shouldReturnSaturday() {
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(6);
        check(result.equals("Saturday"), "Saturday");
    }

    void shouldReturnSunday() {
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(7);
        check(result.equals("Sunday"), "Sunday");
    }

    void shouldReturnError() {
        DayOfTheWeekDetector DayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = DayOfTheWeekDetector.findDayOfTheWeek(10);
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

