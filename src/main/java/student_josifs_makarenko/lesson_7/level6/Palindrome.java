package student_josifs_makarenko.lesson_7.level6;


import java.util.Arrays;
//task_11
public class Palindrome {

    boolean isPalindrome(String text) {
        boolean result = false;
        char[] textArray = transformToArray(text);
        char[] reverseTextArray = revertArray(text);
        if (checkArrays(textArray, reverseTextArray)) {
            result = true;
        }
        return result;
    }

    char[] transformToArray(String text) {
       String textTemp =  (text.replaceAll("[^a-zA-Zа-яА-Я]", "")).toLowerCase();
        return textTemp.toCharArray();
    }

    char[] revertArray(String text) {
        char[] charArray = transformToArray(text);
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }
        return charArray;
    }

    boolean checkArrays (char[] firstArray, char[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    }
}