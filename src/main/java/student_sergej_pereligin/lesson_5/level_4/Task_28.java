package student_sergej_pereligin.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консол*/
public class Task_28 { public static void main(String[] args) {

    int[] arrays = new int[7];

    Random random = new Random();
    for (int i = 0; i < arrays.length; i++) {
        arrays[i] = random.nextInt(100);

    }

    System.out.println("Element of array are: "+ Arrays.toString(arrays));
    int min = arrays[0];
    for (int i = 0;i < arrays.length; i++)
        if(arrays[i] < min){
            min = arrays[i];
        }
    System.out.println("Max of array is: "+ min);
}
}
