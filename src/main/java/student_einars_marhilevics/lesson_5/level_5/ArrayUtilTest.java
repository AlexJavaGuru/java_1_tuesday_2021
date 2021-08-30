package student_einars_marhilevics.lesson_5.level_5;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
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
    public void shouldFindMaxNumber() {
        int[] array = {1, 3, 9, 6};
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedResult = 9;
        int realResult = arrayUtil.findMaxNumber(array);
        if (expectedResult == realResult) {
            System.out.println("Test shouldFindMaxNumber is OK");
        } else {
            System.out.println("Test shouldFindMaxNumber failed");
        }
    }
    public void shouldFindMinNumber() {
        int[] array = {1, 3, 9, 6};
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedResult = 1;
        int realResult = arrayUtil.findMinNumber(array);
        if (expectedResult == realResult) {
            System.out.println("Test shouldFindMinNumber is OK");
        } else {
            System.out.println("Test shouldFindMinNumber failed");
        }
    }
}
