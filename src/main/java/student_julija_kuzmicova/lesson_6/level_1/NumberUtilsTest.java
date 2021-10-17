package student_julija_kuzmicova.lesson_6.level_1;

//Task_6
class NumberUtilsTest {

    NumberUtils numberUtils = new NumberUtils();

    public static void main(String[] args) {

        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.evenNumberTest();
        numberUtilsTest.oddNumberTest();

    }

    public void evenNumberTest() {
        checkResult(true, numberUtils.isEven(8), "evenNumberTest");
    }

    public void oddNumberTest() {
        checkResult(false, numberUtils.isEven(7), "oddNumberTest");
    }


    void checkResult(boolean expectedResult, boolean actualResult, String testName){
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
