package student_josifs_makarenko.lesson_4.level5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.lightColorDetectorTest1();
        lightColorDetectorTest.lightColorDetectorTest2();
        lightColorDetectorTest.lightColorDetectorTest3();
        lightColorDetectorTest.lightColorDetectorTest4();
        lightColorDetectorTest.lightColorDetectorTest5();
        lightColorDetectorTest.lightColorDetectorTest6();
        lightColorDetectorTest.lightColorDetectorTest7();
    }

    public void lightColorDetectorTest1() {
        int number = 400;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.lightColor(number);
        check(expectedResult, realResult, "LightColorDetectorTest");
    }

    public void lightColorDetectorTest2() {
        int number = 460;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.lightColor(number);
        check(expectedResult, realResult, "LightColorDetectorTest");
    }

    public void lightColorDetectorTest3() {
        int number = 500;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.lightColor(number);
        check(expectedResult, realResult, "LightColorDetectorTest");
    }

    public void lightColorDetectorTest4() {
        int number = 580;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.lightColor(number);
        check(expectedResult, realResult, "LightColorDetectorTest");
    }

    public void lightColorDetectorTest5() {
        int number = 600;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.lightColor(number);
        check(expectedResult, realResult, "LightColorDetectorTest");
    }

    public void lightColorDetectorTest6() {
        int number = 700;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.lightColor(number);
        check(expectedResult, realResult, "LightColorDetectorTest");
    }

    public void lightColorDetectorTest7() {
        int number = 800;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.lightColor(number);
        check(expectedResult, realResult, "LightColorDetectorTest");
    }

    public void check (String expectedResult, String realResult, String testName) {
        if (expectedResult == realResult)  {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " != OK");
        }
    }
}
