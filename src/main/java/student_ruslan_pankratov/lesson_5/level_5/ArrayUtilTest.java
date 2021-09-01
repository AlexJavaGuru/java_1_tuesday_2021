package student_ruslan_pankratov.lesson_5.level_5;

//Task_31-38
class ArrayUtilTest {


    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] result = arrayUtil.createArray(10);
        int expectedResult = 10;

        if (result.length == expectedResult) {
            System.out.println("ShouldCreateArray test = OK");
        } else {
            System.out.println("ShouldCreateArray test = FAIL");
        }


    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] number = {1, 2, 3, 2, 700, 800, 1, 400, 6000, 34};
        int result = arrayUtil.findMaxNumber(number);
        int expectedResult = 6000;


        if (result == expectedResult) {
            System.out.println("ShouldFindMaxNumber test = OK");
        } else {
            System.out.println("ShouldFindMaxNumber test = FAIL");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] number = {1, 2, 3, 2, 700, 800, 1, 400, 6000, 34};
        int result = arrayUtil.findMinNumber(number);
        int expectedResult = 1;

        if (result == expectedResult) {
            System.out.println("ShouldFindMinNumber test = OK");
        } else {
            System.out.println("ShouldFindMinNumber test = FAIL");
        }
    }

}