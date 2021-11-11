package student_josifs_makarenko.lesson12.level3;

import java.util.Scanner;

public class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input a number");


        do {
            try {
                System.out.println(Integer.parseInt(scanner.next()));
                break;
            } catch (Exception e) {
                System.out.println("Try again");
            }
        } while (true);
    }
}
