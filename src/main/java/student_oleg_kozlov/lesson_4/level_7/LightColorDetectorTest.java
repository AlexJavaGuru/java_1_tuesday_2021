package student_oleg_kozlov.lesson_4.level_7;

// Task_25
class LightColorDetectorTest {

    private LightColorDetector lightColorDetector = new LightColorDetector();

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
        printCheckingResult(result.equals("Violet"), "LightColorDetector test - Violet");
    }
    public void testBlue(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        printCheckingResult(result.equals("Blue"), "LightColorDetector test - Blue");
    }
    public void testGreen(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        printCheckingResult(result.equals("Green"), "LightColorDetector test - Green");
    }
    public void testYellow(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        printCheckingResult(result.equals("Yellow"), "LightColorDetector test - Yellow");
    }
    public void testOrange(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        printCheckingResult(result.equals("Orange"), "LightColorDetector test - Orange");
    }
    public void testRed(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        printCheckingResult(result.equals("Red"), "LightColorDetector test - Red");
    }
    public void testInvisible(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        printCheckingResult(result.equals("Invisible Light"), "LightColorDetector test - Invisible Light");
    }

    private void printCheckingResult(boolean checkingResult, String testName) {
        if (checkingResult) {
            System.out.println(testName + "= OK");
        } else {
            System.out.println(testName + "= FAIL");
        }
    }
}
