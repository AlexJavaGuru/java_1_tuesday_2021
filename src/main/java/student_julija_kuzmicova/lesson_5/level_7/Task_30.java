package student_julija_kuzmicova.lesson_5.level_7;

import student_julija_kuzmicova.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Random;

//Task_41
class Task_30 {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
