package student_ruslan_pankratov.lesson_6.level_3;

import java.util.Arrays;

//Task_12-17
class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsTrue();
        arrayServiceTest.containsFalse();
        arrayServiceTest.countOccurrencesTrueTest();
        arrayServiceTest.countOccurrencesFalseTest();
        arrayServiceTest.replaceFirstTrueTest();
        arrayServiceTest.replaceFirstFalseTest();
        arrayServiceTest.replaceAllTest();
        arrayServiceTest.replaceAllNegativeTest();
        arrayServiceTest.revertTest();
        arrayServiceTest.sortTest();

    }

    void containsTrue() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 3, 1, 3, 6};
        int numberToSearch = 6;

        boolean result = arrayService.contains(arr, numberToSearch);
        boolean expectedResult = true;

        resultMethod(result, expectedResult, "containsTrue");


    }

    void containsFalse() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 6};
        int numberToSearch = 10;

        boolean result = arrayService.contains(arr, numberToSearch);
        boolean expectedResult = false;

        resultMethod(result, expectedResult, "containsFalse");

    }

    void countOccurrencesTrueTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 3, 2, 3, 4, 3};
        int numberToSearch = 3;

        int result = arrayService.countOccurrences(arr, numberToSearch);
        int expectedresult = 4;

        resultMethodCount(result, expectedresult, "countOccurrencesTrueTest");


    }

    void countOccurrencesFalseTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 3, 2, 3, 4, 3};
        int numberToSearch = 8;

        int result = arrayService.countOccurrences(arr, numberToSearch);
        int expectedresult = 0;

        resultMethodCount(result, expectedresult, "countOccurrencesFalseTest");
    }


    void replaceFirstTrueTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 3, 5, 6, 6, 5};
        int numberToReplace = 6;
        int newNumber = 7;

        boolean result = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        boolean expectedResult = true;

        resultReplaceFirstMethod(result, expectedResult, "replaceFirstTrueTest");

    }


    void replaceFirstFalseTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 3, 5, 6, 6, 5};
        int numberToReplace = 8;
        int newNumber = 7;

        boolean result = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        boolean expectedResult = false;

        resultReplaceFirstMethod(result, expectedResult, "replaceFirstFalseTest");

    }

    void replaceAllTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 3, 2, 3, 5, 2};
        int oldNumber = 2;
        int newNumber = 10;

        int expectedResult = 3;
        int result = arrayService.replaceAll(arr, oldNumber, newNumber);
        replaceAllMethod(result, expectedResult, "replaceAllTest");
    }

    void replaceAllNegativeTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 3, 2, 3, 5, 2};
        int oldNumber = 10;
        int newNumber = 13;

        int expectedResult = 0;
        int result = arrayService.replaceAll(arr, oldNumber, newNumber);
        replaceAllMethod(result, expectedResult, "replaceAllNegativeTest");
    }

    void revertTest() {
        ArrayService arrayService = new ArrayService();
        int[] result = {1, 2, 3, 4, 5, 6, 7};
        int[] expectedResult = {7, 6, 5, 4, 3, 2, 1};

        arrayService.revert(result);
        revertTestMethod(result, expectedResult, "RevertTest");

    }

    void sortTest() {
        ArrayService arrayService = new ArrayService();
        int[] result = {5, 3, 4, 2, 1, 6, 7, 2};
        arrayService.sort(result);
        int[] expectedResult = {1, 2, 2, 3, 4, 5, 6, 7};
        sortTestMethod(result, expectedResult, "SortTest");

    }


    static void resultMethod(boolean result, boolean expectedResult, String name) {
        if (result == expectedResult) {
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIL");
        }

    }


    static void resultMethodCount(int result, int expectedResult, String name) {
        if (result == expectedResult) {
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIL");
        }
    }

    static void resultReplaceFirstMethod(boolean result, boolean expectedResult, String name) {
        if (result == expectedResult) {
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIL");
        }

    }

    static void replaceAllMethod(int result, int expectedResult, String name) {
        if (result == expectedResult) {
            System.out.println(name + " Test = Ok");
        } else {
            System.out.println(name + " Test = FAIL");
        }

    }

    static void revertTestMethod(int[] result, int[] expectedResult, String name) {
        if (Arrays.equals(result, expectedResult)) {
            System.out.println(name + " Test = Ok");
        } else {
            System.out.println(name + " Test = FAIL");
        }

    }


    static void sortTestMethod(int[] result, int expectedResult[], String name) {
        if (Arrays.equals(result, expectedResult)) {
            System.out.println(name + " Test = Ok");
        } else {
            System.out.println(name + " Test = FAIL");
        }

    }


}