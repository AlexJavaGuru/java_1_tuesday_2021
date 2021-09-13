package student_ruslan_pankratov.lesson_7.level_6;

//Task_12
class ArrayCopy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int size = 0;

        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom) {
                size++;
            } else if (in[i] <= numberTo) {
                size++;
            }
        }

        int[] result = new int[size];
        int filled = 0;

        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom) {
                result[filled] = in[i];
                filled++;
            } else if (in[i] <= numberTo) {
                result[filled] = in[i];
                filled++;
            }
        }

        return result;
    }
}