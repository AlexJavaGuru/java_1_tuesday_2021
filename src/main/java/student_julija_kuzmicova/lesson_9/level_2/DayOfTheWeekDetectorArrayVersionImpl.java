package student_julija_kuzmicova.lesson_9.level_2;

//Task_4
class DayOfTheWeekDetectorArrayVersionImpl implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] dayName = {"Please input a valid number between 1 and 7",
                            "Monday",
                            "Tuesday",
                            "Wednesday",
                            "Thursday",
                            "Friday",
                            "Saturday",
                            "Sunday"};
        if(number >= 1 && number <= 7) {
            return dayName[number];
        } else {
            return dayName[0];
        }
    }
}
