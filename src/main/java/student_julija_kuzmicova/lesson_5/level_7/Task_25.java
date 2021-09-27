package student_julija_kuzmicova.lesson_5.level_7;

import student_julija_kuzmicova.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

//Task_41
class Task_25 {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length...");
        int userSize = scanner.nextInt();

        int[] array = arrayUtil.createArray(userSize);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number...");
            array[i] = scanner.nextInt();
        }

        arrayUtil.printArrayToConsole(array);
    }
}
