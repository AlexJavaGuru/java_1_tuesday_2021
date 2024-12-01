package student_sergej_pereligin.lesson_7.level_6;


public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindromeTest();
        palindromeTest.isPalindromeNegTest();

    }

    public void isPalindromeTest(){
        Palindrome newPalindrome = new Palindrome();

        String testString = "murder, for! a * jar of red rum";

        boolean expectedResult = true;
        boolean actualResult = newPalindrome.isPalindrome(testString);
        checkResult(expectedResult,actualResult,"PALINDROME TEST");

    }

    public void isPalindromeNegTest(){
        Palindrome newPalindrome = new Palindrome();

        String testString = "murder, for! a * jar of red rum of rums";

        boolean expectedResult = false;
        boolean actualResult = newPalindrome.isPalindrome(testString);
        checkResult(expectedResult,actualResult,"PALINDROME NEGATIVE TEST");

    }


    public void checkResult(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " PASSED");
        } else  {
            System.out.println(testName + "FAILED");
        }
    }


}
