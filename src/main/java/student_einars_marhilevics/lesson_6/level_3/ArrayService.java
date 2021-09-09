package student_einars_marhilevics.lesson_6.level_3;

import java.util.Arrays;

class ArrayService {
    boolean containsNumber(int[] array, int numberToSearch) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                result = true;
            }
        }
        return result;
    }
    int countOccurrences(int[] arr, int numberToSearch) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                counter++;
            }
        }
        return counter;
    }
    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                result = true;
            }
        }
        return result;
    }
    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                counter++;
            }
        }
        return counter;
    }
    void revert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
    void sort(int[] arr) {
        Arrays.sort(arr);
    }
}

