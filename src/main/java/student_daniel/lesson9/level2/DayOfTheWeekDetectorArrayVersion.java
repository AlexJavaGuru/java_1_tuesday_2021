package student_daniel.lesson9.level2;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {
    //Task 4
    @Override
    public String detectDayName(int dayNumber) {
        String[] dayArray = {"Oops!", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return dayArray[dayNumber];
    }
}
