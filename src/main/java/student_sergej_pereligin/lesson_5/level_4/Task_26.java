package student_sergej_pereligin.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.*/
public class Task_26 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input the length of array");
    int size = scanner.nextInt();
    int[] arrays = new int[size];


        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(100);

        }

    System.out.println("Element of array are: "+Arrays.toString(arrays));

}
}