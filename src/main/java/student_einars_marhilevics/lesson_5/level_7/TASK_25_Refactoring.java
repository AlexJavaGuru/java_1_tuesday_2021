package student_einars_marhilevics.lesson_5.level_7;

import student_einars_marhilevics.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

class TASK_25_Refactoring {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of massive!");
        int userSize = scanner.nextInt();
        int[] numbers = arrayUtil.createArray(userSize);
        for (int i = 0; i < userSize; i++) {
            System.out.println("Please enter massive number nr " + (i + 1));
            numbers[i] = scanner.nextInt();
        }
        arrayUtil.printArrayToConsole(numbers);
    }
}
