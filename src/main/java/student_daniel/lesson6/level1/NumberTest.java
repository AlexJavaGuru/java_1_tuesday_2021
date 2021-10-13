package student_daniel.lesson6.level1;

class NumberTest {
    //Task 6
    public static void main(String[] args) {
        NumberTest numTest = new NumberTest();
        numTest.isEvenTest();
    }

    public void isEvenTest() {
        NumberUtils myUtil = new NumberUtils();
        int number = 10;
        boolean expectedResult = true;
        boolean realResult = myUtil.isEven(number);
        check(expectedResult, realResult, "Number is even: " + realResult);
    }

    void check(boolean expectedResult, boolean realResult, String testName) {
        if(expectedResult == realResult) {
            System.out.println(testName + " - Test PASSED");
        } else {
            System.out.println(testName + " - Test FAILED");
        }
    }
}