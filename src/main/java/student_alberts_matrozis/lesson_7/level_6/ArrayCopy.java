package student_alberts_matrozis.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopy {
    public int[] copyInRange(int[] arr, int numberFrom, int numberTo) {
        int i = 0;
        int[] newArr = new int[arr.length];

        for (int el : arr) {
            if (el >= numberFrom && el <= numberTo) {
                newArr[i] = el;
                i++;
            }
        }
        int[] result = Arrays.copyOf(newArr, i);
        return result;
    }
}
