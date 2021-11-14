package student_daniel.lesson9.level2;

import java.util.Objects;

public class DayTest {
    //Task 4
    public static void main(String[] args) {
        DayTest myTest = new DayTest();
        myTest.ifTest();
        myTest.switchTest();
        myTest.arrayTest();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    //Test
    void ifTest() {
        DayOfTheWeekDetectorIfVersion myDay = new DayOfTheWeekDetectorIfVersion();
        int dayNumber = 1;
        String expectedResult = "Monday";
        String actualResult = myDay.detectDayName(dayNumber);
        check(expectedResult, actualResult, "Day of the week from the If Statement = " + actualResult);
    }

    void switchTest() {
        DayOfTheWeekDetectorSwitchVersion myDay = new DayOfTheWeekDetectorSwitchVersion();
        int dayNumber = 3;
        String expectedResult = "Wednesday";
        String actualResult = myDay.detectDayName(dayNumber);
        check(expectedResult, actualResult, "Day of the week from the Switch = " + actualResult);
    }

    void arrayTest() {
        DayOfTheWeekDetectorArrayVersion myDay = new DayOfTheWeekDetectorArrayVersion();
        int dayNumber = 5;
        String expectedResult = "Friday";
        String actualResult = myDay.detectDayName(dayNumber);
        check(expectedResult, actualResult, "Day of the week from the Array = " + actualResult);
    }

    void check(String expectedResult, String actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }
}
