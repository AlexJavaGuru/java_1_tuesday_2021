package student_josifs_makarenko.lesson_3.level7;

import java.util.Scanner;

public class ComputerGameDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComputerGame game1 = new ComputerGame();
        System.out.println("Write a game from the XXI century");
        game1.setName(scanner.nextLine());
        game1.setDateOfRelease("XXI century");
        System.out.println("If game is cool write TRUE, else FALSE");
        game1.setFeels(scanner.hasNext());
        game1.play();
        game1.sayСрaracteristic();
    }
}
