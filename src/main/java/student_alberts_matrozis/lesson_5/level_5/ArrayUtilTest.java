package student_alberts_matrozis.lesson_5.level_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        // Напишите реализацию !!!
        // Проверьте, что метод создаёт массив указанной длины
        ArrayUtil subject = new ArrayUtil();
        int[] arr = subject.createArray(5);
        int[] arr2 = subject.createArray(88);
        check(arr.length, 5);
        check(arr2.length, 88);
    }

    public void shouldFindMaxNumber() {
        ArrayUtil subject = new ArrayUtil();
        int[] arr = {1, 2, 5, 3, 4};
        int result = subject.findMaxNumber(arr);
        check(5, result);
    }

    public void shouldFindMinNumber() {
        ArrayUtil subject = new ArrayUtil();
        int[] arr = {7, 9, 5, 3, 4};
        int result = subject.findMinNumber(arr);
        check(3, result);
    }

    // Check
    public void check(int actualResult, int receivedResult) {
        if (actualResult == receivedResult) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

}