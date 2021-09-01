package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Arrays;

public class ProcessingArrays {

    public static void main(String[] args) {

        int[] integerArray = {1, 2, 3, 4, 5};
        System.out.println("Boolean Array: " + Arrays.toString(integerArray));

        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = integerArray[i] * 1000;
        }
        //i = 0;
//        integerArray[0] = integerArray[0] * 1000;

        //i = 1
//        integerArray[1] = integerArray[1] * 1000;

        //i = 2
//        integerArray[2] = 3000;
//        integerArray[3] = 4000;
        //i = 4
//        integerArray[4] = 5000;
        //i = 5
        System.out.println("Boolean Array: " + Arrays.toString(integerArray));

        System.out.println(integerArray.length);

        for (int i = integerArray.length; i > 0; i--) {
            System.out.println(integerArray[i - 1]);
        }

    }
}
