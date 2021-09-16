package student_sergej_pereligin.lesson_5.level_6;

import java.util.Arrays;

/*Создайте в классе ArrayUtil метод для
распечатки массива целых чисел на консоль.

class ArrayUtil {

    public void printArrayToConsole(int[] array) {
        // Напишите реализацию !!!
    }

}
Создайте в классе ArrayUtil метод для
нахождения максимального числа в массиве целых чисел.

class ArrayUtil {

    public int findMaxNumber(int[] array) {
        // Напишите реализацию !!!
    }

}
*/
class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] resultArray = new int[arrayLength];
        return resultArray;
    }

    public void printArrayToConsole(int[] array) {

        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;

    }
}

