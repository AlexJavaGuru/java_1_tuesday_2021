package student_olga_urek.Lesson_5.level_5;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int arrayLength = 5;
        int expectedLength = 5;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(arrayLength);
        if (myArray.length == expectedLength) {
            System.out.println("test.shouldCreateArray is OK");
        } else {
            System.out.println("test.shouldCreateArray failed");
        }
    }
    public void shouldFindMaxNumber() {
        int[] myArray = {5,6,7,10,3};
        int expectedMax = 10;
        ArrayUtil arrayUtil = new ArrayUtil();
        int actualMax = arrayUtil.findMaxNumber(myArray);
        if (expectedMax == actualMax) {
            System.out.println("test.shouldFindMaxNumber is OK");
        } else {
            System.out.println("test.shouldFindMaxNumber failed");
        }
    }
    public void shouldFindMinNumber() {
        int[] myArray = {5,6,1,7,10};
        int expectedMin = 1;
        ArrayUtil arrayUtil = new ArrayUtil();
        int actualMin = arrayUtil.findMinNumber(myArray);
        if (expectedMin == actualMin) {
            System.out.println("test.shouldFindMinNumber is OK");
        } else {
            System.out.println("test.shouldFindMinNumber failed");
        }
    }
}
