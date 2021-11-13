package student_julija_kuzmicova.lesson_7.level_1;

import java.util.Arrays;

//Task_2, Task_3
class WordServiceTest {

    WordService wordService = new WordService();

    public static void main(String[] args) {

        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWordFirstWordTest();
        wordServiceTest.findMostFrequentWordTest();
        wordServiceTest.findMostFrequentWordEmptyTextTest();
        wordServiceTest.removePunctuationAndCaseTest();
        wordServiceTest.removeDuplicatesTest();
        wordServiceTest.removeEmptyStringsTest();
    }

    void findMostFrequentWordFirstWordTest() {
        String text = "String is an object that represents sequence of characters. In Java, String is represented by String class which is located into java.lang package.";
        checkResult("string", wordService.findMostFrequentWord(text), "findMostFrequentWordFirstWordTest");
    }

    void findMostFrequentWordTest() {
        String text = "String is an object that represents sequence of characters. In Java, String is represented by String class which is located into java.lang package. Is";
        checkResult("is", wordService.findMostFrequentWord(text), "findMostFrequentWordTest");
    }

    void findMostFrequentWordEmptyTextTest() {
        String text = "";
        checkResult("", wordService.findMostFrequentWord(text), "findMostFrequentWordEmptyTextTest");
    }

    void removePunctuationAndCaseTest() {
        String text = "String is an object that represents sequence of characters. In Java, String is represented by String class which is located into java.lang package.";
        String expectedResult = "string is an object that represents sequence of characters in java string is represented by string class which is located into javalang package";
        checkResult(expectedResult, wordService.removePunctuationAndCase(text), "removePunctuationAndCaseTest");
    }

    void removeDuplicatesTest() {
        String[] arr = {"string", "is", "represented", "by", "string", "class", "which", "is", "located", "into", "javalang", "package"};
        String[] expectedResult = {"string", "is", "represented", "by", null, "class", "which", null, "located", "into", "javalang", "package"};
        checkResult(expectedResult, wordService.removeDuplicates(arr), "removeDuplicatesTest");
    }

    void removeEmptyStringsTest() {
        String[] arr = {"string", "is", "represented", "by", "", "class", "which", "", "located", "into", "javalang", "package"};
        String[] expectedResult = {"string", "is", "represented", "by", null, "class", "which", null, "located", "into", "javalang", "package"};
        checkResult(expectedResult, wordService.removeEmptyStrings(arr), "removeEmptyStringsTest");
    }

    void checkResult(String expectedResult, String actualResult, String testName){
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(String[] expectedResult, String[] actualResult, String testName){
        int counter = 0;
        for(int i = 0; i < actualResult.length; i++) {
            if (expectedResult[i] == actualResult[i]) {
                counter++;
            }
        }
        if(counter == actualResult.length) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + Arrays.toString(expectedResult) + " but actual: " + Arrays.toString(actualResult));
        }
    }
}
