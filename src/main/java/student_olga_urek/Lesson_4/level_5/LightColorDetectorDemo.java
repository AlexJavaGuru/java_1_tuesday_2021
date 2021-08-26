package student_olga_urek.Lesson_4.level_5;

import java.util.Scanner;

class LightColorDetectorDemo {
    public static void main(String[] args) {
        System.out.println("This program determines the color of the visible light from the given wavelength");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the wavelength of your light:");
        int wavelength = myScanner.nextInt();
        LightColorDetector myColorDetector = new LightColorDetector();
        String color = myColorDetector.detect(wavelength);
        System.out.println("Your light is " + color);
    }
}
