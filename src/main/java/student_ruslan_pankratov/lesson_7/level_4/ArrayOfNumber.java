package student_ruslan_pankratov.lesson_7.level_4;
//Task_8

import java.util.Scanner;

class ArrayOfNumber {
    public static void main(String[] args) {
        ArrayOfNumber array = new ArrayOfNumber();
        array.arrayLoop();
    }

    Scanner scanner = new Scanner(System.in);

    public void arrayLoop() {
        outputArray(numberArray(arrayLength()));
    }

    int arrayLength() {
        System.out.println("Введите длину массива");
        int size = scanner.nextInt();
        System.out.println("Введите число в массив");
        return size;
    }

    int[] numberArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = scanner.nextInt();
        }
        return result;
    }

    void outputArray(int[] arr) {
        System.out.println("Ваш массив");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
