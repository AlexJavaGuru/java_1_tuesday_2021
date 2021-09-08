package student_einars_marhilevics.lesson_5.level_4;

import java.util.Arrays;

class TASK_28 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int smallNum = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 100);
            if (smallNum > numbers[i]) {
                smallNum = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.printf("Smallest number is " + smallNum);
    }
}
