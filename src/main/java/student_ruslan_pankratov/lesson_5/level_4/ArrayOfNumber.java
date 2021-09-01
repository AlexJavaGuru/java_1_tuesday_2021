package student_ruslan_pankratov.lesson_5.level_4;

import java.util.Scanner;

//Task_25
class ArrayOfNumber {

    public void arrayLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int size = scanner.nextInt();

        int[] result = new int[size];
        System.out.println("Введите число в массив");
        for (int i = 0; i < size; i++) {
            result[i] = scanner.nextInt();
        }
        System.out.println("Ваш массив");
        for (int i : result) {
            System.out.print(i + " ");
        }


    }

    public static void main(String[] args) {
        ArrayOfNumber array = new ArrayOfNumber();
        array.arrayLoop();


    }
}
