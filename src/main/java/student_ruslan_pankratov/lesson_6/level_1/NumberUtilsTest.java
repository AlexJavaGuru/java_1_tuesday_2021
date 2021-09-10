package student_ruslan_pankratov.lesson_6.level_1;

//Task_6
class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.resultFalse();
    }

    public void resultFalse() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.isEven(3);
        boolean expectedResult = false;

        if (result == expectedResult) {
            System.out.println("Test resultFalse = OK ");
        } else {
            System.out.println("Test resultFalse = FAIL");
        }
    }

    public void resultTrue() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.isEven(2);
        boolean expectedResult = true;
        if (result == expectedResult) {
            System.out.println("Test resultTrue = OK");
        } else {
            System.out.println("Test resultTrue = FAIl");
        }
    }
}
