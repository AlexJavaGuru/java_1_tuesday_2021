package student_daniel.lesson3.level2;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите ваше имя и нажмите клавишу \"Enter\" ");

        String fromScanner = myScanner.nextLine();
        String myName = "Hello " + fromScanner + "!";
        System.out.println(myName);
    }
}
