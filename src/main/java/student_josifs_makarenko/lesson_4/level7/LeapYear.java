package student_josifs_makarenko.lesson_4.level7;

public class LeapYear {

    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return true;
        } else if (year % 100 != 0) {
            return false;
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                return false;
            }
        }
        return true;
    }
}