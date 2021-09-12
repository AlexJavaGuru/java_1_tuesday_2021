package student_alberts_matrozis.lesson_5.level_4;

import student_alberts_matrozis.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

class ArrayForLoopTask28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        ArrayUtil utils = new ArrayUtil();
        int[] numbers = utils.createArray(s.nextInt());

        utils.fillArrayWithRandomNumbers(numbers);

        System.out.println(Arrays.toString(numbers));

        int min = utils.findMinNumber(numbers);
        System.out.println(min);
    }
}
