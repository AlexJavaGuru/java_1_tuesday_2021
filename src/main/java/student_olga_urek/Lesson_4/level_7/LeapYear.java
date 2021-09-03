package student_olga_urek.Lesson_4.level_7;

class LeapYear {
    public boolean isLeap(int year) {
        if (year%4 != 0) {
            return false;
        } else if (year%100 != 0) {
            return true;
        } else if (year%400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
