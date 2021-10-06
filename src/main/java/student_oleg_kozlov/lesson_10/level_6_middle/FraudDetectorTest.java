package student_oleg_kozlov.lesson_10.level_6_middle;

// Task_30, Task_31, Task_32
class FraudDetectorTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private FraudRule[] fraudRules = {
            new FraudRule1("Rule1"),
            new FraudRule2("Rule2"),
            new FraudRule3("Rule3"),
            new FraudRule4("Rule4"),
            new FraudRule5("Rule5"),
    };

    private FraudDetector fraudDetector = new FraudDetector(fraudRules);

    public static void main(String[] args) {
        FraudDetectorTest testRunner = new FraudDetectorTest();
        testRunner.isFraudTestPokemon();
        testRunner.isFraudTestNotPokemon();
        testRunner.isFraudTestAmountRuleBreach();
        testRunner.isFraudTestAmountRuleOk();
        testRunner.isFraudTestCity();
        testRunner.isFraudTestCountry();
        testRunner.isFraudTestCountryAndAmount();
        testRunner.printFooter();
    }

    private void isFraudTestPokemon() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Pokemon", "City1", "Country1"), 0);
        checkResult(new FraudDetectionResult(true, "Rule1"), fraudDetector.isFraud(transaction),"isFraudTestPokemon");
    }

    private void isFraudTestNotPokemon() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Pokemon111", "City1", "Country1"), 0);
        checkResult(new FraudDetectionResult(false, null), fraudDetector.isFraud(transaction),"isFraudTestNotPokemon");
    }

    private void isFraudTestAmountRuleBreach() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Name2", "city", "Mambey"), 1000001);
        checkResult(new FraudDetectionResult(true, "Rule2"), fraudDetector.isFraud(transaction), "isFraudTestAmountRuleBreach");
    }

    private void isFraudTestAmountRuleOk() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Name2", "city", "Mambey"), 1000000);
        checkResult(new FraudDetectionResult(false, null), fraudDetector.isFraud(transaction), "isFraudTestAmountRuleOk");
    }

    private void isFraudTestCity() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Name1", "Sidney", "Country1"), 0);
        checkResult(new FraudDetectionResult(true, "Rule3"), fraudDetector.isFraud(transaction),"isFraudTestCity");
    }

    private void isFraudTestCountry() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Name1", "City1", "Ямайка"), 0);
        checkResult(new FraudDetectionResult(true, "Rule4"), fraudDetector.isFraud(transaction),"isFraudTestCountry");
    }

    private void isFraudTestCountryAndAmount() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Name1", "City1", "Germany"), 1001);
        checkResult(new FraudDetectionResult(true, "Rule5"), fraudDetector.isFraud(transaction),"isFraudTestCountryAndAmount");
    }

    private static void checkResult(FraudDetectionResult expected, FraudDetectionResult actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(TEXT_GREEN + testName + " - passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testName + " - failed");
            System.out.println("Expected: " + expected);
            System.out.println("Actual:   " + actual + TEXT_RESET);
            totalFailed++;
        }
    }

    private void printFooter() {
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
}
