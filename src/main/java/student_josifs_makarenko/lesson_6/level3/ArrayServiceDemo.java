package student_josifs_makarenko.lesson_6.level3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayService arrayService = new ArrayService();

        int[] myFirstArray = {1, 5, 10, 50, 100, 100, 100, 5, 10, 1, 1, 1, 1, 1};
        System.out.println("input number");
        int number = scanner.nextInt();
        System.out.println(arrayService.contains(myFirstArray, number));
        System.out.println("Your number is repeated " + arrayService.countOccurrences(myFirstArray, number) + " times");
        System.out.println("Input number what you what to replace and number that will change them");
        System.out.println(arrayService.replaceFirst(myFirstArray, scanner.nextInt(), scanner.nextInt()));
        System.out.println(Arrays.toString(myFirstArray));
        System.out.println(Arrays.toString(arrayService.replaceAll(myFirstArray, scanner.nextInt(), scanner.nextInt())));

        int[] mySecondArray = {3, 2, 1};
        arrayService.revert(mySecondArray);
        System.out.println(Arrays.toString(mySecondArray));
    }
}
