package student_einars_marhilevics.lesson_10.level_5;

class FraudDetector {

    private final FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
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
