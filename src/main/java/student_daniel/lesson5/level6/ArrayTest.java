package student_daniel.lesson5.level6;

class ArrayTest {
    //Task 34 35 36 37 38 39 40
    public static void main(String[] args) {
        ArrayTest test = new ArrayTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMixNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil myUtil = new ArrayUtil();
        int arrayLength = 10;
        int[] array = myUtil.createArray(arrayLength);
        int realResult = array.length;
        check(arrayLength, realResult, "Array created with length = " + arrayLength);
    }

    public void shouldFindMaxNumber() {
        ArrayUtil myUtil = new ArrayUtil();
        int[] myArray = {10, 30, 101, 1, 404, 50, 10};
        int expectedResult = 404;
        int realResult = myUtil.findMaxNumber(myArray);
        check(expectedResult, realResult, "Maximum number = " + realResult);
    }

    public void shouldFindMixNumber() {
        ArrayUtil myUtil = new ArrayUtil();
        int[] myArray = {10, 30, 101, 1, 404, 50, 10};
        int expectedResult = 1;
        int realResult = myUtil.findMinNumber(myArray);
        check(expectedResult, realResult, "Minimum number = " + realResult);
    }

    void check(int expectedResult, int realResult, String testName) {
        if(expectedResult == realResult) {
            System.out.println(testName + " - Test PASSED");
        } else {
            System.out.println(testName + " - Test FAILED");
        }
    }
}
