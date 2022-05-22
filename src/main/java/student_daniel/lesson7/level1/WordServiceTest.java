package student_daniel.lesson7.level1;

import java.util.Arrays;
import java.util.Objects;

public class WordServiceTest {
    //Task 1 2 3
    public static void main(String[] args) {
        WordServiceTest myServiceTest = new WordServiceTest();
        myServiceTest.mostUsedWord();
        myServiceTest.toLowerCase();
        myServiceTest.splitString();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    WordService myService = new WordService();

    void mostUsedWord() {
        String text = "Bla bla ka Ka kA KA ka";
        String expectedResult = "ka";
        String actualResult = myService.findMostFrequentWord(text);
        check(expectedResult, actualResult, "Most frequent word is: " + actualResult);
    }

    void toLowerCase() {
        String text = "Bla bla ka Ka kA KA ka";
        String expectedResult = "bla bla ka ka ka ka ka";
        String actualResult = text.toLowerCase();
        check(expectedResult, actualResult, "All text is converted to lower case: " + actualResult);
    }

    void splitString() {
        String text = "Bla bla ka Ka kA KA ka";
        String[] expectedResult = {"Bla", "bla", "ka", "Ka", "kA", "KA", "ka"};
        String[] actualResult = text.split(" ");
        check(expectedResult, actualResult, "String is converted to Array of words: " + Arrays.toString(actualResult));
    }

    void check(String expectedResult, String actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName);
        }
    }

    void check(String[] expectedResult, String[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName);
        }
    }
}