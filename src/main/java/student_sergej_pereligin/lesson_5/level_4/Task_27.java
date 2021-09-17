package student_sergej_pereligin.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.*/
public class Task_27 {
    public static void main(String[] args) {

        int[] arrays = new int[7];

        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(100);

        }

        System.out.println("Element of array are: "+Arrays.toString(arrays));
        int max = arrays[0];
        for (int i = 0;i < arrays.length; i++)
            if(arrays[i] > max){
                max = arrays[i];
            }
        System.out.println("Max of array is: "+ max);
    }}
