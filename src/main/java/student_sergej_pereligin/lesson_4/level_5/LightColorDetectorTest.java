package student_sergej_pereligin.lesson_4.level_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest testWalker = new LightColorDetectorTest();
        testWalker.detectingViolet();
        testWalker.detectingBlue();
        testWalker.detectingGreen();
        testWalker.detectingYellow();
        testWalker.detectingOrange();
        testWalker.detectingRed();
    }

    void detectingViolet() {
        LightColorDetector detective = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = detective.detect(400);
        if (expectedResult == actualResult) {
            System.out.println("Violet test passed");
        } else {
            System.out.println("Violet test failed");
        }
    }

    void detectingBlue() {
        LightColorDetector detective = new LightColorDetector();
        String expectedResult = "Blue";
        String actualResult = detective.detect(460);
        if (expectedResult == actualResult) {
            System.out.println("Blue test passed");
        } else {
            System.out.println("Blue test failed");
        }
    }

    void detectingGreen() {
        LightColorDetector detective = new LightColorDetector();
        String expectedResult = "Green";
        String actualResult = detective.detect(520);
        if (expectedResult == actualResult) {
            System.out.println("Green test passed");
        } else {
            System.out.println("Violet test failed");
        }
    }

    void detectingYellow() {
        LightColorDetector detective = new LightColorDetector();
        String expectedResult = "Yellow";
        String actualResult = detective.detect(580);
        if (expectedResult == actualResult) {
            System.out.println("Yellow test passed");
        } else {
            System.out.println("Yellow test failed");
        }
    }

    void detectingOrange() {
        LightColorDetector detective = new LightColorDetector();
        String expectedResult = "Orange";
        String actualResult = detective.detect(611);
        if (expectedResult == actualResult) {
            System.out.println("Orange test passed");
        } else {
            System.out.println("Orange test failed");
        }
    }

    void detectingRed() {
        LightColorDetector detective = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = detective.detect(747);
        if (expectedResult == actualResult) {
            System.out.println("Red test passed");
        } else {
            System.out.println("Red test failed");
        }
    }

}

