package student_einars_marhilevics.lesson_10.level_6;

class FraudDetectorTest {

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
        testRunner.isFraudTestCity();
        testRunner.isFraudTestCountryAndAmount();
        testRunner.isFraudTestAmount();
    }

    private void isFraudTestPokemon() {
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Transaction transaction = new Transaction(new Trader("Pokemon", "City1", "Country1"), 0);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        checkResult(result.isFraud(),"isFraudTestPokemon");
    }

    private void isFraudTestNotPokemon() {
        Transaction transaction = new Transaction(new Trader("Pokemon111", "City1", "Country1"), 0);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        checkResult(!result.isFraud(),"isFraudTestNotPokemon");
    }

    private void isFraudTestCity() {
        Transaction transaction = new Transaction(new Trader("Name1", "Sidney", "Country1"), 0);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        checkResult(result.isFraud(),"isFraudTestCity");
    }

    private void isFraudTestCountryAndAmount() {
        Transaction transaction = new Transaction(new Trader("Name1", "Sidney", "Germany"), 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        checkResult(result.isFraud(),"isFraudTestCountryAndAmount");
    }

    private void isFraudTestAmount() {
        Transaction transaction = new Transaction(new Trader("Name2", "city", "Mambey"), 1000001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        checkResult(result.isFraud(), "isFraudTestAmount");
    }


    private void checkResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " - passed");
        } else {
            System.out.println(testName + " - failed");
            }
    }


}
