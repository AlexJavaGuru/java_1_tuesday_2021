package student_oleg_kozlov.lesson_9.level_2;

import java.util.Scanner;

// Task_5
class DayOfTheWeekDetectorDemo {
    Scanner scanner = new Scanner(System.in);

    private DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public static void main(String[] args) {
        System.out.println("If version -----------------");
        DayOfTheWeekDetectorDemo ifVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersionImpl());
        ifVersion.run();
        System.out.println("Switch version -------------");
        DayOfTheWeekDetectorDemo switchVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersionImpl());
        switchVersion.run();
        System.out.println("Array version --------------");
        DayOfTheWeekDetectorDemo arrayVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersionImpl());
        arrayVersion.run();
    }

    private void run() {
        System.out.print("Please provide day number: ");
        int userInput = scanner.nextInt();
        System.out.println("Day of the week: " + detector.detectDayName(userInput));
    }
}
