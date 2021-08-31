package student_sergej_pereligin.lesson_5.level_2;



import java.util.Arrays;
import java.util.Random;

/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль,
 - увеличьте значение каждой ячейки на 2,
 - выведите значение каждой ячейки на консоль.
*/

public class Task_15 {
    public static void main(String[] args) {
        int[] recd = new int[3];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < recd.length; i++) {
            recd[i] = random.nextInt(100);
            sum=sum+recd[i];

        }
        System.out.println("Arrrays: "+ Arrays.toString(recd));
        for (int i = 0; i < recd.length; i++) {
            recd[i] +=  2;
            System.out.println("Double numbers: "+recd[i]);
        }
    }
}

