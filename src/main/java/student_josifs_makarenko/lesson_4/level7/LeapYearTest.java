package student_josifs_makarenko.lesson_4.level7;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.isLeapYearTest1();
        leapYearTest.isLeapYearTest2();
        leapYearTest.isLeapYearTest3();
        leapYearTest.isLeapYearTest4();
    }

    public void isLeapYearTest1() {
        LeapYear leapYear = new LeapYear();
        int number = 4;
        boolean expectedResult = false;
        boolean realResult = leapYear.isLeapYear(number);
        check(expectedResult, realResult, "isLeapYear");
    }

    public void isLeapYearTest2() {
        LeapYear leapYear = new LeapYear();
        int number = 300;
        boolean expectedResult = true;
        boolean realResult = leapYear.isLeapYear(number);
        check(expectedResult, realResult, "isLeapYear");
    }

    public void isLeapYearTest3() {
        LeapYear leapYear = new LeapYear();
        int number = 400;
        boolean expectedResult = false;
        boolean realResult = leapYear.isLeapYear(number);
        check(expectedResult, realResult, "isLeapYear");
    }

    public void isLeapYearTest4() {
        LeapYear leapYear = new LeapYear();
        int number = 3700;
        boolean expectedResult = true;
        boolean realResult = leapYear.isLeapYear(number);
        check(expectedResult, realResult, "isLeapYear");
    }

    public void check (boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult)  {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " != OK");
        }
    }
}
