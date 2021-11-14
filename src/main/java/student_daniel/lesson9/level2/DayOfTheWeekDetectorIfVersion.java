package student_daniel.lesson9.level2;

public class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {
    //Task 4
    @Override
    public String detectDayName(int dayNumber) {
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
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
