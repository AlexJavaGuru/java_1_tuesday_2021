package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Arrays;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myCustomArray = arrayUtil.createArray(10);
        System.out.println(Arrays.toString(myCustomArray));

        arrayUtil.fillArrayWithRandom(myCustomArray);
        System.out.println(Arrays.toString(myCustomArray));

        int[] copiedArray = arrayUtil.copyArray(myCustomArray);

        System.out.println(Arrays.toString(myCustomArray));
        System.out.println(Arrays.toString(copiedArray));
    }
}
