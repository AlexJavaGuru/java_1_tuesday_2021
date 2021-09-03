package student_olga_urek.Lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class TaskThirty {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
