package student_daniel.lesson5;

import java.util.Arrays;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil newArray = new ArrayUtil();

        int[] customArray = newArray.createArray(10);
        System.out.println(Arrays.toString(customArray));

        newArray.fillRandom(customArray);
        System.out.println(Arrays.toString(customArray));

        newArray.maxNumber(customArray);
    }
}
