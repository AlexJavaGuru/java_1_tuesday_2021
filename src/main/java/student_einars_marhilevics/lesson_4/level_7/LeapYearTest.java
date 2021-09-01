package student_einars_marhilevics.lesson_4.level_7;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.isLeapOrNoOne();
        leapYearTest.isLeapOrNoTwo();
        leapYearTest.isLeapOrNoThree();
        leapYearTest.isLeapOrNoFour();
    }
    void isLeapOrNoOne() {
        int year = 412;
        boolean expectedResult = true;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println("Test isLeapOrNoOne divided by 4 and not by 100 = OK");
        } else {
            System.out.println("Test isLeapOrNoOne divided by 4 and not by 100 = Fail");
        }
    }
    void isLeapOrNoTwo() {
        int year = 1900;
        boolean expectedResult = false;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println("Test isLeapOrNoOne divided by 100 and not by 400 = OK");
        } else {
            System.out.println("Test isLeapOrNoOne divided by 100 and not by 400 = Fail");
        }
    }
    void isLeapOrNoThree() {
        int year = 2000;
        boolean expectedResult = true;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println("Test isLeapOrNoThree divided by 100 and by 400 = OK");
        } else {
            System.out.println("Test isLeapOrNoThree divided by 100 and by 400 = Fail");
        }
    }
    void isLeapOrNoFour() {
        int year = 1999;
        boolean expectedResult = false;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println("Test isLeapOrNoFour not divided by 4 = OK");
        } else {
            System.out.println("Test isLeapOrNoFour not divided by 4 = Fail");
        }
    }
}
