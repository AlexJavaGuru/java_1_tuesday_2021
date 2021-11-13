package student_oleg_kozlov.lesson_10.level_7_senior;

// Task_35
class MobilePhoneTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    public static void main(String[] args) {
        shouldNotCreateMobilePhoneTest();
        shouldCreateMobilePhoneTestCase1();
        shouldCreateMobilePhoneTestCase2();
        shouldCreateMobilePhoneTestCase3();
        shouldCreateMobilePhoneTestCase4();
        shouldCreateMobilePhoneTestCase5();
        printFooter();
    }

    private static void shouldNotCreateMobilePhoneTest() {
        totalRun++;
        MobilePhone phone = new MobilePhone.MobilePhoneBuilder("").build();
        checkResult(null, phone, "shouldNotCreateMobilePhoneTest");
    }

    private static void shouldCreateMobilePhoneTestCase1() {
        totalRun++;
        MobilePhoneFields expectedFields = new MobilePhoneFields("Model1", null, 0, null, 0);
        MobilePhone phone = new MobilePhone.MobilePhoneBuilder("Model1").build();
        checkResult(expectedFields, phone, "shouldCreateMobilePhoneTestCase1");
    }

    private static void shouldCreateMobilePhoneTestCase2() {
        totalRun++;
        MobilePhoneFields expectedFields = new MobilePhoneFields("Model1", "black", 0, null, 0);
        MobilePhone phone = new MobilePhone.MobilePhoneBuilder("Model1").withColor("black").build();
        checkResult(expectedFields, phone, "shouldCreateMobilePhoneTestCase2");
    }

    private static void shouldCreateMobilePhoneTestCase3() {
        totalRun++;
        MobilePhoneFields expectedFields = new MobilePhoneFields("Model1", "black", 200, null, 0);
        MobilePhone phone = new MobilePhone.MobilePhoneBuilder("Model1").withColor("black").withPrice(200).build();
        checkResult(expectedFields, phone, "shouldCreateMobilePhoneTestCase3");
    }

    private static void shouldCreateMobilePhoneTestCase4() {
        totalRun++;
        MobilePhoneFields expectedFields = new MobilePhoneFields("Model1", "black", 200, "Android", 0);
        MobilePhone phone = new MobilePhone.MobilePhoneBuilder("Model1").withColor("black").withPrice(200).withOperationSystem("Android").build();
        checkResult(expectedFields, phone, "shouldCreateMobilePhoneTestCase4");
    }

    private static void shouldCreateMobilePhoneTestCase5() {
        totalRun++;
        MobilePhoneFields expectedFields = new MobilePhoneFields("Model1", "black", 200, "Android", 128);
        MobilePhone phone = new MobilePhone.MobilePhoneBuilder("Model1").withColor("black").withPrice(200).withOperationSystem("Android").withRam(128).build();
        checkResult(expectedFields, phone, "shouldCreateMobilePhoneTestCase5");
    }

    private static void checkResult(MobilePhoneFields expected, MobilePhone actual, String testName) {
        if (fieldsAreEqual(expected, actual)) {
            System.out.println(TEXT_GREEN + testName + " - passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testName + " - failed");
            System.out.println("Expected: " + expected);
            System.out.println("Actual:   " + actual + TEXT_RESET);
            totalFailed++;
        }
    }

    private static void printFooter() {
        System.out.println("********************************************");
        if (totalFailed > 0) {
            System.out.println(TEXT_RED + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        } else {
            System.out.println(TEXT_GREEN + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        }
        System.out.println("********************************************");
    }

    private static boolean fieldsAreEqual(MobilePhoneFields expected, MobilePhone actual) {
        if (expected == null && actual == null) {
            return true;
        }
        if (expected == null || actual == null) {
            return false;
        }
        return stringsAreEqual(expected.getModel(), actual.getModel()) &&
                stringsAreEqual(expected.getColor(), actual.getColor()) &&
                expected.getPrice() == actual.getPrice() &&
                stringsAreEqual(expected.getOperationSystem(), actual.getOperationSystem()) &&
                expected.getRam() == actual.getRam();
    }

    private static boolean stringsAreEqual(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return true;
        }
        if (str1 == null || str2 == null) {
            return false;
        }
        return str1.equals(str2);
    }
}
