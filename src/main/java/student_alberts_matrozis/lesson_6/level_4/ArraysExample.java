package student_alberts_matrozis.lesson_6.level_4;

import teacher.lesson_6_arrays_while_loop.lessoncode.twodemarray.ArrayUtil;

public class ArraysExample {

    public static void main(String[] args) {

        int[][] array = new int[4][5];

        ArrayUtil.fillArrayWithRandomNumbers(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }

        int[][] arrayTwo = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println();

        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                System.out.print(arrayTwo[i][j] + "|");
            }
            System.out.println();
        }
    }
}
