package student_alberts_matrozis.lesson_6.level_2;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();

        String result = detector.findDayOfTheWeek(dayNumber);
        System.out.println(result);
    }
}
