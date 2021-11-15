package student_daniel.lesson10.level5;

class FraudDetector {
    //Task 22 23 24 25 26 27 28 29
    private FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {
        boolean isFraud = false;
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}
