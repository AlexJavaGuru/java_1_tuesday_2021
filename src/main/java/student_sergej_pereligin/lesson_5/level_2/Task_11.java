package student_sergej_pereligin.lesson_5.level_2;
/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива числом, запрошенным у пользователя,
 - выведите значение каждой ячейки на консоль.*/


import java.util.Arrays;
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        int[] ara= new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int in1= scanner.nextInt();
        ara[0] = in1;
        System.out.println("Input first number");
        int in2 = scanner.nextInt();
        ara[1] = in2;
        System.out.println("Input first number");
        int in3 =scanner.nextInt();
        ara[2]= in3;
        System.out.println(Arrays.toString(ara));
    }
}
