package student_daniel.lesson7.level6;

import java.util.Objects;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest myTest = new PalindromeTest();
        myTest.testPalindromeLevel();
        myTest.testPalindromeRacecar();
        myTest.testPalindromeSummus();
        myTest.testPalindromeEye();
        myTest.testPalindromeCyrillic();
        myTest.testPalindromeCamel();
        myTest.testPalindromeDigits();
        myTest.testPalindromeSpecial();
        myTest.testPalindromeFalse();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    Palindrome myPalindrome = new Palindrome();

    //Tests
    void testPalindromeLevel() {
        String theString = "level";
        boolean expectedResult = true;
        boolean actualResult = myPalindrome.isPalindrome(theString);
        check(expectedResult, actualResult, theString + " is Palindrome: " + actualResult);
    }

    void testPalindromeRacecar() {
        String theString = "racecar";
        boolean expectedResult = true;
        boolean actualResult = myPalindrome.isPalindrome(theString);
        check(expectedResult, actualResult, theString + " is Palindrome: " + actualResult);
    }

    void testPalindromeSummus() {
        String theString = "sum summus mus";
        boolean expectedResult = true;
        boolean actualResult = myPalindrome.isPalindrome(theString);
        check(expectedResult, actualResult, theString + " is Palindrome: " + actualResult);
    }

    void testPalindromeEye() {
        String theString = "Eye";
        boolean expectedResult = true;
        boolean actualResult = myPalindrome.isPalindrome(theString);
        check(expectedResult, actualResult, theString + " is Palindrome: " + actualResult);
    }

    void testPalindromeCyrillic() {
        String theString = "А роза упала на лапу Азора";
        boolean expectedResult = true;
        boolean actualResult = myPalindrome.isPalindrome(theString);
        check(expectedResult, actualResult, theString + " is Palindrome: " + actualResult);
    }

    void testPalindromeCamel() {
        String theString = "sum sumMus mUs";
        boolean expectedResult = true;
        boolean actualResult = myPalindrome.isPalindrome(theString);
        check(expectedResult, actualResult, theString + " is Palindrome: " + actualResult);
    }

    void testPalindromeDigits() {
        String theString = "123 321";
        boolean expectedResult = true;
        boolean actualResult = myPalindrome.isPalindrome(theString);
        check(expectedResult, actualResult, theString + " is Palindrome: " + actualResult);
    }

    void testPalindromeSpecial() {
        String theString = "!@#$%^&*()_+ +_)(*&^%$#@!";
        boolean expectedResult = true;
        boolean actualResult = myPalindrome.isPalindrome(theString);
        check(expectedResult, actualResult, theString + " is Palindrome: " + actualResult);
    }

    void testPalindromeFalse() {
        String theString = "something else";
        boolean expectedResult = false;
        boolean actualResult = myPalindrome.isPalindrome(theString);
        check(expectedResult, actualResult, theString + " is Palindrome: " + actualResult);
    }

    void check(boolean expectedResult, boolean actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }
}
