package student_daniel.lesson4.level7;

class LeapYear {
    boolean leapYear;

    public boolean isLeapYear(int year) {
        if(year % 4 != 0) {
            return leapYear = false;
        } else {
            if(year % 100 != 0) {
                return leapYear = true;
            } else {
                if (year % 400 == 0) {
                    return leapYear = true;
                } else {
                    return leapYear = false;
                }
            }
        }
    }

    public boolean isLeapYear() {
        return leapYear;
    }
}
