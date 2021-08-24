package student_ruslan_pankratov.lesson_4.level_7;

//Task_23
public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.isLeapYearTest();
        leapYearTest.isLeapYearTestTwo();
        leapYearTest.isLeapYearTestThree();
        leapYearTest.isLeapYearTestFour();
    }


    public void isLeapYearTest() {
        int year = 4;
        boolean expectedResult = true;

        LeapYear leapYear = new LeapYear();
        boolean actualResult = leapYear.isLeapYear(year);
        if (actualResult == expectedResult) {
            System.out.println("LeapYear Test = OK");
        } else {
            System.out.println("LeapYear Test = FAIL");
        }
    }

    public void isLeapYearTestTwo() {
        int year = 400;
        boolean expectedResult = true;

        LeapYear leapYear = new LeapYear();
        boolean actualResult = leapYear.isLeapYear(year);
        if (actualResult == expectedResult) {
            System.out.println("LeapYear Test = OK");
        } else {
            System.out.println("LeapYear Test = FAIL");
        }
    }

    public void isLeapYearTestThree() {
        int year = 3;
        boolean expectedResult = false;

        LeapYear leapYear = new LeapYear();
        boolean actualResult = leapYear.isLeapYear(year);
        if (actualResult == expectedResult) {
            System.out.println("LeapYear Test = OK");
        } else {
            System.out.println("LeapYear Test = FAIL");
        }
    }

    public void isLeapYearTestFour() {
        int year = 200;
        boolean expectedResult = false;

        LeapYear leapYear = new LeapYear();
        boolean actualResult = leapYear.isLeapYear(year);
        if (actualResult == expectedResult) {
            System.out.println("LeapYear Test = OK");
        } else {
            System.out.println("LeapYear Test = FAIL");
        }
    }
}
