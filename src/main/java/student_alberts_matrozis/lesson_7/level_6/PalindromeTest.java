package student_alberts_matrozis.lesson_7.level_6;

import static student_alberts_matrozis.albertsUtils.Utils.*;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest testRunner = new PalindromeTest();
        testRunner.test1();
        testRunner.test2();
    }

    public void test1() {
        Palindrome subject = new Palindrome();
        String word = "RaCeCaR";
        boolean exceptedResult = true;
        boolean receivedResult = subject.isPalindrome(word);
        check(exceptedResult, receivedResult);
    }

    public void test2() {
        Palindrome subject = new Palindrome();
        String word = "HellO";
        boolean exceptedResult = false;
        boolean receivedResult = subject.isPalindrome(word);
        check(exceptedResult, receivedResult);
    }
}
