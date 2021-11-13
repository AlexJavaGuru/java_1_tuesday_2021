package student_josifs_makarenko.lesson_9.level2;

import java.util.Scanner;
//task 5
public class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;
    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo1 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo2 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo3 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        dayOfTheWeekDetectorDemo1.run();
        dayOfTheWeekDetectorDemo2.run();
        dayOfTheWeekDetectorDemo3.run();
    }


    void run () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number");
        int number = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(number));
    }
}
