package student_oleg_kozlov.lesson_10.level_6_middle;

// Task_30, Task_32, Task_33
class FraudDetector {

    private final FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        boolean isFraud = false;
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(t)) {
                System.out.println("Transaction: " + t);
                System.out.println("Breaches rule: " + rule.getRuleName());
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }
}
