package student_einars_marhilevics.lesson_6.level_3;

class ArrayService {
    public boolean containsNumber(int[] array, int numberToSearch) {
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
                result = true;
            }
        }
        return result;
    }
}
