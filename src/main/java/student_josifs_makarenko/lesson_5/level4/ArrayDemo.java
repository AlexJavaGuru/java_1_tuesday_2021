package student_josifs_makarenko.lesson_5.level4;

import student_josifs_makarenko.lesson_5.level5.ArrayUtil;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayUtil arrayUtil = new ArrayUtil();
        Array array = new Array();
        System.out.println("Input size");
        int[] myArray = arrayUtil.createArray(scanner.nextInt());
        System.out.println("Input number or numbers");
        array.arrayWithYourNumbers(myArray);
        arrayUtil.printArrayToConsole(myArray);

        System.out.println("Input size");
        int[] mySecondArray = arrayUtil.createArray(scanner.nextInt());
        arrayUtil.fillArrayWithRandomNumbers(mySecondArray);
        arrayUtil.printArrayToConsole(mySecondArray);
        System.out.println("Max number from this array is: " + arrayUtil.findMaxNumber(mySecondArray));
        System.out.println("Min number from this array is: " + arrayUtil.findMinNumber(mySecondArray));
        System.out.println("Even numbers from this array:");
        array.evenNumbers(mySecondArray);
        System.out.println("Odd numbers from this array:");
        array.oddNumbers(mySecondArray);
    }
}
