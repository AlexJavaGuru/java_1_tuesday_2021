package student_olga_urek.Lesson_4.level_7;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapTest = new LeapYearTest();
        leapTest.undivisibleByFourTest();
        leapTest.undivisibleByOneHundredTest();
        leapTest.divisibleByFourHundredTest();
        leapTest.undivisibleByFourHundredTest();
    }
    public void undivisibleByFourTest() {
        LeapYear leapy = new LeapYear();
        int year = 1965;
        boolean expectedResult = false;
        boolean realResult = leapy.isLeap(year);
        if (realResult == expectedResult) {
            System.out.println("undivisibleByFourTest() = OK");
        } else {
            System.out.println("undivisibleByFourTest() = FAIL");
        }
    }
    public void undivisibleByOneHundredTest() {
        LeapYear leapy = new LeapYear();
        int year = 1964;
        boolean expectedResult = true;
        boolean realResult = leapy.isLeap(year);
        if (realResult == expectedResult) {
            System.out.println("undivisibleByOneHundredTest() = OK");
        } else {
            System.out.println("undivisibleByOneHundredTest() = FAIL");
        }
    }
    public void divisibleByFourHundredTest() {
        LeapYear leapy = new LeapYear();
        int year = 1600;
        boolean expectedResult = true;
        boolean realResult = leapy.isLeap(year);
        if (realResult == expectedResult) {
            System.out.println("divisibleByFourHundredTest() = OK");
        } else {
            System.out.println("divisibleByFourHundredTest() = FAIL");
        }
    }
    public void undivisibleByFourHundredTest() {
        LeapYear leapy = new LeapYear();
        int year = 1700;
        boolean expectedResult = false;
        boolean realResult = leapy.isLeap(year);
        if (realResult == expectedResult) {
            System.out.println("undivisibleByFourHundredTest() = OK");
        } else {
            System.out.println("undivisibleByFourHundredTest() = FAIL");
        }
    }
}
