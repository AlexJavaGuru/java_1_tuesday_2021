package student_einars_marhilevics.lesson_7.level_6;

class ArrayCopy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int length = 0;
        for (int number : in) {
            if (number >= numberFrom && number <= numberTo) {
                length++;
            }
        }
        int[] copyArray = new int[length];
        int j = 0;
        for (int number : in) {
            if (number >= numberFrom && number <= numberTo) {
                copyArray[j] = number;
                j++;
            }
        }

        return copyArray;
    }
}



