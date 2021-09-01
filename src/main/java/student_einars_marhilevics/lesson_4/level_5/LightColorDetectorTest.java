package student_einars_marhilevics.lesson_4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectVioletTest();
        lightColorDetectorTest.detectBlueTest();
        lightColorDetectorTest.detectGreenTest();
        lightColorDetectorTest.detectYellowTest();
        lightColorDetectorTest.detectOrangeTest();
        lightColorDetectorTest.detectRedTest();
        lightColorDetectorTest.detectInvisibleLightTest();
    }
    void detectVioletTest() {
        int wavelength = 380;
        String expectedColour = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColour = lightColorDetector.detect(wavelength);
        if (realColour == expectedColour) {
            System.out.println("Test detectViolet = OK");
        } else {
            System.out.println("Test detectViolet = FAIL");
        }
    }
    void detectBlueTest() {
        int wavelength = 450;
        String expectedColour = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColour = lightColorDetector.detect(wavelength);
        if (realColour == expectedColour) {
            System.out.println("Test detectBlue = OK");
        } else {
            System.out.println("Test detectBlue = FAIL");
        }
    }
    void detectGreenTest() {
        int wavelength = 495;
        String expectedColour = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColour = lightColorDetector.detect(wavelength);
        if (realColour == expectedColour) {
            System.out.println("Test detectGreen = OK");
        } else {
            System.out.println("Test detectGreen = FAIL");
        }
    }
    void detectYellowTest() {
        int wavelength = 570;
        String expectedColour = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColour = lightColorDetector.detect(wavelength);
        if (realColour == expectedColour) {
            System.out.println("Test detectYellow = OK");
        } else {
            System.out.println("Test detectYellow = FAIL");
        }
    }
    void detectOrangeTest() {
        int wavelength = 590;
        String expectedColour = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColour = lightColorDetector.detect(wavelength);
        if (realColour == expectedColour) {
            System.out.println("Test detectOrange = OK");
        } else {
            System.out.println("Test detectOrange = FAIL");
        }
    }
    void detectRedTest() {
        int wavelength = 620;
        String expectedColour = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColour = lightColorDetector.detect(wavelength);
        if (realColour == expectedColour) {
            System.out.println("Test detectRed = OK");
        } else {
            System.out.println("Test detectRed = FAIL");
        }
    }
    void detectInvisibleLightTest() {
        int wavelength = 10;
        String expectedColour = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColour = lightColorDetector.detect(wavelength);
        if (realColour == expectedColour) {
            System.out.println("Test detectInvisibleLight = OK");
        } else {
            System.out.println("Test detectInvisibleLight = FAIL");
        }
    }
}
