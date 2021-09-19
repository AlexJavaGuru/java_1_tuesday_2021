package student_alberts_matrozis.lesson_5.level_2;

import java.util.Arrays;

class ArrayTask12 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = (int )(Math.random() * 50 + 1);
        numbers[1] = (int )(Math.random() * 50 + 1);
        numbers[2] = (int )(Math.random() * 50 + 1);

        System.out.println(Arrays.toString(numbers));
    }
}
