package student_oleg_kozlov.lesson_7.level_6;

import java.util.Arrays;

// Task_12
class ArrayCopy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] result = new int[in.length];
        int newLength = 0;

        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                result[newLength++] = in[i];
            }
        }

        return (newLength > 0) ? Arrays.copyOf(result, newLength) : null;
    }
}
