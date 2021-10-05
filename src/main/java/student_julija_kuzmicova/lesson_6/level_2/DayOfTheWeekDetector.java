package student_julija_kuzmicova.lesson_6.level_2;

import java.util.Scanner;

//Task_7, Task_8
class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {

        String dayOfTheWeek;

        switch(dayNumber) {
            case 1:
                dayOfTheWeek = "Monday";
                break;
            case 2:
                dayOfTheWeek = "Tuesday";
                break;
            case 3:
                dayOfTheWeek = "Wednesday";
                break;
            case 4:
                dayOfTheWeek = "Thursday";
                break;
            case 5:
                dayOfTheWeek = "Friday";
                break;
            case 6:
                dayOfTheWeek = "Saturday";
                break;
            case 7:
                dayOfTheWeek = "Sunday";
                break;
            default:
                dayOfTheWeek = "The number you entered is incorrect";
        }
        return dayOfTheWeek;
    }

}
