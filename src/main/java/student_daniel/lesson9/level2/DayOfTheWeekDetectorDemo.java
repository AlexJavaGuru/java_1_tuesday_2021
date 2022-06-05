package student_daniel.lesson9.level2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    //Task 5
    DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo ifDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        System.out.print("If demo, ");
        ifDemo.run();

        DayOfTheWeekDetectorDemo switchDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        System.out.print("Switch demo, ");
        switchDemo.run();

        DayOfTheWeekDetectorDemo arrayDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        System.out.print("Array demo, ");
        arrayDemo.run();
    }

    void run() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please input day number: ");
        int dayNumber = myScanner.nextInt();
        System.out.println(detector.detectDayName(dayNumber));
        System.out.println();
    }
}