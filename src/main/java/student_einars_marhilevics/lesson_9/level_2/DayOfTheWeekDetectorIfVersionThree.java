package student_einars_marhilevics.lesson_9.level_2;

public class DayOfTheWeekDetectorIfVersionThree implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] daysWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String result = "День неизвестен.";
        if (number <= 0 || number > 7) {
            System.out.println("Please input a valid number between 1 and 7");
        } else {
            result = daysWeek[(number - 1)];
        }
        return result;
    }
}
