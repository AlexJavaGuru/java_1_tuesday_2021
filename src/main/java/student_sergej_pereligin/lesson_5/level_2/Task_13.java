package student_sergej_pereligin.lesson_5.level_2;


import java.util.Random;

/*Написашите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте сумму всех ячеек и распечатайте ее на консоль.
*/
public class Task_13 {
    public static void main(String[] args) {
        int[] arg = new int[3];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < arg.length; i++) {
            arg[i] = random.nextInt(100);
            sum = sum + arg[i];
        }
        System.out.println("Element of array are: " + arg.length);

    }
}
