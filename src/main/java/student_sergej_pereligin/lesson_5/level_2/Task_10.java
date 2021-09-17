package student_sergej_pereligin.lesson_5.level_2;
/* Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива любым целым числом,
 - выведите значение каждой ячейки на консоль.*/

import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {
        int[] root = new int[3];
        root[0]=4;
        root[1]=3;
        root[2]=6;
        System.out.println(Arrays.toString(root));
    }
}
