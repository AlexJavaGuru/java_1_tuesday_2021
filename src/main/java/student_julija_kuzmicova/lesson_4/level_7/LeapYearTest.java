package student_julija_kuzmicova.lesson_4.level_7;

class LeapYearTest {

    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.notDivisibleByFourTest();
        leapYearTest.notDivisibleByHundredTest();
        leapYearTest.divisibleByFourHundredTest();
        leapYearTest.notDivisibleByFourHundredTest();
    }

    void notDivisibleByFourTest() {
        LeapYear leap = new LeapYear();
        int year = 1949;
        boolean expectedResult = false;
        boolean realResult = leap.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println("notDivisibleByFourTest = OK");
        } else {
            System.out.println("notDivisibleByFourTest = FAIL");
        }
    }

    void notDivisibleByHundredTest() {
        LeapYear leap = new LeapYear();
        int year = 1948;
        boolean expectedResult = true;
        boolean realResult = leap.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println("notDivisibleByHundredTest = OK");
        } else {
            System.out.println("notDivisibleByHundredTest = FAIL");
        }
    }

    void divisibleByFourHundredTest() {
        LeapYear leap = new LeapYear();
        int year = 2000;
        boolean expectedResult = true;
        boolean realResult = leap.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println("DivisibleByFourHundredTest = OK");
        } else {
            System.out.println("DivisibleByFourHundredTest = FAIL");
        }
    }

    void notDivisibleByFourHundredTest() {
        LeapYear leap = new LeapYear();
        int year = 1900;
        boolean expectedResult = false;
        boolean realResult = leap.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println("notDivisibleByFourHundredTest = OK");
        } else {
            System.out.println("notDivisibleByFourHundredTest = FAIL");
        }
    }
}
