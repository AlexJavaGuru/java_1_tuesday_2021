package student_olga_urek.Lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class TaskFourteen {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum/numbers.length;

        System.out.println(Arrays.toString(numbers));
        System.out.println("The average of all integers in the array is " + average);
    }
}
