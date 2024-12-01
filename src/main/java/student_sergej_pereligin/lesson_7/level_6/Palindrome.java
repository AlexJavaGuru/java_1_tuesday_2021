package student_sergej_pereligin.lesson_7.level_6;


import java.util.Arrays;


public class Palindrome {

    public char[] splitTheString(String string) {
        return string.toCharArray();

    }


    public String removeSpecialCharacters(String string) {
        return string.replaceAll("[^a-zA-Z0-9]", "");
    }


    public boolean isPalindrome(String string) {

        Palindrome palindromeObj = new Palindrome();

        String newString = palindromeObj.removeSpecialCharacters(string);
        String newStringText = newString.toLowerCase();
        char[] newStringArray = palindromeObj.splitTheString(newStringText);

        System.out.println(Arrays.toString(newStringArray));

        for (int i = 0; i < newStringArray.length / 2; i++) {
            if (newStringArray[i] != newStringArray[newStringArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}





