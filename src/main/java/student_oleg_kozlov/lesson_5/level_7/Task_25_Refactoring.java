package student_oleg_kozlov.lesson_5.level_7;

import student_oleg_kozlov.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

// Task_41
class Task_25_Refactoring {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide array size: ");
        int arraySize = scanner.nextInt();

        int[] array = arrayUtil.createArray(arraySize);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Please provide array[" + i + "] value: ");
            array[i] = scanner.nextInt();
        }

        arrayUtil.printArrayToConsole(array);
    }
}
