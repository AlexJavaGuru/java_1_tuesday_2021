package student_einars_marhilevics.lesson_5.level_5;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumberOne();
        test.shouldFindMaxNumberTwo();
        test.shouldFindMinNumberOne();
        test.shouldFindMinNumberTwo();
    }

    public void shouldCreateArray() {
        int arrayLength = 3;
        int[] numbers = new int[3];
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedResult = numbers.length;
        int realResult = arrayUtil.createArray(arrayLength).length;
        if (expectedResult == realResult) {
            System.out.println("Test shouldCreateArray is OK");
        } else {
            System.out.println("Test shouldCreateArray failed");
        }
    }

    public void shouldFindMaxNumberOne() {
        int[] array = {1, 3, 9, 6};
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedResult = 9;
        int realResult = arrayUtil.findMaxNumber(array);
        if (expectedResult == realResult) {
            System.out.println("Test shouldFindMaxNumberOne is OK");
        } else {
            System.out.println("Test shouldFindMaxNumberOne failed");
        }
    }

    public void shouldFindMaxNumberTwo() {
        int[] array = {-1, -3, -9, -6};
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedResult = -1;
        int realResult = arrayUtil.findMaxNumber(array);
        if (expectedResult == realResult) {
            System.out.println("Test shouldFindMaxNumberTwo is OK");
        } else {
            System.out.println("Test shouldFindMaxNumberTwo failed");
        }
    }

    public void shouldFindMinNumberOne() {
        int[] array = {1, 3, 9, 6};
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedResult = 1;
        int realResult = arrayUtil.findMinNumber(array);
        if (expectedResult == realResult) {
            System.out.println("Test shouldFindMinNumberOne is OK");
        } else {
            System.out.println("Test shouldFindMinNumberOne failed");
        }
    }

    public void shouldFindMinNumberTwo() {
        int[] array = {-1, -3, -9, -6};
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedResult = -9;
        int realResult = arrayUtil.findMinNumber(array);
        if (expectedResult == realResult) {
            System.out.println("Test shouldFindMinNumberTwo is OK");
        } else {
            System.out.println("Test shouldFindMinNumberTwo failed");
        }
    }
}
