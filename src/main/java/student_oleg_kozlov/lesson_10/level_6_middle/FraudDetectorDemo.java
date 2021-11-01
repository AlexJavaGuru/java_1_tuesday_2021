package student_oleg_kozlov.lesson_10.level_6_middle;

// Task_33
class FraudDetectorDemo {

    public static void main(String[] args) {
        FraudRule[] fraudRules = {
                new FraudRule1("Rule1"),
                new FraudRule2("Rule2"),
                new FraudRule3("Rule3"),
                new FraudRule4("Rule4"),
                new FraudRule5("Rule5"),
        };
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Transaction transaction = new Transaction(new Trader("Pokemon", "City1", "Country1"), 0);

        FraudDetectionResult result = fraudDetector.isFraud(transaction);
    }
}
