package student_einars_marhilevics.lesson_5.level_5;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }
    public void shouldCreateArray() {
        int arrayLength = 3;
        int[] numbers = new int[3];
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedResult = numbers.length;
        int realResult = arrayUtil.createArray(arrayLength).length;
        if (expectedResult == realResult) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test failed");
        }

        // Напишите реализацию !!!
        // Проверьте, что метод создаёт массив указанной длины
    }
}
