package student_josifs_makarenko.lesson_4.level7;

import java.util.Scanner;

public class LeapYearDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LeapYear leapYear = new LeapYear();
        System.out.println("input year");
        System.out.println(leapYear.isLeapYear(scanner.nextInt()));
    }
}
