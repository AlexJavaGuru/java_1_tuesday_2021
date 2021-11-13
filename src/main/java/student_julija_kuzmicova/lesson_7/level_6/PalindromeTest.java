package student_julija_kuzmicova.lesson_7.level_6;

//Task_11
class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    public static void main(String[] args) {

        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindromeEmptyStringTest();
        palindromeTest.isPalindromeWordTrueTest();
        palindromeTest.isPalindromeStringTrueTest();
        palindromeTest.isPalindromeFalseTest();
    }

    void isPalindromeEmptyStringTest() {
        String text = "";
        checkResult(false, palindrome.isPalindrome(text), "isPalindromeEmptyStringTest");
    }

    void isPalindromeWordTrueTest() {
        String text = "racecar";
        checkResult(true, palindrome.isPalindrome(text), "isPalindromeWordTrueTest");
    }

    void isPalindromeStringTrueTest() {
        String text = "А роза упала на лапу Азора";
        checkResult(true, palindrome.isPalindrome(text), "isPalindromeStringTrueTest");
    }

    void isPalindromeFalseTest() {
        String text = "palindrome";
        checkResult(false, palindrome.isPalindrome(text), "isPalindromeFalseTest");
    }

    void checkResult(boolean expectedResult, boolean actualResult, String testName){
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
