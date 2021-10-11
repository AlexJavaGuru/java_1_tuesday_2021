package student_oleg_kozlov.lesson_9.level_2;

// Task_4
class DayOfTheWeekDetectorArrayVersionImpl implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        String[] days = { "Please input a valid number between 1 and 7",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        return (number < 1 || number > 7) ? days[0] : days[number];
    }
}
