package student_julija_kuzmicova.lesson_5.level_7;

import student_julija_kuzmicova.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Random;

//Task_41
class Task_27 {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        arrayUtil.findMaxNumber(array);

        System.out.println("The largest number in the array is: " + arrayUtil.findMaxNumber(array));
    }
}
