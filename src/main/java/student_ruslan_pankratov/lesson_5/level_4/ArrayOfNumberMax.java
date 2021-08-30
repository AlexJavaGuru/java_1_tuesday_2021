package student_ruslan_pankratov.lesson_5.level_4;

import java.util.Scanner;

//Task_27
class ArrayOfNumberMax {

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");

        int size = scanner.nextInt();

        int[] result = new int[size];

        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * 100);
        }

        System.out.println("Ваш массив");

        for (int i : result) {
            System.out.print(i + " ");
        }

        int max = result[0];
        for (int i = 0; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
            }
        }

        System.out.println();
        System.out.println("Самое большое число равно = " + max);

    }
}
