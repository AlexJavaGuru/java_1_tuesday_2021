package student_sergej_pereligin.lesson_9.level_2;


public class DayOfTheWeekDetectorSwitch implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int dayOfTheWeek) {


        return switch (dayOfTheWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Please provide another number, 1-7";
        };
    }
}
