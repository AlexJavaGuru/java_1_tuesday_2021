package student_ruslan_pankratov.lesson_4.level_5;

//Task_16
class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectTest();
        lightColorDetectorTest.detectTestBlue();
        lightColorDetectorTest.detectTestViolet();
        lightColorDetectorTest.detectTestGreen();
        lightColorDetectorTest.detectTestOrange();
        lightColorDetectorTest.detectTestYellow();
        lightColorDetectorTest.detectTestRed();
    }


    public void detectTest() {
        int number = 100;
        String expectedResult = "Invisible Light";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realReasult = lightColorDetector.detect(number);

        if (expectedResult == realReasult) {
            System.out.println("Detectet test = OK");
        } else {
            System.out.println("Detectet test = FAIL");
        }
    }

    public void detectTestViolet() {
        int number = 400;
        String expectedResult = "Violet";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realReasult = lightColorDetector.detect(number);

        if (expectedResult == realReasult) {
            System.out.println("Detectet test = OK");
        } else {
            System.out.println("Detectet test = FAIL");
        }
    }

    public void detectTestBlue() {
        int number = 460;
        String expectedResult = "Blue";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realReasult = lightColorDetector.detect(number);

        if (expectedResult == realReasult) {
            System.out.println("Detectet test = OK");
        } else {
            System.out.println("Detectet test = FAIL");
        }
    }

    public void detectTestGreen() {
        int number = 500;
        String expectedResult = "Green";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realReasult = lightColorDetector.detect(number);

        if (expectedResult == realReasult) {
            System.out.println("Detectet test = OK");
        } else {
            System.out.println("Detectet test = FAIL");
        }
    }

    public void detectTestYellow() {
        int number = 580;
        String expectedResult = "Yellow";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realReasult = lightColorDetector.detect(number);

        if (expectedResult == realReasult) {
            System.out.println("Detectet test = OK");
        } else {
            System.out.println("Detectet test = FAIL");
        }
    }

    public void detectTestOrange() {
        int number = 600;
        String expectedResult = "Orange";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realReasult = lightColorDetector.detect(number);

        if (expectedResult == realReasult) {
            System.out.println("Detectet test = OK");
        } else {
            System.out.println("Detectet test = FAIL");
        }
    }

    public void detectTestRed() {
        int number = 723;
        String expectedResult = "Red";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realReasult = lightColorDetector.detect(number);

        if (expectedResult == realReasult) {
            System.out.println("Detectet test = OK");
        } else {
            System.out.println("Detectet test = FAIL");
        }
    }
}
