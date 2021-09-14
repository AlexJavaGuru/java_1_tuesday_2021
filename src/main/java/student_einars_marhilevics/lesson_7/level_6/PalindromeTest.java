package student_einars_marhilevics.lesson_7.level_6;

import java.util.Arrays;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.testOne();
        palindromeTest.testTwo();
        palindromeTest.testThree();
        palindromeTest.testFour();
        palindromeTest.testFalse();
    }
    void testOne() {
        Palindrome palindrome = new Palindrome();
        String text = "racecar";
        boolean result = palindrome.isPalindrome(text);
        check(result, "testOne");
    }
    void testTwo() {
        Palindrome palindrome = new Palindrome();
        String text = "lEveL";
        boolean result = palindrome.isPalindrome(text);
        check(result, "testTwo");
    }
    void testThree() {
        Palindrome palindrome = new Palindrome();
        String text = "sum summus mus";
        boolean result = palindrome.isPalindrome(text);
        check(result, "testThree");
    }
    void testFour() {
        Palindrome palindrome = new Palindrome();
        String text = "А роза упала на лапу Азора";
        boolean result = palindrome.isPalindrome(text);
        check(result, "testFour");
    }
    void testFalse() {
        Palindrome palindrome = new Palindrome();
        String text = "abcdefghgfedcb";
        boolean result = palindrome.isPalindrome(text);
        check(!result, "testFalse");
    }
    void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
