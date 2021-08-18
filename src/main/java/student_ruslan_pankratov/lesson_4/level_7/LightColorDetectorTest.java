package student_ruslan_pankratov.lesson_4.level_7;

class LightColorDetectorTest {
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
        String expectedResult = "Violet";
        String result = lightColorDetector.detect(wavelength);
       controller(result,expectedResult,"Violet");
    }

    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Blue";
        controller(result,expectedResult,"Blue");
    }

    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Green";
        controller(result,expectedResult,"Green");

    }

    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Yellow";
        controller(result,expectedResult,"Yellow");
    }

    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Orange";
        controller(result,expectedResult,"Orange");
    }

    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Red";
        controller(result,expectedResult,"Red");
    }

    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Invisible Light";
        controller(result,expectedResult,"Invisible Light");
    }


    public void controller(String actualResult, String expectedResult, String name) {
        if (actualResult.equals(expectedResult)) {
            System.out.println("LightColorDetector test - " + name + "  = OK");
        } else {
            System.out.println("LightColorDetector test - " + name + "  = FAIL");
        }
    }


}
