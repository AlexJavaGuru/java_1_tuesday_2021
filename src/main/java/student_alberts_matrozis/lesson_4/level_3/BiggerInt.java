package student_alberts_matrozis.lesson_4.level_3;

import java.util.Scanner;

// Task 10
/*
1. Способ - Сделать много проверок через if, else if.
2. Способ - Сделать такую же проверку только чуть более
 автоматизированную через цикл for заранее закинув все
  числа в массив. + в таком случае можно будет проверять на много больше чисел.

 */
class BiggerInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = {0, 1, 2}; // Не разобрался до конца с работой с массивами в JAVA.
        System.out.println("Enter first number");
        numbers[0] = s.nextInt();
        System.out.println("Enter second number");
        numbers[1] = s.nextInt();
        System.out.println("Enter third number");
        numbers[2] = s.nextInt();

        int maxInt = 0;

        for (int number : numbers) {
            if (number > maxInt) {
                maxInt = number;
            }
        }
        System.out.println(maxInt);
    }
}
