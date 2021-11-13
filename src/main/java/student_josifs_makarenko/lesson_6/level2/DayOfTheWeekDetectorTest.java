package student_josifs_makarenko.lesson_6.level2;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        findDayOfTheWeekTest1();
        findDayOfTheWeekTest2();
        findDayOfTheWeekTest3();
        findDayOfTheWeekTest4();
        findDayOfTheWeekTest5();
        findDayOfTheWeekTest6();
        findDayOfTheWeekTest7();
        findDayOfTheWeekTest8();
    }

    public static void findDayOfTheWeekTest1() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        check(dayOfTheWeekDetector.findDayOfTheWeek(1).equals("Monday"), "findDayOfTheWeekDetector");
    }

    public static void findDayOfTheWeekTest2() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        check(dayOfTheWeekDetector.findDayOfTheWeek(2).equals("Tuesday"), "findDayOfTheWeekDetector");
    }

    public static void findDayOfTheWeekTest3() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        check(dayOfTheWeekDetector.findDayOfTheWeek(3).equals("Wednesday"), "findDayOfTheWeekDetector");
    }

    public static void findDayOfTheWeekTest4() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        check(dayOfTheWeekDetector.findDayOfTheWeek(4).equals("Thursday"), "findDayOfTheWeekDetector");
    }

    public static void findDayOfTheWeekTest5() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        check(dayOfTheWeekDetector.findDayOfTheWeek(5).equals("Friday"), "findDayOfTheWeekDetector");
    }

    public static void findDayOfTheWeekTest6() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        check(dayOfTheWeekDetector.findDayOfTheWeek(6).equals("Saturday"), "findDayOfTheWeekDetector");
    }

    public static void findDayOfTheWeekTest7() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        check(dayOfTheWeekDetector.findDayOfTheWeek(7).equals("Sunday"), "findDayOfTheWeekDetector");
    }

    public static void findDayOfTheWeekTest8() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        check(dayOfTheWeekDetector.findDayOfTheWeek(8).equals("EROR"), "findDayOfTheWeekDetector");
    }

    public static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " != OK");
        }
    }
}
