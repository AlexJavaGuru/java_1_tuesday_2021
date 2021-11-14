package student_josifs_makarenko.lesson_9.level2;
//task 4
public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {
    public String detectDayName(int number) {
        String[] array = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
                "Please input a valid number between 1 and 7"};
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == number) {
                return array[i];
            }
        }
        return array[array.length - 1];
    }
}
