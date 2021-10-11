package student_alberts_matrozis.lesson_7.level_6;

import java.util.Arrays;

import static student_alberts_matrozis.albertsUtils.Utils.*;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest testRunner = new ArrayCopyTest();
        testRunner.copyInRangeTest();
    }

    public void copyInRangeTest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayCopy subject = new ArrayCopy();
        int[] receivedResult = subject.copyInRange(arr, 3, 7);
        int[] exceptedResult = {3, 4, 5, 6, 7};
        checkArrays(receivedResult, exceptedResult);
    }
}
