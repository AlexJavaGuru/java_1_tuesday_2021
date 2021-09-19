package student_daniel.lesson4.level7;

import java.util.Scanner;

class LeapYearDemo {
    public static void main(String[] args) {
        LeapYear myYear = new LeapYear();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please input year: ");
        System.out.println(myYear.isLeapYear(myScanner.nextInt()));
    }
}
