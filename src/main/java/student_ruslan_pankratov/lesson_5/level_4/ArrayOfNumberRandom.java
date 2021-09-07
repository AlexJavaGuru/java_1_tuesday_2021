package student_ruslan_pankratov.lesson_5.level_4;

import java.util.Scanner;

//Task_26
class ArrayOfNumberRandom {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = (int) (Math.random() * 100);
        }
        System.out.println("Ваш массив");
        for (int i : result) {
            System.out.print(i + " ");
        }


    }

}
