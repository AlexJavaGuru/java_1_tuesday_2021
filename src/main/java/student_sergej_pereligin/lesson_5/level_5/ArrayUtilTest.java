package student_sergej_pereligin.lesson_5.level_5;
/*Создайте класс ArrayUtilTest.
    В этом классе напишите автоматический тест
    для метода int[] createArray(int arrayLength)
    из предыдущего задания.

    class ArrayUtilTest {

        public static void main(String[] args) {
            ArrayUtilTest test = new ArrayUtilTest();
            test.shouldCreateArray();
        }

        public void shouldCreateArray() {
            // Напишите реализацию !!!
            // Проверьте, что метод создаёт массив указанной длины
        }

    }*/
public class ArrayUtilTest {
    public static void main(String[] args) {
       ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {

        int[] resultArray = new int[4];
        int expectedResult = 4;
        int actualResult = resultArray.length;
        check(expectedResult, actualResult, "Should create array ");
    }

    private void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " failed");

        }
    }
}
