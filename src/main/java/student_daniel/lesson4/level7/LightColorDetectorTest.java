package student_daniel.lesson4.level7;

class LightColorDetectorTest {
    //Task 25
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }
    public void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Violet";
        check(expectedResult, result, "Test name: testViolet - ");
    }

    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Blue";
        check(expectedResult, result, "Test name: testBlue - ");
    }

    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Green";
        check(expectedResult, result, "Test name: testGreen - ");
    }

    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Yellow";
        check(expectedResult, result, "Test name: testYellow - ");
    }

    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Orange";
        check(expectedResult, result, "Test name: testOrange - ");
    }

    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Red";
        check(expectedResult, result, "Test name: testRed - ");
    }

    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Invisible Light";
        check(expectedResult, result, "Test name: testInvisible - ");
    }

    void check(String expectedResult, String realResult, String testName) {
        if(expectedResult == realResult) {
            System.out.println(testName + "Test PASSED");
        } else {
            System.out.println(testName + "Test FAILED");
        }
    }
}
