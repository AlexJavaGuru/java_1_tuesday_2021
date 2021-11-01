package student_josifs_makarenko.lesson_6.level3;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest.containsTest1();
        ArrayServiceTest.containsTest2();
        ArrayServiceTest.countOccurrencesTest1();
        ArrayServiceTest.countOccurrencesTest2();
        ArrayServiceTest.replaceFirstTest1();
        ArrayServiceTest.replaceFirstTest2();
        ArrayServiceTest.replaceAllTest1();
        ArrayServiceTest.replaceAllTest2();
        ArrayServiceTest.revertTest();
        ArrayServiceTest.sortTest();
    }

    public static void containsTest1() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3};
        check(arrayService.contains(array, 3), "containsTest");
    }

    public static void containsTest2() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3};
        check(!arrayService.contains(array, 4), "containsTest");
    }

    public static void countOccurrencesTest1() {
        ArrayService arrayService = new ArrayService();
       int[] array = {1, 1, 1, 1};
       check(arrayService.countOccurrences(array, 1) == 4, "countOccurrencesTest");
    }

    public static void countOccurrencesTest2() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 1, 1, 1};
        check(arrayService.countOccurrences(array, 6) == 0, "countOccurrencesTest");
    }

    public static void  replaceFirstTest1() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 1, 1, 1};
        check(arrayService.replaceFirst(array, 1,5), "replaceFirstTest");
    }

    public static void  replaceFirstTest2() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 1, 1, 1};
        check(!arrayService.replaceFirst(array, 3,5), "replaceFirstTest");
    }

    public static void replaceAllTest1() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 1, 3, 1};
        int[] expectedArray = {5, 5, 3, 5};
        int[] realArray = arrayService.replaceAll(array, 1, 5);
        check(checkArrays(expectedArray, realArray), "replaceFirstTest");
    }

    public static void replaceAllTest2() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 1, 1};
        int[] expectedArray = {1, 2, 1, 1};
        int[] realArray = arrayService.replaceAll(array, 5, 6);
        check(checkArrays(expectedArray, realArray), "replaceFirstTest");
    }

    public static void revertTest() {
        ArrayService arrayService = new ArrayService();
        int[] expectedArray = {5, 4, 4, 2, 2, 1};
        int[] realArray = {1, 2, 2, 4, 4, 5};
        arrayService.revert(realArray);
        check(checkArrays(expectedArray, realArray), "revertTest");
    }

    public static void sortTest() {
        ArrayService arrayService = new ArrayService();
        int[] expectedArray = {1, 2, 4, 7, 10};
        int[] realArray = {7, 4, 10, 2, 1};
        arrayService.sort(realArray);
        check(checkArrays(realArray, expectedArray), "sortTest");
    }

    public static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER! ");
        }
    }

    public static boolean checkArrays (int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    }
}
