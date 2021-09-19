package student_daniel.lesson4.level7;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest myTest = new LeapYearTest();
        myTest.isLeapYearTest1();
        myTest.isLeapYearTest2();
        myTest.isLeapYearTest3();
        myTest.isLeapYearTest4();
    }

    void isLeapYearTest1() {
        LeapYear myLeap = new LeapYear();
        int number = 4;
        boolean expectedResult = true;
        boolean realResult = myLeap.isLeapYear(number);
        check(expectedResult, realResult, "isLeapYearTest1 - ");
    }

    void isLeapYearTest2() {
        LeapYear myLeap = new LeapYear();
        int number = 100;
        boolean expectedResult = true;
        boolean realResult = myLeap.isLeapYear(number);
        check(expectedResult, realResult, "isLeapYearTest2 - ");
    }

    void isLeapYearTest3() {
        LeapYear myLeap = new LeapYear();
        int number = 400;
        boolean expectedResult = true;
        boolean realResult = myLeap.isLeapYear(number);
        check(expectedResult, realResult, "isLeapYearTest3 - ");
    }

    void isLeapYearTest4() {
        LeapYear myLeap = new LeapYear();
        int number = 1984;
        boolean expectedResult = true;
        boolean realResult = myLeap.isLeapYear(number);
        check(expectedResult, realResult, "isLeapYearTest4 - ");
    }

    void check(boolean expectedResult, boolean realResult, String testName) {
        if(expectedResult == realResult) {
            System.out.println(testName + "Test PASSED");
        } else {
            System.out.println(testName + "Test FAILED");
        }
        System.out.println();
    }
}
