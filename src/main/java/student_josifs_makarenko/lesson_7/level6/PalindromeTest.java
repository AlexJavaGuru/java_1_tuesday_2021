package student_josifs_makarenko.lesson_7.level6;
//task_11
public class PalindromeTest {
    public static void main(String[] args) {
        isPalindromeTestIfTrue();
        isPalindromeTestIfFalse();
    }

    static void isPalindromeTestIfTrue() {
        Palindrome palindrome = new Palindrome();
        String text = "tattarrattat";
        check(palindrome.isPalindrome(text), "isPalindromeTestIfTrue");
    }

    static void isPalindromeTestIfFalse() {
        Palindrome palindrome = new Palindrome();
        String text = "Hello my name is Josif";
        check(!palindrome.isPalindrome(text), "isPalindromeTestIfFalse");
    }

    public static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER! ");
        }
    }
}
