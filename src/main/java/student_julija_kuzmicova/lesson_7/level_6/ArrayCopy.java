package student_julija_kuzmicova.lesson_7.level_6;

import java.util.Arrays;

//Task_12
class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        if(in == null) {
            return null;
        }

        int[] resultArray = new int[in.length];
        int size = 0;
        for(int i = 0; i < in.length; i++) {
            if(in[i] >= numberFrom && in[i] <= numberTo) {
                resultArray[size++] = in[i];
            }
        }
        return Arrays.copyOf(resultArray, size);
    }
}
