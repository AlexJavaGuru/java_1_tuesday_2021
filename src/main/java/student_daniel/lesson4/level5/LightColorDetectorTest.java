package student_daniel.lesson4.level5;

public class LightColorDetectorTest {
    //Task 16
    public static void main(String[] args) {
        LightColorDetectorTest myColorDetectorTest = new LightColorDetectorTest();

        myColorDetectorTest.LightTest1();
        myColorDetectorTest.LightTest2();
        myColorDetectorTest.LightTest3();
        myColorDetectorTest.LightTest4();
        myColorDetectorTest.LightTest5();
        myColorDetectorTest.LightTest6();
        myColorDetectorTest.LightTest7();
    }

    public void LightTest1() {
        LightColorDetector myColorDetector = new LightColorDetector();

        int colorNumber = 380;
        String expectedResult = "Violet";

        String realResult = myColorDetector.detect(colorNumber);

        if (expectedResult == realResult) {
            System.out.println("Test = OK, results is: " + expectedResult);
        } else {
            System.out.println("Test = FAILED");
        }
    }

    public void LightTest2() {
        LightColorDetector myColorDetector = new LightColorDetector();

        int colorNumber = 450;
        String expectedResult = "Blue";

        String realResult = myColorDetector.detect(colorNumber);

        if (expectedResult == realResult) {
            System.out.println("Test = OK, results is: " + expectedResult);
        } else {
            System.out.println("Test = FAILED");
        }
    }

    public void LightTest3() {
        LightColorDetector myColorDetector = new LightColorDetector();

        int colorNumber = 495;
        String expectedResult = "Green";

        String realResult = myColorDetector.detect(colorNumber);

        if (expectedResult == realResult) {
            System.out.println("Test = OK, results is: " + expectedResult);
        } else {
            System.out.println("Test = FAILED");
        }
    }

    public void LightTest4() {
        LightColorDetector myColorDetector = new LightColorDetector();

        int colorNumber = 570;
        String expectedResult = "Yellow";

        String realResult = myColorDetector.detect(colorNumber);

        if (expectedResult == realResult) {
            System.out.println("Test = OK, results is: " + expectedResult);
        } else {
            System.out.println("Test = FAILED");
        }
    }

    public void LightTest5() {
        LightColorDetector myColorDetector = new LightColorDetector();

        int colorNumber = 590;
        String expectedResult = "Orange";

        String realResult = myColorDetector.detect(colorNumber);

        if (expectedResult == realResult) {
            System.out.println("Test = OK, results is: " + expectedResult);
        } else {
            System.out.println("Test = FAILED");
        }
    }

    public void LightTest6() {
        LightColorDetector myColorDetector = new LightColorDetector();

        int colorNumber = 620;
        String expectedResult = "Red";

        String realResult = myColorDetector.detect(colorNumber);

        if (expectedResult == realResult) {
            System.out.println("Test = OK, results is: " + expectedResult);
        } else {
            System.out.println("Test = FAILED");
        }
    }

    public void LightTest7() {
        LightColorDetector myColorDetector = new LightColorDetector();

        int colorNumber = 999;
        String expectedResult = "Invisible Light";

        String realResult = myColorDetector.detect(colorNumber);

        if (expectedResult == realResult) {
            System.out.println("Test = OK, results is: " + expectedResult);
        } else {
            System.out.println("Test = FAILED");
        }
    }
}
