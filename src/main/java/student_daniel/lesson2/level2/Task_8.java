package student_daniel.lesson2.level2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Введите Ваше имя и нажмите клавишу \"Enter\" ");
        String name = myScanner.next();
        //String name = myScanner.nextLine();

        System.out.println("Hello " + name);
    }
}