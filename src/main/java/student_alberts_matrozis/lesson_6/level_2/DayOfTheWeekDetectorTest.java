package student_alberts_matrozis.lesson_6.level_2;

import student_alberts_matrozis.albertsUtils.Utils;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest testRunner = new DayOfTheWeekDetectorTest();
        testRunner.mondayTest();
        testRunner.tuesdayTest();
        testRunner.fridayTest();
        testRunner.incorrectTest();
    }

    public void mondayTest() {
        Utils utils = new Utils();
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        String dayName = subject.findDayOfTheWeek(1);
        utils.check("Monday", dayName);
    }

    public void tuesdayTest() {
        Utils utils = new Utils();
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        String dayName = subject.findDayOfTheWeek(2);
        utils.check("Tuesday", dayName);
    }

    public void fridayTest() {
        Utils utils = new Utils();
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        String dayName = subject.findDayOfTheWeek(5);
        utils.check("Friday", dayName);
    }

    public void incorrectTest() {
        Utils utils = new Utils();
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        String result = subject.findDayOfTheWeek(10);
        utils.check("Not correct day number", result);
    }
}