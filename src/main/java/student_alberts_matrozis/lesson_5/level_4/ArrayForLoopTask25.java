package student_alberts_matrozis.lesson_5.level_4;

import student_alberts_matrozis.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

class ArrayForLoopTask25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        ArrayUtil utils = new ArrayUtil();
        int[] numbers = utils.createArray(s.nextInt());

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число: ");
            numbers[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
    }
}
