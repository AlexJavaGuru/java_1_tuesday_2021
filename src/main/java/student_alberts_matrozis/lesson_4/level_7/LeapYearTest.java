package student_alberts_matrozis.lesson_4.level_7;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.leapYearTest();
    }

    public void leapYearTest() {
        int variableOne = 2;
        int variableTwo = 80;
        int variableThree = 400;
        int variableFour = 500;
        LeapYear subject = new LeapYear();
        checkResult(false, subject.isLeapYear(variableOne), "Test 1");
        checkResult(true, subject.isLeapYear(variableTwo), "Test 2");
        checkResult(true, subject.isLeapYear(variableThree), "Test 3");
        checkResult(false, subject.isLeapYear(variableFour), "Test 4");
    }

    public void checkResult(boolean exceptedResult, boolean receivedResult, String testName) {
        if (exceptedResult == receivedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Failed");
        }
    }
}
