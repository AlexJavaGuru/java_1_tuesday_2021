package student_ruslan_pankratov.lesson_5.level_2;
//Task_11

import java.util.Scanner;

class ArrayOfNumbersInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        int[] number = {numberOne, numberTwo, numberThree};
        for (int i : number) {
            System.out.println(i);
        }
    }
}
