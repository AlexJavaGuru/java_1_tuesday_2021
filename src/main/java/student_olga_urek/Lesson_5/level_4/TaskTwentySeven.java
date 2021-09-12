package student_olga_urek.Lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class TaskTwentySeven {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number is " + largest);
    }

}
