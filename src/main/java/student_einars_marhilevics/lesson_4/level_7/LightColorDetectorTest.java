package student_einars_marhilevics.lesson_4.level_7;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.testViolet();
        lightColorDetectorTest.testBlue();
        lightColorDetectorTest.testGreen();
        lightColorDetectorTest.testYellow();
        lightColorDetectorTest.testOrange();
        lightColorDetectorTest.testRed();
        lightColorDetectorTest.testInvisibleLight();
    }
    void testViolet() {
        int wavelength = 380;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Violet";
        String realResult = lightColorDetector.detect(wavelength);
        checkResult(realResult, expectedResult, "Violet");
    }
    void testBlue() {
        int wavelength = 450;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Blue";
        String realResult = lightColorDetector.detect(wavelength);
        checkResult(realResult, expectedResult, "Blue");
    }
    void testGreen() {
        int wavelength = 495;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Green";
        String realResult = lightColorDetector.detect(wavelength);
        checkResult(realResult, expectedResult, "Green");
    }
    void testYellow() {
        int wavelength = 570;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Yellow";
        String realResult = lightColorDetector.detect(wavelength);
        checkResult(realResult, expectedResult, "Yellow");
    }
    void testOrange() {
        int wavelength = 590;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Orange";
        String realResult = lightColorDetector.detect(wavelength);
        checkResult(realResult, expectedResult, "Orange");
    }
    void testRed() {
        int wavelength = 620;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Red";
        String realResult = lightColorDetector.detect(wavelength);
        checkResult(realResult, expectedResult, "Red");
    }
    void testInvisibleLight() {
        int wavelength = 1;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Invisible Light";
        String realResult = lightColorDetector.detect(wavelength);
        checkResult(realResult, expectedResult, "Invisible Light");
    }
    void checkResult(String expectedResult, String realResult, String test) {
        if(realResult.equals(expectedResult)) {
            System.out.println(test + " passed");
        } else {
            System.out.println(test + " failed");
        }
    }
}
