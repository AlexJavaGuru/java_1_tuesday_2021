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
        Utils utils = new Utils();
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int number = 6;
        boolean receivedResult = arrayService.contains(arr, number);
        boolean exceptedResult = true;
        utils.check(receivedResult, exceptedResult);
    }

    public void negativeResult() {
        Utils utils = new Utils();
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int number = 9;
        boolean receivedResult = arrayService.contains(arr, number);
        boolean exceptedResult = false;
        utils.check(receivedResult, exceptedResult);
    }

    public void countOccurrencesTest1() {
        Utils utils = new Utils();
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 3, 3, 4, 5, 6};
        int number = 3;
        int receivedResult = arrayService.countOccurrences(arr, number);
        int exceptedResult = 3;
        utils.check(receivedResult, exceptedResult);
    }

    public void countOccurrencesTest2() {
        Utils utils = new Utils();
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 1, 1, 1, 1, 1, 1};
        int number = 1;
        int receivedResult = arrayService.countOccurrences(arr, number);
        int exceptedResult = 7;
        utils.check(receivedResult, exceptedResult);
    }

    public void replaceAllTestPositive() {
        Utils utils = new Utils();
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 3, 4, 5, 6};
        int number = 3;
        int receivedResult = arrayService.replaceAll(arr, number, 10);
        int exceptedResult = 2;
        utils.check(receivedResult, exceptedResult);
    }

    public void replaceAllTestNegative() {
        Utils utils = new Utils();
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 7, 4, 5, 6};
        int number = 10;
        int receivedResult = arrayService.replaceAll(arr, number, 20);
        int exceptedResult = 0;
        utils.check(receivedResult, exceptedResult);
    }

    public void replaceFirstTestPositive() {
        Utils utils = new Utils();
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 1, 3, 1, 5};
        int number = 1;
        boolean receivedResult = arrayService.replaceFirst(arr, number, 10);
        boolean exceptedResult = true;
        utils.check(exceptedResult, receivedResult);
    }

    public void replaceFirstTestNegative() {
        Utils utils = new Utils();
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 0, 3, 8, 5};
        int number = 1;
        boolean receivedResult = arrayService.replaceFirst(arr, number, 10);
        boolean exceptedResult = false;
        utils.check(exceptedResult, receivedResult);
    }

    public void revertTest() {
        Utils utils = new Utils();
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        arrayService.revert(arr);
        int[] exceptedResult = {5, 4, 3, 2, 1};
        utils.check(true, Arrays.toString(exceptedResult).equals(Arrays.toString(arr)));
    }

    public void sortTest() {
        Utils utils = new Utils();
        ArrayService arrayService = new ArrayService();
        int[] arr = {5, 3, 1, 4, 2};
        int[] exceptedResult = {1, 2, 3, 4, 5};
        arrayService.sort(arr);
        utils.check(true, Arrays.toString(arr).equals(Arrays.toString(exceptedResult)));
    }
}
