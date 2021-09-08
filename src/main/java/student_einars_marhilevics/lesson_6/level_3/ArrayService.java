package student_einars_marhilevics.lesson_6.level_3;

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
    int[] replaceAll(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
        return arr;
    }
    void revert(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
