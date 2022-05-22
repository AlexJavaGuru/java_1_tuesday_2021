package student_daniel.lesson7.level6;

import java.util.Arrays;

public class ArrayCopy {
    //Task 12
    public int[] copyInRange(int[] firstArray, int numberFrom, int numberTo) {
        Arrays. sort(firstArray);
        int[] secondArray = new int[firstArray.length];
        int lengthCount = 0;

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] >= numberFrom && firstArray[i] <= numberTo) {
                secondArray[lengthCount++] = firstArray[i];
            }
        }
        if (numberFrom > numberTo) {
            for (int i = firstArray.length-1; i >= 0; i--) {
                if (firstArray[i] <= numberFrom && firstArray[i] >= numberTo) {
                    secondArray[lengthCount++] = firstArray[i];
                }
            }
        }
        return Arrays.copyOf(secondArray, lengthCount);
    }
}

