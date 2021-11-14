package student_julija_kuzmicova.lesson_7.level_6;

import java.util.Arrays;

//Task_12
class ArrayCopyTest {

    ArrayCopy arrayCopy = new ArrayCopy();

    public static void main(String[] args) {

        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.copyInRangeOneTest();
        arrayCopyTest.copyInRangeTwoTest();
        arrayCopyTest.copyInRangeThreeTest();
        arrayCopyTest.copyInRangeFourTest();
    }

    void copyInRangeOneTest() {
        int[] in = {2, 10, 0, -5, 34, 23, 25, 13};
        int[] expectedResult = {10, 13};
        checkResult(expectedResult, arrayCopy.copyInRange(in,10, 20), "copyInRangeOneTest");
    }

    void copyInRangeTwoTest() {
        int[] in = {2, 10, 0, -5, 34, 23, 25, 13};
        int[] expectedResult = {10, 23, 25, 13};
        checkResult(expectedResult, arrayCopy.copyInRange(in,10, 30), "copyInRangeTwoTest");
    }

    void copyInRangeThreeTest() {
        int[] in = {2, 10, 0, -5, 34, 23, 25, 13};
        int[] expectedResult = {2};
        checkResult(expectedResult, arrayCopy.copyInRange(in,1, 9), "copyInRangeThreeTest");
    }

    void copyInRangeFourTest() {
        int[] in = {2, 10, 0, -5, 34, 23, 25, 13};
        int[] expectedResult = {};
        checkResult(expectedResult, arrayCopy.copyInRange(in,40, 50), "copyInRangeFourTest");
    }

    void checkResult(int[] expectedResult, int[] actualResult, String testName){
        if(arraysAreEqual(expectedResult, actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + Arrays.toString(expectedResult) + " but actual: " + Arrays.toString(actualResult));
        }
    }

    boolean arraysAreEqual(int[] arrayOne, int[] arrayTwo) {
        if(arrayOne.length != arrayTwo.length) {
            return false;
        }
        for(int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] != arrayTwo[i]) {
                return false;
            }
        }
        return true;
    }
}
