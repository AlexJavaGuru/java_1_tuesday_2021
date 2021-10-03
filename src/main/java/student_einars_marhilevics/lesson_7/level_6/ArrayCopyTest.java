package student_einars_marhilevics.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.testOne();
        arrayCopyTest.testTwo();
    }
    void testOne() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedResult = {3, 4, 5, 6, 7, 8};
        int[] result = arrayCopy.copyInRange(array, 3, 8);
        check(Arrays.equals(result, expectedResult), "testOne");
    }
    void testTwo() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] expectedResult = {40};
        int[] result = arrayCopy.copyInRange(array, 31, 41);
        check(Arrays.equals(result, expectedResult), "testTwo");
    }
    void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
