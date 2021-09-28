package student_sergej_pereligin.lesson_6.level_3;

public class ArrayService {
    boolean checkForNumber(int[] array, int numberToSearch) {
        for (int value : array) {
            if (value == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int numberOfOccurrences(int[] array, int numberToCheck) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (numberToCheck == array[i]) {
                count++;
            }
        }
        return count;

    }

    boolean replaceFirstNumber(int[] array, int numberToReplace, int newNumber) { // 14
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        }
        return true;
    }

    int replaceAllSameNumbers(int[] array, int numberToReplace, int newNumber) { // 15
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
        return numberToReplace;
    }

    void revertArray(int[] array) { // 16
        System.out.print("[");
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
        System.out.println("]");
    }

    void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}



