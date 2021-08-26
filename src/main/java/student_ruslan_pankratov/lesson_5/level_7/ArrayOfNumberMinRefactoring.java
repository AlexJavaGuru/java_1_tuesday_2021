package student_ruslan_pankratov.lesson_5.level_7;

import student_ruslan_pankratov.lesson_5.level_6.ArrayUtil;

import java.util.Scanner;

//Task_41
class ArrayOfNumberMinRefactoring {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите размер массива");
        int number = scanner.nextInt();
        int[] result = arrayUtil.createArray(number);
        System.out.println("Ваш массив");
        arrayUtil.fillArrayWithRandomNumbers(result);
        arrayUtil.printArrayToConsole(result);
        System.out.println("");
        System.out.println("Самое маленькое число = " + arrayUtil.findMinNumber(result));

    }
}
