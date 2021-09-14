package student_josifs_makarenko.lesson_6.level3;

public class ArrayService {

    boolean contains(int[] array, int number) {
        boolean result = false;
        for (int j : array) {
            if (j != number) {
                continue;
            }
            result = true;
        }
        return result;
    }

    int countOccurrences(int[] array, int numberToSearch) {
        int numberOfRepeat = 0;
        for (int j : array) {
            if (j != numberToSearch) {
                continue;
            }
            numberOfRepeat++;
        }
        return numberOfRepeat;
    }

    boolean replaceFirst(int[] array, int numberToReplace, int newNumber) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                result = true;
                break;
            }
        }
        return result;
    }

    int[] replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != numberToReplace) {
                continue;
            }
            array[i] = newNumber;
        }
        return array;
    }

    void revert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    void sort(int[] array) {
        int j = 0;
        int temp;
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        swapped = true;
                }
            }
        }
    }
}