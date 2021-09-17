package student_julija_kuzmicova.lesson_4.level_7;

class LightColorDetectorTest {

    LightColorDetector lightColorDetector = new LightColorDetector();

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
        String result = lightColorDetector.detect(wavelength);
        checkResult(result.equals("Violet"), "LightColorDetector test - Violet");
    }
    public void testBlue(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResult(result.equals("Blue"), "LightColorDetector test - Blue");
    }
    public void testGreen(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResult(result.equals("Green"), "LightColorDetector test - Green");
    }
    public void testYellow(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResult(result.equals("Yellow"), "LightColorDetector test - Yellow");
    }
    public void testOrange(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResult(result.equals("Orange"), "LightColorDetector test - Orange");
    }
    public void testRed(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResult(result.equals("Red"), "LightColorDetector test - Red");
    }
    public void testInvisible(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResult(result.equals("Invisible Light"), "LightColorDetector test - Invisible Light");
    }

    void checkResult(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
