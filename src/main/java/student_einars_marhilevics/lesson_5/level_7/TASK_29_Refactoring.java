package student_einars_marhilevics.lesson_5.level_7;

import student_einars_marhilevics.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;

class TASK_29_Refactoring {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.printf(numbers[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Mentioned numbers above are even numbers from the massive below");
        System.out.println(Arrays.toString(numbers));
    }
}
