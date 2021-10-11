package student_daniel.lesson4.level5;

import java.util.Scanner;

class LightColorDetectorDemo {
    public static void main(String[] args) {
        LightColorDetector myLightLength = new LightColorDetector();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input light length: ");

        int lightLength = myScanner.nextInt();
        System.out.println("Your light length is: " + lightLength);
        System.out.println("Result is: " + myLightLength.detect(lightLength));
    }
}
