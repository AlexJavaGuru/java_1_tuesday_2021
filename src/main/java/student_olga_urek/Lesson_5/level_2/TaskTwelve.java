package student_olga_urek.Lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class TaskTwelve {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
