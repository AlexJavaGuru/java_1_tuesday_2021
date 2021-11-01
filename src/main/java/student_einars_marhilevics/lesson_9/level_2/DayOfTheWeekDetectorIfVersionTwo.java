package student_einars_marhilevics.lesson_9.level_2;

public class DayOfTheWeekDetectorIfVersionTwo implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String dayOfTheWeek;
        switch (number) {
            case 1: dayOfTheWeek = "Monday";
                break;
            case 2: dayOfTheWeek = "Tuesday";
                break;
            case 3: dayOfTheWeek = "Wednesday";
                break;
            case 4: dayOfTheWeek = "Thursday";
                break;
            case 5: dayOfTheWeek = "Friday";
                break;
            case 6: dayOfTheWeek = "Saturday";
                break;
            case 7: dayOfTheWeek = "Sunday";
                break;
            default: dayOfTheWeek = "Please input a valid number between 1 and 7";
                break;
        }
        return dayOfTheWeek;
    }
}
