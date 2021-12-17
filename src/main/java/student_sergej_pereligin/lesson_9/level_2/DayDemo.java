package student_sergej_pereligin.lesson_9.level_2;

public class DayDemo {
    public static void main(String[] args) {


        DayOfTheWeekDetectorSwitch dayOfTheWeekDetectorSwitch = new DayOfTheWeekDetectorSwitch();
        System.out.println(dayOfTheWeekDetectorSwitch.detectDayName(4));


        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        System.out.println(dayOfTheWeekDetectorIfVersion.detectDayName(2));

        DayOfTheWeekArray dayOfTheWeekArray = new DayOfTheWeekArray();
        System.out.println(dayOfTheWeekArray.detectDayName(7));
    }
}
