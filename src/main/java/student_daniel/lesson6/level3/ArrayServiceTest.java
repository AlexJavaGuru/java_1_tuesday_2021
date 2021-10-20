package student_daniel.lesson6.level3;

import java.util.Arrays;

public class ArrayServiceTest {
    //Task 12 13 14 15 16 17
    public static void main(String[] args) {
        ArrayServiceTest myTest = new ArrayServiceTest();
        myTest.containPositiveTest();
        myTest.containNegativeTest();
        myTest.countOccurrencesPositiveTest();
        myTest.countOccurrencesNegativeTest();
        myTest.replaceFirstPositiveTest();
        myTest.replaceFirstNegativeTest();
        myTest.replaceAllPositiveTest();
        myTest.replaceAllNegativeTest();
        myTest.reverseArrayTest();
        myTest.sortArrayTest();
    }

    ArrayService myService = new ArrayService();

    void containPositiveTest() {
        int[] numArray = {51, 2, 0, -10};
        boolean expectedResult = true;
        boolean realResult = myService.containNum(numArray, 2);
        check(expectedResult, realResult, "Positive test >>> Number contains: " + realResult + " >>> Expected: " + expectedResult);
    }

    void containNegativeTest() {
        int[] numArray = {51, 2, 0, -10};
        boolean expectedResult = false;
        boolean realResult = myService.containNum(numArray, -2);
        check(expectedResult, realResult, "Negative test >>> Number contains: " + realResult  + " >>> Expected: " + expectedResult);
    }

    void countOccurrencesPositiveTest() {
        int[] numArray = {1, 2, 3, 3};
        int expectedResult = 2;
        int realResult = myService.countOccurrences(numArray, 3);
        check(expectedResult, realResult, "Positive test >>> Occurrences count: " + realResult + " >>> Expected: " + expectedResult);
    }

    void countOccurrencesNegativeTest() {
        int[] numArray = {1, 2, 3, 3};
        int expectedResult = 0;
        int realResult = myService.countOccurrences(numArray, 4);
        check(expectedResult, realResult, "Negative test >>> Occurrences count: " + realResult + " >>> Expected: " + expectedResult);
    }

    void replaceFirstPositiveTest() {
        int[] numArray = {1, 2, 3, 3};
        boolean expectedResult = true;
        boolean realResult = myService.replaceFirst(numArray, 3, 0);
        check(expectedResult, realResult, "Positive test >>> Replaced to: " + realResult + " >>> Expected: " + expectedResult);
    }

    void replaceFirstNegativeTest() {
        int[] numArray = {1, 2, 3, 3};
        boolean expectedResult = false;
        boolean realResult = myService.replaceFirst(numArray, 4, 0);
        check(expectedResult, realResult, "Negative test >>> Replaced to: " + realResult + " >>> Expected: " + expectedResult);
    }

    void replaceAllPositiveTest() {
        int[] numArray = {1, 2, 3, 3};
        int expectedResult = 4;
        int realResult = myService.replaceAll(numArray, 3, 0);
        check(expectedResult, realResult, "Positive test >>> Replaced to: " + realResult + " >>> Expected: " + expectedResult);
    }

    void replaceAllNegativeTest() {
        int[] numArray = {1, 2, 3, 3};
        int expectedResult = 3;
        int realResult = myService.replaceAll(numArray,2, 0);
        check(expectedResult, realResult, "Negative test >>> Replaced to: " + realResult + " >>> Expected: " + expectedResult);
    }

    void reverseArrayTest() {
        int[] numArray = {1, 2, 3, 3};
        int[] expectedResult = {3, 3, 2, 1};
        int[] realResult = myService.revertArrey(numArray);
        check(realResult,expectedResult, "Negative test >>> Reverted to: " + Arrays.toString(numArray) + " >>> Expected: " + Arrays.toString(expectedResult));
    }

    void sortArrayTest() {
        int[] numArray = {21, 2, 33, 300, 0, -10};
        int[] expectedResult = {-10, 0, 2, 21, 33, 300};
        int[] realResult = myService.sortArray(numArray);
        check(realResult,expectedResult, "Negative test >>> Sorted from Lowest to Highest number: " + Arrays.toString(numArray) + " >>> Expected: " + Arrays.toString(expectedResult));
    }

    void check(boolean expectedResult, boolean realResult, String testName) {
        if(expectedResult == realResult) {
            System.out.println(testName + " - Test PASSED");
        } else {
            System.out.println(testName + " - Test FAILED");
        }
    }

    void check(int expectedResult, int realResult, String testName) {
        if(expectedResult == realResult) {
            System.out.println(testName + " - Test PASSED");
        } else {
            System.out.println(testName + " - Test FAILED");
        }
    }

    void check(int[] expectedResult, int[] realResult, String testName) {
        if(Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - Test PASSED");
        } else {
            System.out.println(testName + " - Test FAILED");
        }
    }
}

