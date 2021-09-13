package student_ruslan_pankratov.lesson_7.level_1;
//Task_1-5

import java.util.Arrays;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordService = new WordServiceTest();
        wordService.delimiterArrTest();
        wordService.countTest();
        wordService.findMostFrequentWordTest();
    }

    void delimiterArrTest() {
        String arr = "cat dog cat dog";
        String[] result = WordService.delimiter(arr);
        String[] expectedResult = {"cat", "dog", "cat", "dog"};

        if (Arrays.equals(result, expectedResult)) {
            System.out.println("Test delimiterArr = OK");
        } else {
            System.out.println("Test delimiterArr = FAIl");
        }
    }

    void countTest() {
        String arr = "cat dog cat dog";
        String result = WordService.findMostFrequentWord(arr);
        String expectedResult = "cat = 2";

        if (result.equals(expectedResult)) {
            System.out.println("Test countTest = Ok");
        } else {
            System.out.println("Test countTest = FAIL");
        }
    }

    void findMostFrequentWordTest() {
        String arr = "cat dog cat dog";
        String result = WordService.findMostFrequentWord(arr);
        String expectedResult = "cat = 2";

        if (result.equals(expectedResult)) {
            System.out.println("Test findMostFrequentWordTest = Ok");
        } else {
            System.out.println("Test findMostFrequentWordTest = FAIL");
        }

    }
}
