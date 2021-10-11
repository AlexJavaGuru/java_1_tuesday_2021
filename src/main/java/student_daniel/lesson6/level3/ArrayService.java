package student_daniel.lesson6.level3;

import java.util.Arrays;

public class ArrayService {
    //Task 12 13 14 15 16 17
    public boolean containNum(int[] numberArray, int numberToSearch) {
        boolean result = false;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == numberToSearch) {
                result = true;
            }
        }
        return result;
    }

    public int countOccurrences(int[] numberArray, int numberToSearch) {
        int result = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == numberToSearch) {
                result++;
            }
        }
        return result;
    }

    public boolean replaceFirst(int[] numberArray, int numberToReplace, int newNumber) {
        boolean result = false;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == numberToReplace) {
                numberArray[i] = newNumber;
                result = true;
            }
        }
        return result;
    }

    public int replaceAll(int[] numberArray, int numberToReplace, int newNumber) {
        int result = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == numberToReplace) {
                newNumber = numberToReplace + 1;
                result = newNumber;
            }
        }
        return result;
    }

    int[] revertArrey(int[] numberArray) {
        for (int i = 0; i < numberArray.length / 2; i++) {
            int temp = numberArray[i];
            numberArray[i] = numberArray[numberArray.length - 1 - i];
            numberArray[numberArray.length - 1 - i] = temp;
        }
        return numberArray;
    }

    int[] sortArray(int[] numberArray) {
        Arrays.sort(numberArray);
        return numberArray;
    }
}
