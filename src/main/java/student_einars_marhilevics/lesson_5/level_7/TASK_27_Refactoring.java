package student_einars_marhilevics.lesson_5.level_7;

import student_einars_marhilevics.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;

class TASK_27_Refactoring {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
        System.out.println("Biggest number is " + arrayUtil.findMaxNumber(numbers));
    }
}
