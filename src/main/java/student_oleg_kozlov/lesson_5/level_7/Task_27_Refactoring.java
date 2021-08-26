package student_oleg_kozlov.lesson_5.level_7;

import student_oleg_kozlov.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Random;

// Task_41
class Task_27_Refactoring {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = arrayUtil.createArray(5);

        arrayUtil.fillArrayWithRandomNumbers(array);

        arrayUtil.printArrayToConsole(array);

        System.out.println("Maximal value is: " + arrayUtil.findMaxNumber(array));
    }
}
