package student_einars_marhilevics.lesson_5.level_4;

import java.util.Arrays;

class TASK_30 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 100);
            if (numbers[i] % 2 != 0) {
                System.out.printf(numbers[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Mentioned numbers above are odd numbers from the massive below");
        System.out.println(Arrays.toString(numbers));
    }
}
