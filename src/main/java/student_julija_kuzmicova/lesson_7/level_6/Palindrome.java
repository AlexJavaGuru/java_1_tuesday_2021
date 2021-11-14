package student_julija_kuzmicova.lesson_7.level_6;

import java.util.Locale;

//Task_11
class Palindrome {

    boolean isPalindrome(String text) {
        if(text.isBlank()) {
            return false;
        }

        text = text.toLowerCase(Locale.ROOT).replaceAll("[.,:;!? ]","");
        String[] letter = text.split("");

        int j = letter.length - 1;
        for(int i = 0; i < j; i++) {
            if (!letter[i].equals(letter[j])) {
                return false;
            }
            j--;
        }
        return true;
    }

}
