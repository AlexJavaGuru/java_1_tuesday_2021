package student_josifs_makarenko.lesson_5.level5;

import java.util.Arrays;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int i = 5;
        int[] array = arrayUtil.createArray(i);
        int realResult = array.length;
        check(i, realResult, "shouldCreateArray");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] myArray = {0,5,10,20,40};
        int max = 40;
        int result = arrayUtil.findMaxNumber(myArray);
        check(max, result, "shouldFindMaxNumber");
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] myArray = {0,5,10,20,40};
        int min = 0;
        int result = arrayUtil.findMinNumber(myArray);
        check(min, result, "shouldFindMaxNumber");
    }

    public void check (int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult)  {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " != OK " + realResult);
        }
    }
}
