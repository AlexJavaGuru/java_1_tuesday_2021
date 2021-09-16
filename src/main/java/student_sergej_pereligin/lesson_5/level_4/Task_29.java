package student_sergej_pereligin.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.*/
public class Task_29 {

    public static void main(String[] args) {

        int[] arrays = new int[7];

        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(100);

        }

        System.out.println("Element of array are: " + Arrays.toString(arrays));

        int isEven;
        for (int i = 0; i < arrays.length; i++)
            if (arrays[i] % 2 == 0) {
                isEven = arrays[i];

                System.out.println("isEven:: " + isEven);
            }
    }

}

