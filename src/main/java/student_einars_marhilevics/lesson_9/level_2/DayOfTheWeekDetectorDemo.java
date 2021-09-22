package student_einars_marhilevics.lesson_9.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersionTwo dayOfTheWeekDetectorIfVersionTwo = new DayOfTheWeekDetectorIfVersionTwo();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter number of day of the week");
        int dayOfTheWeek = myScanner.nextInt();
        System.out.println(dayOfTheWeekDetectorIfVersionTwo.detectDayName(dayOfTheWeek));
    }
}
