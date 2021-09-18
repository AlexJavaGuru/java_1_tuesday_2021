package student_alberts_matrozis.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class ArrayTask11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        numbers[0] = s.nextInt();
        System.out.println("Введите число: ");
        numbers[1] = s.nextInt();
        System.out.println("Введите число: ");
        numbers[2] = s.nextInt();

        System.out.println(Arrays.toString(numbers));
    }
}
