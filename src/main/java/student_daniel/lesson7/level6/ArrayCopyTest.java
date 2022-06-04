package student_daniel.lesson7.level6;

import java.util.Arrays;

public class ArrayCopyTest {
    //Task 12
    public static void main(String[] args) {
        ArrayCopyTest myTest = new ArrayCopyTest();
        myTest.testSortedArray();
        myTest.testUnsortedArray();
        myTest.testFromMinToMax();
        myTest.testFromMaxToMin();
        myTest.testFromWithLoop();
        myTest.testWithRepeatedValues();
        myTest.testWithRepeatedValuesOppositeWay();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    ArrayCopy myArrayCopy = new ArrayCopy();

    void testSortedArray() {
        int [] arrayValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int from = 3;
        int to = 6;
        int [] expectedResult = {3, 4, 5, 6};
        int [] actualResult = myArrayCopy.copyInRange(arrayValues, from, to);
        check(expectedResult, actualResult, " Extracted values from " + from + " to " + to + " are: " + Arrays.toString(actualResult));
    }

    void testUnsortedArray() {
        int [] arrayValues = {1, 0, 3, 24, 5, -6, 7, 8, 9, -24};
        int from = -6;
        int to = 9;
        int [] expectedResult = {-6, 0, 1, 3, 5, 7, 8, 9};
        int [] actualResult = myArrayCopy.copyInRange(arrayValues, from, to);
        check(expectedResult, actualResult, " Extracted values from " + from + " to " + to + " are: " + Arrays.toString(actualResult));
    }

    void testFromMinToMax() {
        int [] arrayValues = {1, 0, 3, 24, 5, -6, 7, 8, 9, -24};
        int from = -24;
        int to = 24;
        int [] expectedResult = {-24, -6, 0, 1, 3, 5, 7, 8, 9, 24};
        int [] actualResult = myArrayCopy.copyInRange(arrayValues, from, to);
        check(expectedResult, actualResult, " Extracted values from " + from + " to " + to + " are: " + Arrays.toString(actualResult));
    }

    void testFromMaxToMin() {
        int [] arrayValues = {1, 0, 3, 24, 5, -6, 7, 8, 9, -24};
        int from = 24;
        int to = -24;
        int [] expectedResult = {24, 9, 8, 7, 5, 3, 1, 0, -6, -24};
        int [] actualResult = myArrayCopy.copyInRange(arrayValues, from, to);
        check(expectedResult, actualResult, " Extracted values from " + from + " to " + to + " are: " + Arrays.toString(actualResult));
    }

    void testFromWithLoop() {
        int [] arrayValues = {1, 0, 3, 24, 5, -6, 7, 8, 9, -24};
        int from = 8;
        int to = 3;
        int [] expectedResult = {8, 7, 5, 3};
        int [] actualResult = myArrayCopy.copyInRange(arrayValues, from, to);
        check(expectedResult, actualResult, " Extracted values from " + from + " to " + to + " are: " + Arrays.toString(actualResult));
    }

    void testWithRepeatedValues() {
        int [] arrayValues = {1, 0, 1, 24, 5, -6, 7, 7, 8, 9, -24};
        int from = -6;
        int to = 7;
        int [] expectedResult = {-6, 0, 1, 1, 5, 7, 7};
        int [] actualResult = myArrayCopy.copyInRange(arrayValues, from, to);
        check(expectedResult, actualResult, " Extracted values from " + from + " to " + to + " are: " + Arrays.toString(actualResult));
    }

    void testWithRepeatedValuesOppositeWay() {
        int [] arrayValues = {1, 0, 1, 24, 5, -6, 7, 7, 8, 9, -24};
        int from = 7;
        int to = -6;
        int [] expectedResult = {7, 7, 5, 1, 1, 0, -6};
        int [] actualResult = myArrayCopy.copyInRange(arrayValues, from, to);
        check(expectedResult, actualResult, " Extracted values from " + from + " to " + to + " are: " + Arrays.toString(actualResult));
    }

    void check(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }


}
