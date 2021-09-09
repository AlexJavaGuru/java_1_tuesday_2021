package student_einars_marhilevics.lesson_6.level_3;


import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.containsNumberTrue();
        test.containsNumberFalse();
        test.countOccurrencesTrue();
        test.countOccurrencesFalse();
        test.replaceFirstTrue();
        test.replaceFirstFalse();
        test.replaceAllTrue();
        test.replaceAllFalse();
        test.revert();
        test.sort();
    }




    void containsNumberTrue() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 10, 20, -10, -20};
        boolean result = arrayService.containsNumber(array, 10);
        check(result == true, "containsNumberTrue");
    }
    void containsNumberFalse() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 10, 20, -10, -20};
        boolean result = arrayService.containsNumber(array, 5);
        check(result == false, "containsNumberFalse");
    }
    void countOccurrencesFalse() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 10, 20, -10, -20, 10, 10};
        int result = arrayService.countOccurrences(array, 10);
        check(result == 3, "countOccurrencesTrue");
    }
    void countOccurrencesTrue() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 10, 20, -10, -20, 10, 10};
        int result = arrayService.countOccurrences(array, 5);
        check(result == 0, "countOccurrencesFalse");
    }
    void replaceFirstTrue() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 10, 20, -10, -20};
        boolean result = arrayService.replaceFirst(array, 1, 2);
        check(result == true, "replaceFirstTrue");
    }
    void replaceFirstFalse() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 10, 20, -10, -20};
        boolean result = arrayService.replaceFirst(array, 11, 2);
        check(result == false, "replaceFirstFalse");
    }
    void replaceAllTrue() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 10, 20, -10, -20, 20, 20};
        int result = arrayService.replaceAll(array, 20, 50);
        check(result == 3, "replaceAllTrue");
    }
    void replaceAllFalse() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 10, 20, -10, -20, 20, 20};
        int result = arrayService.replaceAll(array, 30, 50);
        check(result == 0, "replaceAllFalse");
    }
    void revert() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        arrayService.revert(array);
        int[] expectedResult = {5, 4, 3, 2, 1};
        check(Arrays.equals(array,expectedResult), "revert");
    }
    void sort() {
        ArrayService arrayService = new ArrayService();
        int[] array = {5, 2, 1, 4, 3};
        arrayService.sort(array);
        int[] expectedResult = {1, 2, 3, 4, 5};
        check(Arrays.equals(array,expectedResult), "sort");
    }
    void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
