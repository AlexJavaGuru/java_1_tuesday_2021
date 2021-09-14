package student_ruslan_pankratov.lesson_6.level_3;

//Task_12-17
class ArrayService {


    boolean contains(int[] arr, int numberToSearch) {
        boolean indicator = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                indicator = true;
            }
        }
        return indicator;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                count ++;
            }
        }
        return count;
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
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count = count + 1;
            }
        }
        return count;
    }


    void revert(int[] arr) {
        int j = 0;
        for (int i = arr.length - 1; i > -1; i--) {

            if (arr.length / 2 - 1 == i) {
                break;
            }
            int a = arr[i];
            int b = arr[j];
            arr[j] = a;
            arr[i] = b;
            j++;

        }


    }

    void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    int a = arr[i];
                    int b = arr[j];

                    arr[i] = b;
                    arr[j] = a;
                }
            }


        }

    }


}
