package student_julija_kuzmicova.lesson_6.level_3;

//Task_12, Task_13, Task_14, Task_15, Task_16, Task_17
class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        for(int number : arr) {
            if(numberToSearch == number) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int counter = 0;
        for(int number : arr) {
            if(numberToSearch == number) {
                counter++;
            }
        }
        return counter;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int counter = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == numberToReplace) {
                arr[i] = newNumber;
                counter++;
            }
        }
        return counter;
    }

    void revert(int[] arr) {
        int j = arr.length -1;
        int number = 0;
        for(int i = 0; i < j ; i++) {
            number = arr[i];
            arr[i] = arr[j];
            arr[j] = number;
            j--;
        }
    }

    void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                int number = 0;
                if(arr[i]>arr[j]) {
                    number = arr[i];
                    arr[i] = arr[j];
                    arr[j] = number;
                }
            }
        }
    }
}
