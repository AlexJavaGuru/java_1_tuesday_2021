package student_daniel.lesson6.level2;

import java.util.Scanner;

class DayOfTheWeekDetector {
    //Task 7 8 9 10 11
    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    String findDayOfTheWeek(int dayNumber) {
        String weekDay;
        switch (dayNumber) {
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                weekDay = "Not correct day number";
        }
        return weekDay;
    }
}

