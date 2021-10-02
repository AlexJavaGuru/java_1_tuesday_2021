package student_sergej_pereligin.lesson_6.level_3;


public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.checkForNumberTest();
        arrayServiceTest.numberOfOccurrencesTest();
        arrayServiceTest.replaceFirstNumberTest();
        arrayServiceTest.replaceAllSameNumbersTest();
        arrayServiceTest.revertArrayTest();
        arrayServiceTest.sortArrayTest();
    }

    void checkForNumberTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = {3, 6, 9, 12};
        boolean expectedResult = true;
        boolean actualResult = arrayService.checkForNumber(testArray, 6);
        checkResults(true, "checkForNumberTest");

    }

    void numberOfOccurrencesTest() {
        ArrayService arrayService = new ArrayService();
        int[] nextTestArray = {1, 1, 1, 2, 3, 3, 3, 3, 3, 4, 5, 6, 6, 6};
        int result = arrayService.numberOfOccurrences(nextTestArray, 1);
        checkResults(result == 3, "numberOfOccurrencesTest");
    }

    void replaceFirstNumberTest() {
        ArrayService arrayService = new ArrayService();
        int[] newArray = {1, 1, 1, 1, 2, 2, 3, 4, 5, 5};
        boolean result = arrayService.replaceFirstNumber(newArray, 1, 9);
        checkResults(true, "replaceFirstNumberTest");
    }

    void replaceAllSameNumbersTest(){
        ArrayService arrayService = new ArrayService();
        int[] newArray = {1, 1, 1, 1, 2, 2, 3, 4, 5, 5};
        int result = arrayService.replaceAllSameNumbers(newArray, 1,7);
        checkResults(result == 1, "replaceAllSameNumbersTest");
    }

    void revertArrayTest(){
        ArrayService arrayService = new ArrayService();
        int[] newArray = {1, 1, 1, 1, 2, 2, 3, 4, 5, 5};
        arrayService.revertArray(newArray);
        checkResults(true, "revertArrayTest");
    }

    void sortArrayTest(){
        ArrayService arrayService = new ArrayService();
        int[] newArray = {7, 1, 9, 1, 2, 2, 3, 4, 5, 5};
        arrayService.sortArray(newArray);
        checkResults(true, "sortArrayTest");
    }


    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println("Test " + testName + " passed!");
        } else {
            System.out.println("Teast " + testName + " failed!");
        }
    }


}
