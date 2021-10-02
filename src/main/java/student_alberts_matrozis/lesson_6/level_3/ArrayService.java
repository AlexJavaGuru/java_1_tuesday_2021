package student_alberts_matrozis.lesson_6.level_3;

class ArrayService {
    public boolean contains(int[] arr, int number) {
        for (int arrNum : arr) {
            if (arrNum == number) {
                return true;
            }
        }
        return false;
    }

    public int countOccurrences(int[] arr, int number) {
        int count = 0;
        for (int arrNum : arr) {
            if (arrNum == number) {
                count++;
            }
        }
        return count;
    }

    public int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count++;
            }
        }
        return count;
    }

    public boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                result = true;
                break;
            }
        }
        return result;
    }

    public void revert(int[] arr) {
        int[] arr2 = new int[arr.length];

        int i = arr.length - 1;
        for (int num : arr) {
            arr2[i] = num;
            i--;
        }

        int j = 0;
        for (int num : arr2) {
            arr[j] = num;
            j++;
        }
    }

    public void sort(int[] arr) { // Bubble sort algorithm
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
