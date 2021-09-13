package student_ruslan_pankratov.lesson_7.level_6;

//Task_11
class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindromeTrueTest();
        palindromeTest.isPalindromeTrueFalse();
    }


    void isPalindromeTrueTest() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("LeVel");
        boolean expectedResult = true;

        method(result, expectedResult, "isPalindromeTrueTest");
    }

    void isPalindromeTrueFalse() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("Origami");
        boolean expectedResult = false;

        method(result, expectedResult, "isPalindromeTrueFalse");
    }


    void method(boolean result, boolean expectedResult, String name) {
        if (expectedResult == result) {
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = OK");
        }
    }
}
