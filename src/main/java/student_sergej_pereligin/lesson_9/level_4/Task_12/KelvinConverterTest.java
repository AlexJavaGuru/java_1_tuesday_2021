package student_sergej_pereligin.lesson_9.level_4.Task_12;


public class KelvinConverterTest {
    public static void main(String[] args) {
        KelvinConverterTest kelvinConverterTest = new KelvinConverterTest();
        kelvinConverterTest.converterTest();
    }


    public void converterTest() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double actualRes = kelvinConverter.convert(40);
        double expectedRes = 313.15;
        checkRes(actualRes, expectedRes, "converterTest");

    }

    public void checkRes(double expectedRes, double actualRes, String testName) {
        if (expectedRes == actualRes) {
            System.out.println("Test " + testName + " passed.");
        } else {
            System.out.println("Test " + testName + " failed");
        }
    }

}
