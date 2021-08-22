package student_josifs_makarenko.lesson_4.level1;

public class Calendar {

    int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    void calendarWork(){
        if (getNumber() == 1) {
            System.out.println("Monday");
        } else if (getNumber() == 2) {
            System.out.println("Tuesday");
        } else if (getNumber() == 3) {
            System.out.println("Wednesday");
        } else if (getNumber() == 4) {
            System.out.println("Thursday");
        } else if (getNumber() == 5) {
            System.out.println("Friday");
        } else if (getNumber() == 6) {
            System.out.println("Saturday");
        } else if (getNumber() == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("EROR");
        }
    }
}
