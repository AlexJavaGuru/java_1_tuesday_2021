package student_sergej_pereligin.lesson_9.level_2;

public class DayOfTheWeekTest {
    public static void main(String[] args) {
        DayOfTheWeekTest dayOfTheWeekTest = new DayOfTheWeekTest();
        dayOfTheWeekTest.testIf();
        dayOfTheWeekTest.testSwitch();
        dayOfTheWeekTest.testArray();
    }

    public void testIf(){
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String actualRes = dayOfTheWeekDetectorIfVersion.detectDayName(5);
        String expectedRes = "Friday";
        checkRes(actualRes, expectedRes, "testIf");
    }

    public void testSwitch(){
        DayOfTheWeekDetectorSwitch dayOfTheWeekDetectorSwitch = new DayOfTheWeekDetectorSwitch();
        String expectedRes = "Thursday";
        String actualRes = dayOfTheWeekDetectorSwitch.detectDayName(4);
        checkRes(actualRes, expectedRes, "testSwitch");
    }

    public void testArray() {
        DayOfTheWeekArray dayOfTheWeekArray = new DayOfTheWeekArray();
        String actualRes = dayOfTheWeekArray.detectDayName(4);
        String expectedRes = "Thursday";
        checkRes(actualRes, expectedRes, "testArray");
    }


    public void checkRes(String expectedRes, String actualRes, String testName){
        if(actualRes.equals(expectedRes)){
            System.out.println("Test " + testName + " passed.");
        }
        else {
            System.out.println("Test " + testName + " failed.");
        }
    }

}
