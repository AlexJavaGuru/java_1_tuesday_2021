package student_alberts_matrozis.lesson_5.level_4;

import student_alberts_matrozis.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

class ArrayForLoopTask27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        ArrayUtil utils = new ArrayUtil();
        int[] numbers = utils.createArray(s.nextInt());

        utils.fillArrayWithRandomNumbers(numbers);
        System.out.println(Arrays.toString(numbers));

        int max = utils.findMaxNumber(numbers);
        System.out.println(max);
    }
}
