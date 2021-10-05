package student_alberts_matrozis.lesson_6.level_4;

import static student_alberts_matrozis.albertsUtils.ArrayUtil.*;

class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        fillArrayWithRandomNumbers(arr);
        int sum = calculateNumbersInArray(arr);
        System.out.println(sum);
    }
}
