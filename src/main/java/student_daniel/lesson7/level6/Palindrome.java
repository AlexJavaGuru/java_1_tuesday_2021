package student_daniel.lesson7.level6;

public class Palindrome {
    //Task 11
    public boolean isPalindrome(String text) {
        String lowerText = text.toLowerCase();
        String stringText = lowerText.replaceAll("[^a-zA-Zа-яА-Я-0-9-!@#$%^&*(),.?\":{}|<>]", "");
        char[] textArray = stringText.toCharArray();
        char[] reverseTextArray = new char[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            reverseTextArray[i] = textArray[textArray.length - i - 1];
        }
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] != reverseTextArray[i]) {
                return false;
            }
        }
        return true;
    }
}
