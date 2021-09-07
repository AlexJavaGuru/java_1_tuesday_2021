package student_einars_marhilevics.lesson_5.level_7;

import student_einars_marhilevics.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

class TASK_26_Refactoring {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter massive size");
        int userSize = scanner.nextInt();
        int[] numbers = arrayUtil.createArray(userSize);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
    }
}
