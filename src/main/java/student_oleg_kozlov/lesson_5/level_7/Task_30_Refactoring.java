package student_oleg_kozlov.lesson_5.level_7;

import student_oleg_kozlov.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Random;

// Task_41
class Task_30_Refactoring {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = arrayUtil.createArray(5);

        arrayUtil.fillArrayWithRandomNumbers(array);

        arrayUtil.printArrayToConsole(array);

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                if (counter == 0) {
                    System.out.print("Odd numbers are: " + array[i]);
                } else {
                    System.out.print(", " + array[i]);
                }
                counter++;
            }
        }
    }
}
