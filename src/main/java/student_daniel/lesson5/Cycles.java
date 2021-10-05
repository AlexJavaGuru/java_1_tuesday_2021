package student_daniel.lesson5;

import java.util.Arrays;

public class Cycles {
    public static void main(String[] args) {
        //while
        //for
        //do...while

        //iteration - one cycle execution
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i + ";");
        }

        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < 5; i++) {
            intArray[i] = intArray[i] * 1000;
        }
        System.out.println(Arrays.toString(intArray));

        //automatically gets length of Array, in our case 5 cells:  {1, 2, 3, 4, 5}
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = intArray[i] * 1000;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
