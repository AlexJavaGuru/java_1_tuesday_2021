package student_daniel.lesson5.level5;

class ArrayTest {
    //Task 31 32 33
    public static void main(String[] args) {
        ArrayTest test = new ArrayTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        ArrayUtil myUtil = new ArrayUtil();
        int arrayLength = 10;
        int[] array = myUtil.createArray(arrayLength);
        int realResult = array.length;
        check(arrayLength, realResult, "Array created with length = " + arrayLength);
    }

    void check(int expectedResult, int realResult, String testName) {
        if(expectedResult == realResult) {
            System.out.println(testName + " - Test PASSED");
        } else {
            System.out.println(testName + " - Test FAILED");
        }
    }
}
