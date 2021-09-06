package student_josifs_makarenko.lesson_5.level2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array array = new Array();
        int[] myFirstArray = new int[3];
        System.out.println("Array with coded numbers: " + Arrays.toString(array.showArrayWithCodedNumbers(myFirstArray)));

        int[] mySecondArray = new int[3];
        System.out.println("input three numbers");
        System.out.println("Array with your numbers: " + Arrays.toString(array.showArrayWithYourNumbers(mySecondArray, scanner.nextInt(), scanner.nextInt(), scanner.nextInt())));

        int[] myThirdArray;
        myThirdArray = new int[3];
        System.out.println("Array with random numbers: " + Arrays.toString(array.showArrayWithRandomNumbers(myThirdArray)));
        System.out.println("Sum of array with random numbers: " + array.showSumOfNumbersInArray(myThirdArray));
        System.out.println("Average of array with random numbers: " + array.showAverageOfNumbersInArray(myThirdArray));
        array.arrayPlusTwo(myThirdArray);
        System.out.println("This array that increased for 2: " + Arrays.toString(array.showArray(myThirdArray)));
    }
}
