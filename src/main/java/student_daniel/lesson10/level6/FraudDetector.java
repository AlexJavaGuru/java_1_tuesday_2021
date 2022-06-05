package student_daniel.lesson10.level6;

class FraudDetector {
    //Task 30 31 32 33
    private FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                return new FraudDetectionResult(true, fraudRule.getRuleName(), t.getTrader().getFullName(), t.getTrader().getCity(),t.getTrader().getCountry());
            }
        }
        return new FraudDetectionResult(false, "Out of Fraud Rules", null,null,null);
    }
}
