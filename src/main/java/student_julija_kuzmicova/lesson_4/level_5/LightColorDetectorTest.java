package student_julija_kuzmicova.lesson_4.level_5;


class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleVioletTest();
        lightColorDetectorTest.invisibleRedTest();

    }

    public void violetTest() {
        int wavelength = 392;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }

    public void blueTest() {
        int wavelength = 482;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }

    public void greenTest() {
        int wavelength = 501;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }

    public void yellowTest() {
        int wavelength = 577;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }

    public void orangeTest() {
        int wavelength = 615;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }

    public void redTest() {
        int wavelength = 703;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }

    public void invisibleVioletTest() {
        int wavelength = 220;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Invisible violet test = OK");
        } else {
            System.out.println("Invisible violet test = FAIL");
        }
    }

    public void invisibleRedTest() {
        int wavelength = 900;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Invisible red test = OK");
        } else {
            System.out.println("Invisible red test = FAIL");
        }
    }
}
