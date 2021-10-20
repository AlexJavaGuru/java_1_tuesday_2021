package student_julija_kuzmicova.lesson_6.level_3;

import java.util.Arrays;

//Task_12, Task_13, Task_14, Task_15, Task_16, Task_17
public class ArrayServiceTest {

    ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {

        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsReturnTrueTest();
        arrayServiceTest.containsReturnFalseTest();
        arrayServiceTest.countOccurrencesNotZeroTest();
        arrayServiceTest.countOccurrencesZeroTest();
        arrayServiceTest.replaceFirstTrueTest();
        arrayServiceTest.replaceFirstFalseTest();
        arrayServiceTest.replaceAllNotZeroTest();
        arrayServiceTest.replaceAllZeroTest();
        arrayServiceTest.revertTest();
        arrayServiceTest.sortTest();

    }

    void containsReturnTrueTest() {
        int[] arr = {3, 90, 54, 8, 13};
        checkResult(true, arrayService.contains(arr, 8), "containsReturnTrueTest");
    }

    void containsReturnFalseTest() {
        int[] arr = {3, 90, 54, 8, 13};
        checkResult(false, arrayService.contains(arr, 4), "containsReturnFalseTest");
    }

    void countOccurrencesNotZeroTest() {
        int[] arr = {8, 90, 54, 8, 13};
        checkResult(2, arrayService.countOccurrences(arr,8), "countOccurrencesNotZeroTest");
    }

    void countOccurrencesZeroTest() {
        int[] arr = {3, 90, 54, 8, 13};
        checkResult(0, arrayService.countOccurrences(arr,7), "countOccurrencesZeroTest");
    }

    void replaceFirstTrueTest() {
        int[] arr = {3, 90, 54, 8, 13};
        checkResult(true, arrayService.replaceFirst(arr, 8, 9), "replaceFirstTrueTest");
    }

    void replaceFirstFalseTest() {
        int[] arr = {3, 90, 54, 8, 13};
        checkResult(false, arrayService.replaceFirst(arr, 10, 9), "replaceFirstFalseTest");
    }

    void replaceAllNotZeroTest() {
        int[] arr = {8, 90, 54, 8, 13};
        checkResult(2, arrayService.replaceAll(arr,8,9), "replaceAllNotZeroTest");
    }

    void replaceAllZeroTest() {
        int[] arr = {3, 90, 54, 8, 13};
        checkResult(0, arrayService.replaceAll(arr,5,2), "replaceAllZeroTest");
    }

    void revertTest() {
        int[] arr = {3, 90, 54, 8, 13};
        int[] expectedResult = {13, 8, 54, 90, 3};
        arrayService.revert(arr);
        checkResult(expectedResult, arr,"revertTest");
    }

    void sortTest() {
        int[] arr = {3, 90, 54, 8, 13};
        int[] expectedResult = {3, 8, 13, 54, 90};
        arrayService.sort(arr);
        checkResult(expectedResult, arr, "sortTest");
    }

    void checkResult(boolean expectedResult, boolean actualResult, String testName){
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(int expectedResult, int actualResult, String testName){
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(int[] expectedResult, int[] actualResult, String testName){
        int counter = 0;
        for(int i = 0; i < actualResult.length; i++) {
            if (expectedResult[i] == actualResult[i]) {
                counter++;
            }
        }
        if(counter == actualResult.length) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + Arrays.toString(expectedResult) + " but actual: " + Arrays.toString(actualResult));
        }
    }
}
