package student_einars_marhilevics.lesson_10.level_6;

class FraudDetector {

    private final FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        boolean isFraud = false;
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(t)) {
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }

}
