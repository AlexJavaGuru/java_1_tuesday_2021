package student_ruslan_pankratov.lesson_7.level_6;

import java.util.Arrays;

//Task_11
class Palindrome {

    boolean isPalindrome(String text) {
        String result = text;
        String[] palindrome = delimiter(text);
        String[] resultString = result.split("");
        String strPalindrome = String.join("", palindrome);
        String strResult = String.join("", resultString);

        if (strResult.equalsIgnoreCase(strPalindrome)) {
            return true;
        }
        return false;
    }

    String[] delimiter(String text) {
        String[] arr = text.split("");
        int last = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            String firstString = arr[i];
            String lastString = arr[last];
            arr[i] = lastString;
            arr[last] = firstString;
            last--;

            if (i == arr.length / 2 - 1) {
                break;
            }

        }
        return arr;
    }


}
