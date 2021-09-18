package student_alberts_matrozis.lesson_5.level_4;

import student_alberts_matrozis.lesson_5.level_5.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ArrayForLoopTask29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        ArrayUtil utils = new ArrayUtil();
        int[] numbers = utils.createArray(s.nextInt());

        utils.fillArrayWithRandomNumbers(numbers);

        System.out.println(Arrays.toString(numbers));

//        for (int number : numbers)  {
//            if (number % 2 == 0) {
//                System.out.println(number);
//            }
//        }

        // Решение через список и вывод в виде массива мне больше нравиться
        ArrayList<Integer> evenNumArr = new ArrayList<Integer>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumArr.add(number);
            }
        }
        System.out.println(evenNumArr);
    }
}
