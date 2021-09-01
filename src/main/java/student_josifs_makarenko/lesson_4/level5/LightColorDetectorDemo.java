package student_josifs_makarenko.lesson_4.level5;

import java.util.Scanner;

public class LightColorDetectorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LightColorDetector lightColorDetector = new LightColorDetector();
        System.out.println("Input a light's length");
        System.out.println(lightColorDetector.lightColor(scanner.nextInt()));
    }
}
