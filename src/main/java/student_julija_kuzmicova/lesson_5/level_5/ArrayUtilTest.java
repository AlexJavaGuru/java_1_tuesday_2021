package student_julija_kuzmicova.lesson_5.level_5;

import java.util.Arrays;

//Task_32, Task_36, Task_38
class ArrayUtilTest {

    ArrayUtil arrayUtil = new ArrayUtil();

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int[] array = arrayUtil.createArray(5);
        checkResult(5, array.length, "shouldCreateArray");
    }

    public void shouldFindMaxNumber() {
        int[] array = {15, 9, 80, 45, 7};
        checkResult(80, arrayUtil.findMaxNumber(array), "shouldFindMaxNumber");
    }

    public void shouldFindMinNumber() {
        int[] array = {15, 9, 80, 45, 7};
        checkResult(7, arrayUtil.findMinNumber(array), "shouldFindMinNumber");
    }

    void checkResult(int expectedResult, int actualResult, String testName){
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
