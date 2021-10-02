package student_alberts_matrozis.lesson_7.level_6;

import static student_alberts_matrozis.albertsUtils.ArrayUtil.reverseArray;

class Palindrome {
 public boolean isPalindrome(String text) {
     String[] letters =  text.toLowerCase().split("");
     String[] lettersReverse = text.toLowerCase().split("");;
     reverseArray(lettersReverse);

     for (int i = 0; i < letters.length; i++) {
         if (!letters[i].equals(lettersReverse[i])) {
             return false;
         }
     }
     return true;
 }
}
