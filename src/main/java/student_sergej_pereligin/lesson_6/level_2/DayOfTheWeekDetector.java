package student_sergej_pereligin.lesson_6.level_2;

import java.util.Scanner;


public class DayOfTheWeekDetector {

    int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day number between 1 and 7: ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        if (dayNumber == 1) {
            return "Monday";
        } else if (dayNumber == 2) {
            return "Tuesday";
        } else if (dayNumber == 3) {
            return "Wednesday";
        } else if (dayNumber == 4) {
            return "Thursday";
        } else if (dayNumber == 5) {
            return "Friday";
        } else if (dayNumber == 6) {
            return "Saturday";
        } else if (dayNumber == 7) {
            return "Sunday";
        } else if (dayNumber > 7) {
            return "Invalid number";
        }
        return null;
    }
}
