package student_julija_kuzmicova.lesson_9.level_2;

import java.util.Scanner;

//Task_5
class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector detectorIfVersion = new DayOfTheWeekDetectorIfVersionImpl();
        DayOfTheWeekDetectorDemo ifVersion = new DayOfTheWeekDetectorDemo(detectorIfVersion);
        ifVersion.run();

        DayOfTheWeekDetector detectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersionImpl();
        DayOfTheWeekDetectorDemo switchVersion = new DayOfTheWeekDetectorDemo(detectorSwitchVersion);
        switchVersion.run();

        DayOfTheWeekDetector detectorArrayVersion = new DayOfTheWeekDetectorArrayVersionImpl();
        DayOfTheWeekDetectorDemo arrayVersion = new DayOfTheWeekDetectorDemo(detectorArrayVersion);
        arrayVersion.run();
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a day number...");
        int userInput = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(userInput));
    }
}
