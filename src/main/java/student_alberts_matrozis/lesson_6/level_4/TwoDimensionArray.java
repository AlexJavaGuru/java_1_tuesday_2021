package student_alberts_matrozis.lesson_6.level_4;

import student_alberts_matrozis.albertsUtils.Utils;

import java.util.Arrays;

class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        Utils utils = new Utils();
        utils.fillArrayWithRandomNumbers(arr);
        int sum = utils.calculateNumbersInArray(arr);
        System.out.println(sum);
    }
}
