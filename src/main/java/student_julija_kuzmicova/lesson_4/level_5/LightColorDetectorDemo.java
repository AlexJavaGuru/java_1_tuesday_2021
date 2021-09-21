package student_julija_kuzmicova.lesson_4.level_5;

import java.util.Scanner;

class LightColorDetectorDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the wavelength from 380 to 750 for detecting the color:");
        int wavelength = scanner.nextInt();

        LightColorDetector myColorDetector = new LightColorDetector();
        String color = myColorDetector.detect(wavelength);
        System.out.println("The color is " + color);
    }
}
