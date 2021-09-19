package student_sergej_pereligin.lesson_5.level_6;


/*В классе ArrayUtilTest напишите автоматический тест
для метода int findMaxNumber(int[] array)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        // Напишите реализацию !!!
    }

    public void shouldFindMaxNumber() {
        // Напишите реализацию !!!
    }
}*/
class ArrayUtilTest {
    public static void main(String[] args) {
      ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {

        int[] resultArray = new int[4];
        int expectedResult = 4;
        int actualResult = resultArray.length;
        check(expectedResult, actualResult, "Should create array");
    }

    public void shouldFindMaxNumber() {
       ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {34,75,15,24};
        int expectedResult = array[1];
        int actualResult = arrayUtil.findMaxNumber(array);
        check(expectedResult,actualResult,"Find max ");

    }
    public void shouldFindMinNumber() {
      ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {34,75,15,24};
        int expectedResult = array[2];
        int actualResult = arrayUtil.findMinNumber(array);
        check(expectedResult,actualResult,"Find min ");

    }


    private void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " failed");
        }
    }
}

