package student_alberts_matrozis.lesson_6.level_2;

import static student_alberts_matrozis.albertsUtils.Utils.*;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest testRunner = new DayOfTheWeekDetectorTest();
        testRunner.mondayTest();
        testRunner.tuesdayTest();
        testRunner.fridayTest();
        testRunner.incorrectTest();
    }

    public void mondayTest() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        String dayName = subject.findDayOfTheWeek(1);
        check("Monday", dayName);
    }

    public void tuesdayTest() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        String dayName = subject.findDayOfTheWeek(2);
        check("Tuesday", dayName);
    }

    public void fridayTest() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        String dayName = subject.findDayOfTheWeek(5);
        check("Friday", dayName);
    }

    public void incorrectTest() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        String result = subject.findDayOfTheWeek(10);
        check("Not correct day number", result);
    }
}