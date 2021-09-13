package student_alberts_matrozis.lesson_4.level_1;

import java.util.Scanner;

/*
Можно было сделать отдельную проверку числа от 1 до 7,
 но мне стало лень и сделал так :D.
  Что-то на подобие этого, только для каждого числа.
                          |
                         \/
                         if (num == 1) {
                         System.out.println("Monday");
                         }
 */

// Task 3
class Days {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7!");
        int num = s.nextInt();
        if (num < 1 || num > 7) {
            System.out.println("Вы должны ввести число от 1 до 7!");
            return;
        }
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days[num - 1]);
    }
}
