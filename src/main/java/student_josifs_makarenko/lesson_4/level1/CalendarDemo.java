package student_josifs_makarenko.lesson_4.level1;

import java.util.Scanner;
//task 3
public class CalendarDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();
        System.out.println("Input number from 1 to 7");
        calendar.setNumber(scanner.nextInt());
        calendar.calendarWork();
    }
}
