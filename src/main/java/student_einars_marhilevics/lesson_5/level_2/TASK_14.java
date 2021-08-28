package student_einars_marhilevics.lesson_5.level_2;

import java.util.Arrays;

class TASK_14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            sum += numbers[i];
        }
        double ave = (double) sum / 3;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum of all massive numbers is " + sum);
        System.out.println("Average number from massive is " + ave);
    }
}
