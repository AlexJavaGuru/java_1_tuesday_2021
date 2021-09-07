package student_olga_urek.Lesson_4.level_5;

import student_olga_urek.Lesson_4.level_4.Calculator;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest detectorTest = new LightColorDetectorTest();
        detectorTest.violetTest();
        detectorTest.blueTest();
        detectorTest.greenTest();
        detectorTest.yellowTest();
        detectorTest.orangeTest();
        detectorTest.redTest();
        detectorTest.invisibleUltraVioletTest();
        detectorTest.invisibleInfraRedTest();

    }
    public void violetTest() {
        int wavelength = 385;
        String expectedResult = "Violet";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("violetTest = OK");
        } else {
            System.out.println("violetTest = FAIL");
        }
    }
    public void blueTest() {
        int wavelength = 455;
        String expectedResult = "Blue";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("blueTest = OK");
        } else {
            System.out.println("blueTest = FAIL");
        }
    }
    public void greenTest() {
        int wavelength = 500;
        String expectedResult = "Green";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("greenTest = OK");
        } else {
            System.out.println("greenTest = FAIL");
        }
    }
    public void yellowTest() {
        int wavelength = 575;
        String expectedResult = "Yellow";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("yellowTest = OK");
        } else {
            System.out.println("yellowTest = FAIL");
        }
    }
    public void orangeTest() {
        int wavelength = 600;
        String expectedResult = "Orange";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("orangeTest = OK");
        } else {
            System.out.println("orangeTest = FAIL");
        }
    }
    public void redTest() {
        int wavelength = 630;
        String expectedResult = "Red";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("redTest = OK");
        } else {
            System.out.println("redTest = FAIL");
        }
    }
    public void invisibleUltraVioletTest() {
        int wavelength = 350;
        String expectedResult = "invisible";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("invisibleUltraVioletTest = OK");
        } else {
            System.out.println("invisibleUltraVioletTest = FAIL");
        }
    }
    public void invisibleInfraRedTest() {
        int wavelength = 800;
        String expectedResult = "invisible";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("invisibleInfraRedTest = OK");
        } else {
            System.out.println("invisibleInfraRedTest = FAIL");
        }
    }
}

