package student_einars_marhilevics.lesson_7.level_6;

import java.util.Objects;

class Palindrome {
    boolean isPalindrome(String text) {
        String myText = text.replace(" ", "");
        String[] palindrome = myText.toLowerCase().split("");
        for (int i = 0; i < palindrome.length / 2; ++i) {
            if (!Objects.equals(palindrome[i], palindrome[palindrome.length - i - 1])) {
                return false;
            }
        }


        return true;
    }
}
