package student_einars_marhilevics.lesson_5.level_4;

import java.util.Arrays;

class TASK_27 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int bigNum = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 100);
            if (numbers[i] > bigNum) {
                bigNum = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Biggest number is " + bigNum);
    }
}
