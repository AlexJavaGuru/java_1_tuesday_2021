package student_einars_marhilevics.lesson_9.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }
    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo versionOne = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        versionOne.run();

        DayOfTheWeekDetectorDemo versionTwo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersionTwo());
        versionTwo.run();

        DayOfTheWeekDetectorDemo versionThree = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersionThree());
        versionThree.run();

    }
    private void run() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter number of day of the week");
        int dayOfTheWeek = myScanner.nextInt();
        System.out.println("Day of the week: " + dayOfTheWeekDetector.detectDayName(dayOfTheWeek));
    }
}
