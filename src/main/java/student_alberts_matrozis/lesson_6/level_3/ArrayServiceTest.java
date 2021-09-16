package student_alberts_matrozis.lesson_6.level_3;

import student_alberts_matrozis.albertsUtils.Utils;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest testRunner = new ArrayServiceTest();
        testRunner.positiveResult();
        testRunner.negativeResult();
        testRunner.countOccurrencesTest1();
        testRunner.countOccurrencesTest2();
        testRunner.replaceAllTestPositive();
        testRunner.replaceAllTestNegative();
        testRunner.replaceFirstTestPositive();
        testRunner.replaceFirstTestNegative();
        testRunner.revertTest();
        testRunner.sortTest();
    }

    public void positiveResult() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int number = 6;
        boolean receivedResult = arrayService.contains(arr, number);
        boolean exceptedResult = true;
        Utils.check(receivedResult, exceptedResult);
    }

    public void negativeResult() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int number = 9;
        boolean receivedResult = arrayService.contains(arr, number);
        boolean exceptedResult = false;
        Utils.check(receivedResult, exceptedResult);
    }

    public void countOccurrencesTest1() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 3, 3, 4, 5, 6};
        int number = 3;
        int receivedResult = arrayService.countOccurrences(arr, number);
        int exceptedResult = 3;
        Utils.check(receivedResult, exceptedResult);
    }

    public void countOccurrencesTest2() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 1, 1, 1, 1, 1, 1};
        int number = 1;
        int receivedResult = arrayService.countOccurrences(arr, number);
        int exceptedResult = 7;
        Utils.check(receivedResult, exceptedResult);
    }

    public void replaceAllTestPositive() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 3, 4, 5, 6};
        int number = 3;
        int receivedResult = arrayService.replaceAll(arr, number, 10);
        int exceptedResult = 2;
        Utils.check(receivedResult, exceptedResult);
    }

    public void replaceAllTestNegative() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 7, 4, 5, 6};
        int number = 10;
        int receivedResult = arrayService.replaceAll(arr, number, 20);
        int exceptedResult = 0;
        Utils.check(receivedResult, exceptedResult);
    }

    public void replaceFirstTestPositive() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 1, 3, 1, 5};
        int number = 1;
        boolean receivedResult = arrayService.replaceFirst(arr, number, 10);
        boolean exceptedResult = true;
        Utils.check(exceptedResult, receivedResult);
    }

    public void replaceFirstTestNegative() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 0, 3, 8, 5};
        int number = 1;
        boolean receivedResult = arrayService.replaceFirst(arr, number, 10);
        boolean exceptedResult = false;
        Utils.check(exceptedResult, receivedResult);
    }

    public void revertTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        arrayService.revert(arr);
        int[] exceptedResult = {5, 4, 3, 2, 1};
        Utils.check(true, Arrays.toString(exceptedResult).equals(Arrays.toString(arr)));
    }

    public void sortTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {5, 3, 1, 4, 2};
        int[] exceptedResult = {1, 2, 3, 4, 5};
        arrayService.sort(arr);
        Utils.check(true, Arrays.toString(arr).equals(Arrays.toString(exceptedResult)));
    }
}
