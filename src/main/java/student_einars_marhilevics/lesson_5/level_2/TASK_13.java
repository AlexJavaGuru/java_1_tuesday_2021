package student_einars_marhilevics.lesson_5.level_2;

import java.util.Arrays;

class TASK_13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);
    }
}
