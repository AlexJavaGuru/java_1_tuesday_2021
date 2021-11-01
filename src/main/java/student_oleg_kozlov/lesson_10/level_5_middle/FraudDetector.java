package student_oleg_kozlov.lesson_10.level_5_middle;

// Task_29
class FraudDetector {

    private final FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {
        boolean isFraud = false;
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}
